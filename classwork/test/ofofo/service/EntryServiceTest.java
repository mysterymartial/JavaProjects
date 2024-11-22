package ofofo.service;

import diary.Diary;
import models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.EntryRepository;
import repositories.EntryRepositoryImplementation;
import service.EntryServices;
import service.EntryServicesImplementation;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class EntryServiceTest {
    private EntryServices service;

    @BeforeEach
    public void setUp() throws Exception {
        service = new EntryServicesImplementation();
    }
    @Test
    public void testThatEntryCanBeCreated() {
        assertEquals("Entry created", service.createEntry("title","body",1));
    }
    @Test
    public void testThatEntryCanBeUpdated() {
        service.createEntry("title","body",1);
        assertEquals("Entry Successfully Updated", service.updateEntry(1,"new title","new body"));
    }
    @Test
    public void testYouCanFindAllEntries() {
        service.createEntry("title","body",1);
        service.createEntry("title2`","body2",2);

        List<Entry> entries = service.getAllEntries();
        assertTrue(entries.size() > 0);
        assertEquals(2,service.getAllEntries().size());
        assertTrue(entries.stream().anyMatch(entry -> entry.getTitle().equals("title2`")));
        assertTrue(entries.stream().anyMatch(entry -> entry.getTitle().equals("title")));
    }
    @Test
    public void testThatEntryCanFoundById() {
        service.createEntry("title","body",1);
        Entry entry = service.getEntryById(1);

        assertNotNull(entry);
        assertEquals(1,entry.getId());
        assertEquals("title",entry.getTitle());
    }
    @Test
    public void testThatEntryCanNotFoundByTitle() {
        service.createEntry("title","body",1);
        Entry entry = service.getEntryByTitle("title");
        assertNotNull(entry);
        assertEquals(1,service.getAllEntries().stream().count());
        assertEquals("title",entry.getTitle());
    }
    @Test
    public void testThatEntryCanDeletedById() {
        service.createEntry("title","body",1);
        assertEquals("Entry Successfully Deleted", service.deleteEntryById(1));
    }
    @Test
    public void testThatAnEntryThatDoesNotExistCannotBeDeletedById(){
        service.createEntry("title","body",1);
        assertThrows(NoSuchElementException.class, () -> service.deleteEntryById(2));
    }
    @Test
    public void testThatEntryCanBeDeletedByTitle() {
        service.createEntry("title","body",1);
        assertEquals("Entry Successfully Deleted", service.deleteEntryByTitle("title"));
    }
    @Test
    public void testThatEntryThatDoesNotExistCannotBeDeletedByTilte(){
        service.createEntry("title","body",1);
        assertThrows(NoSuchElementException.class, () -> service.deleteEntryByTitle("title2"));
    }
}
