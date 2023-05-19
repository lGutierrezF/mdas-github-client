package mdas.github.client.infrastructure;

import mdas.github.client.application.MonthConstraintsCalculator;
import mdas.github.client.domain.*;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class GithubClient implements GitUserRepositoryService, GithubRepositoryProperties {
    private String accessToken;
    private GithubRepositoryRetrofitService service;

    public GithubClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.service = retrofit.create(GithubRepositoryRetrofitService.class);
        this.accessToken = System.getenv("ACCESS_TOKEN_GITLAB");
    }

    public GitUserMonthlyData getUser(String username) throws IOException {
        Call<GitUserMonthlyData> retrofitCall = service.getUser(accessToken, API_VERSION_SPEC,username);

        Response<GitUserMonthlyData> response = retrofitCall.execute();
        System.out.println(response.body().getLogin());

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }

    public List<GitUserRepo> getUserRepos(String username) throws IOException {
        Call<List<GitUserRepo>> retrofitCall = service.getUserRepos(accessToken, API_VERSION_SPEC,username);

        Response<List<GitUserRepo>> response = retrofitCall.execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }

    public GitUserPullRequestComments getUserPullRequestComments(String username, String month) throws IOException {
        String query = "type\\:pr+commenter\\:" + username + "+created\\:" + month;
        Call<GitUserPullRequestComments> retrofitCall = service.getUserPullRequestComments(query);

        Response<GitUserPullRequestComments> response = retrofitCall.execute();

        if (!response.isSuccessful())    {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }

    public GitUserExecutedPullRequests getUserExecutedPullRequests(String username, String month) throws IOException {
        String query = "type\\:pr+author\\:" + username + "+created\\:" + month;
        Call<GitUserExecutedPullRequests> retrofitCall = service.getUserExecutedPullRequests(query);

        Response<GitUserExecutedPullRequests> response = retrofitCall.execute();

        if (!response.isSuccessful())    {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }

        return response.body();
    }

    public List<GitUserCommit> getUserCommits (String username, String repo, String month, String year) throws IOException {
        var monthDates = new MonthConstraintsCalculator().execute(month, year);
        Call<List<GitUserCommit>> retrofitCall = service.getUserCommits(accessToken, API_VERSION_SPEC, username,
                repo, monthDates.get(0).toString(), monthDates.get(1).toString());

        Response<List<GitUserCommit>> response = retrofitCall.execute();
        List<GitUserCommit> commits = response.body();
        for (int i = 0; i < commits.size()-1; i++) {
            String sha = commits.get(i).getSha();
            commits.get(i).setStats(this.getCommitStatistics(username,repo,sha));
        }
        commits.get(0).setStats(this.getCommitStatistics(username,repo,commits.get(0).getSha()));
        if (!response.isSuccessful())    {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return commits;
    }

    public GitCommitStats getCommitStatistics (String username, String repo, String sha) throws IOException {
        Call<GitUserCommit> retrofitCall = service.getUserCommitStats(accessToken, API_VERSION_SPEC,username,repo, sha);
        Response<GitUserCommit> response = retrofitCall.execute();

        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body().getStats();
    }
}
