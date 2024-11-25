package africa.semicolon.data.repository;

import africa.semicolon.data.model.Packages;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends MongoRepository<Packages, String> {
//    public Packages findByName(String name);
}
