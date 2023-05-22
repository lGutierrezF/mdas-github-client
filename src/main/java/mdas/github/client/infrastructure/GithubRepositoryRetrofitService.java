package mdas.github.client.infrastructure;

import mdas.github.client.domain.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface GithubRepositoryRetrofitService {
    @GET("/users/{username}")
    Call<GitUserMonthlyData> getUser(@Header("Authorization") String accessToken,
                                     @Header("Accept") String apiVersionSpec, @Path("username") String username);
    @GET("/orgs/{username}/teams")
    Call<GitUserMonthlyData> getOrgTeams(@Header("Authorization") String accessToken,
                                     @Header("Accept") String apiVersionSpec, @Path("username") String username);
    @GET("/orgs/{username}/teams/{teamName}/members")
    Call<GitUserMonthlyData> getTeamMembers(@Header("Authorization") String accessToken,
                                         @Header("Accept") String apiVersionSpec,
                                         @Path("username") String username,
                                         @Path("teamName") String teamName);
    @GET("/orgs/{org}/repos")
    Call<List<GitOrgRepo>> getOrgRepos(@Header("Authorization") String accessToken,
                                       @Header("Accept") String apiVersionSpec, @Path("org") String org);
    @GET("/search/issues")
    public Call<GitUserPullRequestComments> getUserPullRequestComments(
            @Query("q") String query);

    @GET("/search/issues")
    public Call<GitUserExecutedPullRequests> getUserExecutedPullRequests(
            @Query("q") String query);

    @GET("/search/issues")
    public Call<GitUserReviewedPullRequests> getUserReviewedPullRequests(
            @Query("q") String query);

    @GET("/repos/{org}/{repo}/commits")
    public Call<List<GitUserCommit>> getUserCommits(
            @Header("Authorization") String accessToken,
            @Header("Accept") String apiVersionSpec,
            @Path("org") String org,
            @Path("repo") String repo,
            @Query("since") String startMonth,
            @Query("until") String endMonth);

    @GET("/repos/{username}/{repo}/commits/{sha}")
    public Call<GitUserCommit> getUserCommitStats(
            @Header("Authorization") String accessToken,
            @Header("Accept") String apiVersionSpec,
            @Path("username") String username,
            @Path("repo") String repo,
            @Path("sha") String sha);

    @GET("/repos/{username}/{repo}/commits/{sha}")
    public Call<GitUser> getCommiter(
            @Header("Authorization") String accessToken,
            @Header("Accept") String apiVersionSpec,
            @Path("username") String username,
            @Path("repo") String repo,
            @Path("sha") String sha);
}
