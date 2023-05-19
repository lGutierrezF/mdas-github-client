package mdas.github.client.domain;

import java.util.List;

public class GitUserExecutedPullRequests {
    private int total_count;
    private List<GitUserComment> items;

    public GitUserExecutedPullRequests(int total_count, List<GitUserComment> items) {
        this.total_count = total_count;
        this.items = items;
    }

    public int getTotal_count() {
        return total_count;
    }

    public List<GitUserComment> getItems() {
        return items;
    }
}
