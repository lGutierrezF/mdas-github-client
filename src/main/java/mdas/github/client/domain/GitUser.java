package mdas.github.client.domain;

public class GitUser {
    private String login;

    public GitUser(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
