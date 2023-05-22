package mdas.github.client.domain;

public class GitUserReviewedPullRequests {
    private int total_count;

    public GitUserReviewedPullRequests (int total_count) {
        this.total_count = total_count;
    }
    public int getTotal_count() {
        return total_count;
    }

}
