package mdas.github.client.domain;

public class GitCommitStats {
    private int total;
    private int additions;
    private int deletions;

    public GitCommitStats(int total, int additions, int deletions) {
        this.total = total;
        this.additions = additions;
        this.deletions = deletions;
    }

    public int getTotal() {
        return total;
    }

    public int getAdditions() {
        return additions;
    }

    public int getDeletions() {
        return deletions;
    }
}
