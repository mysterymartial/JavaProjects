package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private LinkedList linklist;

    @BeforeEach
    public void setUp() {
        linklist = new LinkedList();
    }

    @Test
    public void testInsertAtEnd() {
        linklist.insertAtEnd(5);
        linklist.insertAtEnd(6);
        linklist.insertAtEnd(7);

        assertArrayEquals(new Object[]{5, 6, 7}, linklist.display());

    }

    @Test
    public void testInsertAtStart() {
        linklist.insertAtStart(5);
        linklist.insertAtStart(6);
        linklist.insertAtStart(7);
        assertArrayEquals(new Object[]{7, 6, 5}, linklist.display());
    }
    @Test
    public void testReverasal(){
        linklist.insertAtEnd(10);
        linklist.insertAtEnd(15);
        linklist.insertAtEnd(25);
        
    }

    @Test
    public void testInsertAtIndex() {
        linklist.insertAtEnd(5);
        linklist.insertAtEnd(6);
        linklist.insertAtEnd(7);
        linklist.insertAtIndex(1, 10);
        assertArrayEquals(new Object[]{5, 10, 6, 7}, linklist.display());
    }

    @Test
    public void testRemoveAtIndex() {
        linklist.insertAtEnd(5);
        linklist.insertAtEnd(6);
        linklist.insertAtEnd(7);
        linklist.deleteAtIndex(1);
        assertArrayEquals(new Object[]{5, 7}, linklist.display());
    }

    @Test
    public void testDelete() {
        linklist.insertAtEnd(5);
        linklist.insertAtEnd(6);
        linklist.insertAtEnd(7);
        linklist.delete(6);
        assertArrayEquals(new Object[]{5, 7}, linklist.display());

    }

    @Test
    public void testClearNodeFunctionality() {
        linklist.insertAtEnd(5);
        linklist.insertAtEnd(6);
        linklist.insertAtEnd(7);
        linklist.clear();
        assertTrue(linklist.isEmpty());
    }

    @Test
    public void testSearchFunctionality() {
        linklist.insertAtEnd(5);
        linklist.insertAtEnd(6);
        linklist.insertAtEnd(7);
        assertTrue(linklist.find(6));
        assertFalse(linklist.find(10));
    }




}