package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    private Map<String, Integer> map;
    @BeforeEach
    public void setUp() {
        map = new Map<>();
    }
    @Test
    public void testIsEmpty() {
        assertTrue(map.isEmpty());
        map.put("key1",1);
        assertFalse(map.isEmpty());
        map.remove("key1");
        assertTrue(map.isEmpty());
    }
    @Test
    public void testToPutKeyAndValue() {
        map.put("key1",1);
        map.put("key2", 2);
        assertEquals(1,map.get("key1"));
        assertEquals(2,map.get("key2"));
    }
    @Test
    public void testUpdateValue() {
        map.put("key1",1);
        map.put("key2",2);
        map.update("key2",3);
        assertEquals(3,map.get("key2"));
    }
    @Test
    public void testRemoveValue() {
        map.put("key1",1);
        map.put("key2",2);
        map.remove("key1");
        assertNull(map.get("key1"));
    }
    @Test
    public void testClearMap() {
        map.put("key1",1);
        map.put("key2",2);
        map.clear();
        assertEquals(0,map.size());
    }
    @Test
    public void testSize() {
        map.put("key1",1);
        map.put("key2",2);
        assertEquals(2,map.size());
    }
    @Test
    public void testPutExistingKeysThrowsException() {
        map.put("key1",1);
        assertThrows(IllegalArgumentException.class, () -> map.put("key1",2));
    }
    @Test
    public void testUdateNotExistingKeysThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> map.update("key1",1));
    }
    @Test
    public void testRemoveNonExistingKeysThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> map.remove("key1"));
    }

}
