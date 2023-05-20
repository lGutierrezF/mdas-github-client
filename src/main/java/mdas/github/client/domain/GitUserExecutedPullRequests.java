package mdas.github.client.domain;

import java.util.List;

public class GitUserExecutedPullRequests {
    private int total_count;

    public GitUserExecutedPullRequests(int total_count, List<GitUserComment> items) {
        this.total_count = total_count;
    }

    public int getTotal_count() {
        return total_count;
    }

}
