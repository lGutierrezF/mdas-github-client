package mdas.github.client.domain;

import java.io.IOException;
import java.util.List;

public interface GitUserRepositoryService {
    GitUserMonthlyData getUser(String username) throws IOException;
    List<GitOrgRepo> getUserRepos(String username) throws IOException;

    GitUserPullRequestComments getUserPullRequestComments(String username, String month) throws IOException;

    GitUserExecutedPullRequests getUserExecutedPullRequests(String username, String month) throws IOException;
    GitUserReviewedPullRequests getUserReviewedPullRequests(String username, String month) throws IOException;

    List<GitUserCommit> getUserCommits (String username, String repo, String month, String year) throws IOException;

    GitCommitStats getCommitStatistics (String username, String repo, String sha) throws IOException;
}
