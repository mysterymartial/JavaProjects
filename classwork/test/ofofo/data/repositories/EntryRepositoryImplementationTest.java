package ofofo.data.repositories;

import models.Diary;
import models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.EntryRepository;
import repositories.EntryRepositoryImplementation;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntryRepositoryImplementationTest {
    private EntryRepository entryRepository;
    @BeforeEach
    public void setUp() {
        entryRepository = new EntryRepositoryImplementation();
    }
    @Test
    public void testEntriesCanBeSaved() {
        Entry entry1 = new Entry(1, "First Title", "First Body");
        entryRepository.save(entry1);
        Entry savedEntry = entryRepository.findById(entry1.getId());
        assertNotNull(savedEntry);
        assertEquals("First Title", savedEntry.getTitle());
        assertEquals("First Body", savedEntry.getBody());
    }
    @Test
    public void testEntriesCanBeUpdatedAndWillBeSavedToRepositoryLocation() {
        Entry entry = new Entry(1, "First Title", "First Body");
        entryRepository.save(entry);
        Entry updatedEntry = new Entry(entry.getId(), "Second Title", "Second Body");
        entryRepository.save(updatedEntry);
        Entry savedEntry = entryRepository.findById(updatedEntry.getId());
        assertNotNull(savedEntry);
        assertEquals("Second Title", savedEntry.getTitle());
        assertEquals("Second Body", savedEntry.getBody());
    }
    @Test
    public void testEntriesCanBeDeletedByID() {
        Entry entry1 = new Entry(1, "First Title", "First Body");
        entryRepository.save(entry1);
        entryRepository.deleteById(entry1.getId());
        Entry savedEntry = entryRepository.findById(entry1.getId());
        assertNull(savedEntry);
    }
    @Test
    public void testEntriesCanBeDeletedByTitle() {
        Entry entry1 = new Entry(1, "First Title", "First Body");
        entryRepository.save(entry1);
        Entry entry2 = new Entry(2, "Second Title", "Second Body");
        entryRepository.save(entry2);
        entryRepository.deleteByTitle("First Title");
        Entry reaminingEntry = entryRepository.findById(entry2.getId());
        assertNotNull(reaminingEntry);
        assertEquals("Second Title", reaminingEntry.getTitle());
        Entry deletedEntry = entryRepository.findById(entry1.getId());
        assertNull(deletedEntry);
    }
    @Test
    public void testUpdateEntriesFunctionality(){
        Entry entry1 = new Entry(1, "First Title", "First Body");
        entryRepository.save(entry1);
        assertNotNull(entry1);
        Entry updateEntry = new Entry(entry1.getId(), "Second Title", "Second Body");
        entryRepository.save(updateEntry);
        assertNotNull(entry1);
        assertEquals("Second Title", entry1.getTitle());
        assertEquals("Second Body", entry1.getBody());

    }
    @Test
    public void testFindEntriesByTitleFunctionality() {
        Entry entry1 = new Entry(1, "First Title", "First Body");
        entryRepository.save(entry1);
        assertNotNull(entry1);
        assertEquals("First Title", entry1.getTitle());
        assertNull(entryRepository.findByTitle("Non Existent Title"));
    }

}