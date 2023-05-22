package mdas.github.client.domain;


public class GitUserMonthlyData {
    private String login;
    private String date;
    private int reviewedPullRequests;
    private int executedPullRequests;
    private float pullRequestCommentsAvg;
    private int totalLines;
    private int linesAdded;
    private int linesDeleted;

    public GitUserMonthlyData(String login, String date, int reviewedPullRequests, int executedPullRequests, float pullRequestCommentsAvg, int totalLines, int linesAdded, int linesDeleted) {
        this.login = login;
        this.date = date;
        this.reviewedPullRequests = reviewedPullRequests;
        this.executedPullRequests = executedPullRequests;
        this.pullRequestCommentsAvg = pullRequestCommentsAvg;
        this.totalLines = totalLines;
        this.linesAdded = linesAdded;
        this.linesDeleted = linesDeleted;
    }

    /*public GitUserMonthlyData(String login, String date, GitUserReviewedPullRequests reviewedPullRequests,
                              GitUserExecutedPullRequests executedPullRequests,
                              GitUserPullRequestComments pullRequestCommentsAvg, List<GitUserCommit> gitCommit) {
        this.login = login;
        this.date = date;
        this.reviewedPullRequests = reviewedPullRequests.getTotal_count();
        this.executedPullRequests = executedPullRequests.getTotal_count();
        this.pullRequestCommentsAvg = pullRequestCommentsAvg.getCommentAvgLenght();
        this.getTotalCommitStats(gitCommit);
    }*/

    public String getLogin() {
        return login;
    }

    public String getDate() {
        return date;
    }

    public int getReviewedPullRequests() {
        return reviewedPullRequests;
    }

    public int getExecutedPullRequests() {
        return executedPullRequests;
    }

    public float getPullRequestCommentsAvg() {
        return pullRequestCommentsAvg;
    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getLinesAdded() {
        return linesAdded;
    }

    public int getLinesDeleted() {
        return linesDeleted;
    }

}
