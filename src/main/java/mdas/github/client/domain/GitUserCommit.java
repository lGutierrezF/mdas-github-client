package mdas.github.client.domain;

public class GitUserCommit {
    private String sha;
    private GitCommitStats stats;

    public GitUserCommit(String sha, GitCommitStats stats) {
        this.sha = sha;
        this.stats = stats;
    }
    public String getSha() {
        return sha;
    }
    public GitCommitStats getStats() {
        return stats;
    }
    public void setStats(GitCommitStats stats) {
        this.stats = stats;
    }
}
