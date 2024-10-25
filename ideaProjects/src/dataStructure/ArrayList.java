package dataStructure;

import java.util.Arrays;



    public class ArrayList<T> {
        private int size;
        private Object[] elements;
        private int capacity;
        public ArrayList(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            this.elements= new Object[capacity];
        }


        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void add(T element) {
            if (size == elements.length) {
                arraylistCapacity();
            }
            elements[size++] = element;
        }

        private void arraylistCapacity() {
            if(size == elements.length) {
                int newCapacity = capacity * 2;
                Object[] newElements = new Object[newCapacity];
                System.arraycopy(elements, 0, newElements, 0, size);
                elements = newElements;
                capacity = newCapacity;
            }
        }

        public void remove(T element) {
            boolean found = false;
            for (int count = 0; count < size; count++) {
                if (elements[count].equals(element)) {
                    for(int counter = count; counter < size-1; counter++) {
                        elements[counter] = elements[counter+1];
                    }
                    elements[size-1] = null;
                    size--;
                    found = true;
                    break;
                }

            }
            if (!found) {
                System.out.println("Element not found");
            }
        }

        public void insert(int index, T element) {
            if(index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            arraylistCapacity();
            elements[index] = element;
            size++;
        }

        public int getCapacity() {
            return capacity;
        }

        public T get(int index) {
            if(index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            return (T) elements[index];


        }



        public void clear() {
            Arrays.fill(elements, null);
            size = 0;
        }
    }




