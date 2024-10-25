package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set<String> set;
    @BeforeEach
    public void setUp() {
        set = new Set<String>();
    }
    @Test
    public void testEmptySet() {
        assertTrue(set.isEmpty());
        set.add("A");
        assertFalse(set.isEmpty());
        set.remove("A");
        assertTrue(set.isEmpty());
    }
    @Test
    public void testAddToSet() {
        set.add("A");
        assertTrue(set.contains("A"));
        set.add("B");
        assertTrue(set.contains("B"));
    }
    @Test
    public void testToAddDuplicateElement() {
        set.add("A");
        assertThrows(IllegalArgumentException.class, () -> set.add("A"));
    }
    @Test
    public void testRemoveFromSet() {
        set.add("A");
        set.add("B");
        set.remove("A");
        assertFalse(set.contains("A"));
    }
    @Test
    public void testRemoveNonExistentElement() {
        assertThrows(IllegalArgumentException.class, () -> set.remove("A"));
    }
    @Test
    public void testClearSet() {
        set.add("A");
        set.add("B");
        set.clear();
        assertTrue(set.isEmpty());
    }
    @Test
    public void testSizeOfSet() {
        set.add("A");
        set.add("B");
        set.add("C");
        assertEquals(3,set.size());
    }
}
