package data.repository;

import data.model.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceiverRepository extends MongoRepository<Receiver, String> {
}
