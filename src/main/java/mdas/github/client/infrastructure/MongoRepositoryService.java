package mdas.github.client.infrastructure;

import mdas.github.client.domain.GitUserMonthlyData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MongoRepositoryService extends MongoRepository<GitUserMonthlyData, String>{
    @Query("{login:'?0',date: '?1'}")
    public List<GitUserMonthlyData> findByLoginDate(String login, String date);
    //public List<GitUserMonthlyData> findByOrg(String lastName);
}
