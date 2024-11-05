import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    @Test
    public void test() {
        String name = "John Doe";
        String address = "123 Main Street";
        Person person = new Person(name, address);
        assertEquals(name,person.name());
        assertEquals(address,person.address());
    }
    @Test
    public void test2() {
        String name = "John Doe";
        String address = "123 Main Street";
        Person person1 = new Person(name, address);
        Person person2 = new Person(name, address);
        assertEquals(person1.hashCode(),person2.hashCode());
    }
    @Test
    public void test3() {
        String name = "John Doe";
        String address = "123 Main Street";
        Person person1 = new Person(name, address);
        Person person2 = new Person(name, address);
        assertTrue(person1.equals(person2));
    }
}
