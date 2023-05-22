package mdas.github.client.domain;

public class GitOrgRepo {
    private int id;
    private String name;

    public GitOrgRepo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
