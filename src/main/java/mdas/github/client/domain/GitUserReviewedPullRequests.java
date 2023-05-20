package mdas.github.client.domain;

import java.util.List;

public class GitUserReviewedPullRequests {
    private int total_count;

    public GitUserReviewedPullRequests (int total_count) {
        this.total_count = total_count;
    }
    private int getTotal_count() {
        return total_count;
    }

}
