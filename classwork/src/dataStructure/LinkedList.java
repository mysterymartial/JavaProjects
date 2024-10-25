package dataStructure;

public class LinkedList <T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;

    }
    public void reversal(){
        Node<T> current = head;
        Node<T> prev = null;
        Node<T> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
        }
        head = prev;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public int length() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertAtEnd(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public Object[] display() {
        int size = length();
        Object [] result = new Object[size];

        Node<T> current = head;
        int index = 0;
        while (current != null) {
            result[index++] = current.data;
            current = current.next;

        }

        return result;
    }

    public void insertAtStart(T value) {
        Node<T> newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtIndex(int index, T value) {
        if (index < 0 || index > length()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length());
        }
        if (index == 0) {
            insertAtStart(value);
        }
        else {
            Node<T> new_node = new Node(value);
            Node<T> current = head;
            for (int count = 0; count < index -1; count++) {
                current = current.next;
            }
            new_node.next = current.next;
            current.next = new_node;

        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > length()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length());
        }
        if (index == 0) {
            head = head.next;
        }
        else {
            Node<T> current = head;
            for (int count = 0; count < index -1; count++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public void delete(T value) {
        if (head == null) return;
        if (head.data.equals(value)) {
            head = head.next;
            return;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(value)) {
            current = current.next;

        }
        if (current.next != null) {
            current.next = current.next.next;
        }





    }


    public void clear() {
        head = null;
    }

    public boolean find(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

}









