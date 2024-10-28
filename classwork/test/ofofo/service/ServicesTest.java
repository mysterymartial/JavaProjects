package ofofo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.DiaryRepository;
import repositories.EntryRepository;
import service.ServiceImplementation;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;

public class ServicesTest {
    private ServiceImplementatio services;
    private DiaryRepository diaryRepository;
    private EntryRepository entryRepository;
@BeforeEach
    public void setUp() {
    diaryRepository = mock(DiaryRepository.class);
    entryRepository = mock(EntryRepository.class);
    services = new ServiceImplementation(diaryRepository,entryRepository);

}
@Test
    public void testRegisterSuccessfully() {
    services.registerUser("user1","password1");
    verify(diaryRepository,entryRepository);
}
}
