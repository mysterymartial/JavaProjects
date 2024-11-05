package ofofo.service;

import diary.Diary;
import diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.EntryRepository;
import repositories.EntryRepositoryImplementation;
import service.EntryServicesImplementation;

public class EntryServiceTest {
    private EntryServicesImplementation entryServices;
    private EntryRepository entryRepository;

    @BeforeEach
    public void setUp() throws Exception {
        entryRepository = new EntryRepositoryImplementation();
        entryServices = new EntryServicesImplementation();


    }
//    @Test
//    public void testAddEntry() {
//        Entry entry = new Entry("first title","crazy boy",1);
//        Entry entry2 = new Entry("second title","crazy boy",2);
//        entryServices.addEntry(entry);
//    }
}
