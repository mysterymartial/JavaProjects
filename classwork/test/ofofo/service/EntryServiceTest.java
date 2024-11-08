package ofofo.service;

import diary.Diary;
import diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.EntryRepository;
import repositories.EntryRepositoryImplementation;
import service.EntryServices;
import service.EntryServicesImplementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        assertTrue(service.getAllEntries().contains("title"));
    }
}
