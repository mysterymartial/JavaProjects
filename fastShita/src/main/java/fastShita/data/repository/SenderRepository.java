package data.repository;

import data.model.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SenderRepository extends MongoRepository<Sender, String> {
}
