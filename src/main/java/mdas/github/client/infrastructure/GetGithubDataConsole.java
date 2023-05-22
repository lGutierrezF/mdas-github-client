package mdas.github.client.infrastructure;

import mdas.github.client.application.CreateGitUserMonthlyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetGithubDataConsole implements CommandLineRunner {
    @Autowired
    MongoRepositoryService mongoClient;
    CreateGitUserMonthlyData createGitUserMonthlyData = new CreateGitUserMonthlyData();
    @Override
    public void run(String... args) throws Exception {
        var githubClient = new GithubClient();
        //var user = githubClient.getUser("lGutierrezF");
        //var repos =  githubClient.getUserRepos("github-stats-test");
        //var comments =  githubClient.getUserPullRequestComments("octocat","2016-09");
        //var pr =  githubClient.getUserReviewedPullRequests("octocat","2016-09");
        //System.out.println(comments.getCommentAvgLenght());
        //var exPR =  githubClient.getUserExecutedPullRequests("octocat","2016-09");
        var commits =  githubClient.getUserCommits("octocat","octocat.github.io","11","2015");
        //var data = createGitUserMonthlyData.execute("octocat","2016-11",pr,exPR,comments,commits);
        //mongoClient.save(data);
        /*for (var customer : mongoClient.findByLoginDate("octocat","2020-11")) {
            System.out.println(customer);
        }*/
        //System.out.println(comments.getCommentAvgLenght());
    }
}
