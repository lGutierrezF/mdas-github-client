package mdas.github.client.domain;

public class GitUserCommit {
    private String sha;
    private GitCommitStats stats;
    private GitUser committer;

    public GitUserCommit(String sha, GitCommitStats stats, GitUser commiter) {
        this.sha = sha;
        this.stats = stats;
        this.committer = commiter;
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
    public String getCommiter(){
        return this.committer.getLogin();
    }
    public void setCommiter(GitUser commiter) {
        this.committer = commiter;
    }
}
