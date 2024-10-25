package dataStructure;

import java.util.Arrays;
import java.util.NoSuchElementException;



    public class Queue<T> {
        private int size;
        private Object [] elements;
        private int capacity;
        final int front =0;

        public Queue(int capacity) {
            this.elements = new Object[capacity];
            size = 0;
            this.capacity = capacity;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void enqueue(T element) {
            if(size == elements.length) {
                queueCapacity();
            }
            elements[size++] = element;
        }

        @SuppressWarnings("unchecked")

        private void queueCapacity() {

            int newCapacity = capacity * 2;
            capacity = newCapacity;
            elements = Arrays.copyOf(elements, newCapacity);

        }

        public T dequeue() {
            if(isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            T element = (T) elements[size--];
            elements[size] = null;
            return element;
        }

        public T peek() {
            if(isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return  (T) elements[front];
        }

        public int getCapacity() {
            return capacity;
        }
    }


