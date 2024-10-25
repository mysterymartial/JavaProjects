package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {


        @BeforeEach
        public void testSetup() {

            stack = new Stack<Integer>(3);

        }

        @Test
        public void testThatCheckIfMYStackIsEmpty() {
            assertTrue(stack.isEmpty());
        }


        @Test
        public void testThatCheckTheStackSize() {
            assertEquals(0, stack.size());

        }

        @Test
        public void testThatRefelectElementBeingPushed() {
            int intialSize = stack.size();
            stack.push(1);
            assertEquals(intialSize +1, stack.size());
        }
        @Test void testThatRefelectElementBeingPopped() {
            int intialSize = stack.size();
            stack.push(1);
            stack.push(2);
            stack.pop();
            assertEquals(1, stack.pop());


        }
        @Test
        public void testThatRefelectElementBeingNotPoppedFromAnEmptyStack() {
            try {
                stack.pop();
                fail("expected an EmptyStackException to be thrown");

            } catch (EmptyStackException e) {

            }


        }
        @Test
        public void testForThePeekFunctionOfTheStack() {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            assertEquals(3,stack.peek());
        }
        @Test
        public void testForTheCapacityOfTheStack() {
            Stack smallstack = new Stack<Integer>(1);
            smallstack.push(1);
            smallstack.push(2);
            smallstack.push(3);
            assertEquals(3,smallstack.peek());
            assertTrue(smallstack.getCapacity() >2," overloading");

        }



    }


