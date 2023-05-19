package mdas.github.client.domain;

public class GitUserRepo {
    private int id;
    private String name;

    public GitUserRepo(int id, String name) {
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
