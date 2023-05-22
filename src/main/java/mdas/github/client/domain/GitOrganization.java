package mdas.github.client.domain;

import java.util.Set;

public class GitOrganization {
    private String name;
    private Set<GitTeam> teams;
    private Set<GitOrgRepo> repos;
    private Set<GitUserMonthlyData> userMonthlyData;
 }
