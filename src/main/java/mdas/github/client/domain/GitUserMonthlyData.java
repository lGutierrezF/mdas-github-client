package mdas.github.client.domain;

public class GitUserMonthlyData {
    private String login;
    private String date;
    public GitUserMonthlyData(String login) {
        this.login = login;
    }
    public String getLogin() {
        return login;
    }
}
