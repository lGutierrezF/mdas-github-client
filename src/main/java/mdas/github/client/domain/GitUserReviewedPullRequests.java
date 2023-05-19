package mdas.github.client.domain;

import java.util.List;

public class GitUserReviewedPullRequests {
    private int total_count;
    private List<GitUserComment> items;

    public GitUserReviewedPullRequests (int total_count, List<GitUserComment> items) {
        this.total_count = total_count;
        this.items = items;
    }
    public int getCommentAvgLenght(){
        int totalLength = 0;
        for (GitUserComment comment: this.getItems()) {
            totalLength+=comment.getCommentLength();
        }
        return totalLength/this.getTotal_count();
    }
    private int getTotal_count() {
        return total_count;
    }

    private List<GitUserComment> getItems() {
        return items;
    }
}
