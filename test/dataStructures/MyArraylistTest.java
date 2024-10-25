package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArraylistTest {
    private MyArraylist arraylist;

    @BeforeEach
    public void checkMyArrayList() {
        arraylist = new MyArraylist<Integer>(3);
    }

    @Test
    public void checkThatArraylistIsEmpty() {
        assertTrue(arraylist.isEmpty());
    }

    @Test
    public void checkArraylistSize() {
        assertEquals(0, arraylist.size());
    }

    @Test
    public void checkThatArraylistCanAddElement() {
        arraylist.add(4);
        arraylist.add(5);
        assertEquals(2, arraylist.size());
    }

    @Test
    public void checkThatArraylistCanRemoveElement() {
        arraylist.add(4);
        arraylist.add(5);
        arraylist.remove(5);
    }

    @Test
    public void checkThatArraylistCanCheckIfTheElemrntThoseNotExist() {
        arraylist.add(4);
        arraylist.add(5);
        arraylist.remove(6);
        assertEquals(2, arraylist.size(), "Element not found");
    }

    @Test
    public void checkThatArraylistCanInsertElement() {
        arraylist.insert(0, 4);
        assertEquals(1, arraylist.size());
    }

    @Test
    public void checkThatArraylistCanThrowWhenTheIndexDoesNotExist() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            arraylist.insert(-1, 5);
        });
    }

    @Test
    public void checkThatArraylistHasDynamicCapacity() {
        MyArraylist smallarraylist = new MyArraylist<Integer>(1);
        smallarraylist.add(2);
        smallarraylist.add(3);
        smallarraylist.add(4);
        assertEquals(3, smallarraylist.size());
    }

    @Test
    public void checkThatArraylistGetMethod() {
        arraylist.add(4);
        arraylist.add(7);
        assertEquals(4, arraylist.get(0));
    }

    @Test
    public void checkThatArraylistCanClear() {
        arraylist.add(4);
        arraylist.add(7);
        arraylist.add(8);
        arraylist.clear();
        assertEquals(0, arraylist.size());
    }
}



