package dataStructure;

import java.util.Arrays;
import java.util.EmptyStackException;



    public class Stack<T> {

        private int size;
        private Object[] elements;
        private  int capacity;

        public Stack(int capacity) {
            this.capacity = capacity;
            this.elements = new Object[capacity];
            size = 0;

        }

        public boolean isEmpty() {
            boolean defaultStackSize = size != 0;
            if (defaultStackSize) {
                return false;
            }
            return true;

        }
        public int size() {
            return size;
        }

        public void push(T element) {
            if(size == elements.length) {
                stackCapacity();



            }

            elements[size++] = element;


        }

        private void stackCapacity() {
            int newCapacity = capacity * 2;
            capacity = newCapacity;
            elements = Arrays.copyOf(elements, newCapacity);

        }

        public T pop() {
            if(isEmpty()){
                throw new EmptyStackException();
            }

            T element = (T) elements[--size];
            elements[size] = null;
            return element;

        }

        public T peek() {
            if(isEmpty()){
                throw new EmptyStackException();
            }
            return (T) elements[size -1];
        }


        public int getCapacity() {
            return capacity;
        }
    }


