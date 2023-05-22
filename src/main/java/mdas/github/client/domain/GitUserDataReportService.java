package mdas.github.client.domain;

import java.util.List;

public interface GitUserDataReportService {
    boolean findOrgMonthlyReport(String org, String date);
    List<GitUserMonthlyData> searchOrgMonthlyReports(String org, String date);
    void createOrgMontlyReport(GitUserMonthlyData data);
}
