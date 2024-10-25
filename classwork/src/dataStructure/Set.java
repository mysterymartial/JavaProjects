package dataStructure;

import java.util.Arrays;

public class Set <S> {
    private S [] elements;
    private int size;

    public Set() {
        this.elements = (S[]) new Object[10];
        this.size = 0;
    }
    private void ensureCapacity() {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void add(S element) {
        if(contains(element)){
            throw new IllegalArgumentException("Element already exists");
        }
        ensureCapacity();
        elements[size] = element;
        size++;

    }
    public boolean contains(S element) {
        return indexOf(element) != -1;
    }
    private int indexOf(S element) {
        for (int count = 0; count < size; count++) {
            if (elements[count]!= null && elements[count].equals(element)) {
                return count;
            }
        }
        return -1;
    }

    public void remove(S element) {
        int index = indexOf(element);
        if (index == -1) {
            throw new IllegalArgumentException("Element not found");
        }
        for (int count = index; count < size; count++) {
            elements[count] = elements[count + 1];

        }
        elements[size -1] = null;
        size--;
    }

    public void clear() {
        for (int count = 0; count < size; count++) {
            elements[count] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("set {");
        for (int count = 0; count < size; count++) {
            str.append(elements[count]);
            if (count < size - 1) str.append(", ");

        }
        str.append("}");
        return str.toString();
    }
}
