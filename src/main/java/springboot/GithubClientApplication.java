package springboot;

import mdas.github.client.infrastructure.GithubClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;


@ComponentScan(basePackages = {"mdas.github.client"})
@SpringBootApplication
public class GithubClientApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(GithubClientApplication.class, args);
		var githubClient = new GithubClient();
		//var user = githubClient.getUser("lGutierrezF");
		//var repos =  githubClient.getUserRepos("octocat");
		//var comments =  githubClient.getUserPullRequestComments("octocat","2016-09-27");
		var pr =  githubClient.getUserReviewedPullRequests("octocat","2016-09-27");
		//System.out.println(comments.getCommentAvgLenght());
		//var comments =  githubClient.getUserExecutedPullRequests("octocat","2016-09");
		//var commits =  githubClient.getUserCommits("octocat","octocat.github.io","11","2015");
	}

}
