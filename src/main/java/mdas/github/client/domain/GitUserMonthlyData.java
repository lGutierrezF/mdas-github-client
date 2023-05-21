package mdas.github.client.domain;

public class GitUserMonthlyData {
    private String login;
    private String date;
    private GitUserReviewedPullRequests reviewedPullRequests;
    private GitUserExecutedPullRequests executedPullRequests;
    private GitUserPullRequestComments pullRequestComments;
    private GitCommitStats gitCommitStats;

    public GitUserMonthlyData(String login, String date, GitUserReviewedPullRequests reviewedPullRequests,
                              GitUserExecutedPullRequests executedPullRequests,
                              GitUserPullRequestComments pullRequestComments, GitCommitStats gitCommitStats) {
        this.login = login;
        this.date = date;
        this.reviewedPullRequests = reviewedPullRequests;
        this.executedPullRequests = executedPullRequests;
        this.pullRequestComments = pullRequestComments;
        this.gitCommitStats = gitCommitStats;
    }

    public String getLogin() {
        return login;
    }

    public String getDate() {
        return date;
    }

    public GitUserReviewedPullRequests getReviewedPullRequests() {
        return reviewedPullRequests;
    }

    public GitUserExecutedPullRequests getExecutedPullRequests() {
        return executedPullRequests;
    }

    public GitUserPullRequestComments getPullRequestComments() {
        return pullRequestComments;
    }

    public GitCommitStats getGitCommitStats() {
        return gitCommitStats;
    }

}
