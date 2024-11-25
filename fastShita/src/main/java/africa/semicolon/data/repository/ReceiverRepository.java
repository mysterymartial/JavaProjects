package africa.semicolon.data.repository;

import africa.semicolon.data.model.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceiverRepository extends MongoRepository<Receiver, String> {
}
