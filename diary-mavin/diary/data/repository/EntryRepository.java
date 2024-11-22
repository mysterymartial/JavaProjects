package data.repository;

import com.mongodb.client.MongoDatabase;
import data.model.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EntryRepository extends MongoRepository<Entry, String> {
    Entry findByDiaryIdAndEntryId(String diaryId, String entryId);
    void deleteByDiaryIdAndEntryId(String diaryId);
}
