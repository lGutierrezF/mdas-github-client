package mdas.github.client.application;


import mdas.github.client.domain.*;

import java.util.ArrayList;
import java.util.List;

public final class CreateGitUserMonthlyData {
    public CreateGitUserMonthlyData(){}
    public GitUserMonthlyData execute(String login, String date, GitUserReviewedPullRequests reviewedPullRequests,
                                      GitUserExecutedPullRequests executedPullRequests,
                                      GitUserPullRequestComments pullRequestCommentsAvg, List<GitUserCommit> gitCommit){
        var lineStats = getTotalCommitStats(gitCommit);
        return new GitUserMonthlyData(login,date,reviewedPullRequests.getTotal_count(),executedPullRequests.getTotal_count(),
                pullRequestCommentsAvg.getCommentAvgLenght(), lineStats.get(0),lineStats.get(1),lineStats.get(2));
    }
    private List<Integer> getTotalCommitStats(List<GitUserCommit> gitCommit){
        int total = 0;
        int additions = 0;
        int deletions = 0;
        List<Integer> lineStats = new ArrayList<>();
        for (GitUserCommit stats: gitCommit){
            total+= stats.getStats().getTotal();
            additions += stats.getStats().getAdditions();
            deletions += stats.getStats().getDeletions();
        }
        lineStats.add(total);
        lineStats.add(additions);
        lineStats.add(deletions);
        return lineStats;
    }

}
