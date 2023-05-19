package mdas.github.client.domain;

public class GitUserComment {
    private String  id;
    private String body;
    public GitUserComment(String id, String body) {
        this.id = id;
        this.body = body;
    }
    public int getCommentLength(){
        return this.getBody().length();
    }
    private String getBody() {
        return body;
    }
}
