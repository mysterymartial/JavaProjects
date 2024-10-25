package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class QueueTest {
        private Queue queue;
        @BeforeEach
        public void testQueue() {
            queue = new Queue<Integer>(3);
        }
        @Test
        public void testQueueIsEmpty() {
            assertTrue(queue.isEmpty());
        }
        @Test
        public void testQueueIsSize() {
            assertEquals(0,queue.size());
        }
        @Test
        public void testEnqueueFunction() {
            int intialSize = queue.size();
            queue.enqueue(4);
            assertEquals(intialSize +1,queue.size());
        }
        @Test
        public void testDequeueFunction() {
            int intialSize = queue.size();
            queue.enqueue(4);
            queue.enqueue(5);
            queue.dequeue();
            assertEquals(intialSize+1,queue.size());
        }
        @Test
        public void testDequeueFromEmptyQueue() {
            try {
                queue.dequeue();
                fail("expected an emptyQueueExpection to be thrown");
            }catch (Exception e) {
            }
        }
        @Test
        public void testQueuePickFunction() {
            queue.enqueue(4);
            queue.enqueue(5);
            queue.enqueue(6);
            assertEquals(4,queue.peek());
        }
        @Test
        public void testQueueCapacityFunction() {
            Queue smallQueue = new Queue<Integer>(1);
            smallQueue.enqueue(1);
            smallQueue.enqueue(2);
            smallQueue.enqueue(3);
            assertEquals(1,smallQueue.peek());
            assertTrue(smallQueue.getCapacity() >2,"the capacity has increased");
        }
    }



