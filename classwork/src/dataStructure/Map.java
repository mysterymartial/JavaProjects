package dataStructure;

import java.util.Arrays;

public class Map <K,V>{
    private K[]keys;
    private V[] values;
    private int size;


    @SuppressWarnings("unChecked")
    public Map(){
        this.size = 0;
        this.keys = (K[]) new Object[10];
        this.values = (V[]) new Object[10];
    }
    private void ensureCapacity(){
        if(size >= keys.length){
            keys = Arrays.copyOf(keys, size * 2);
            values = Arrays.copyOf(values, size * 2);
        }
    }
    private boolean containsKey(K key){
        for(int count = 0; count< size; count++){
            if(keys[count].equals(key)){
                return true;
            }

        }
        return false;
    }
    private int indexOf(K key){
        for(int count = 0; count< size; count++){
            if(keys[count].equals(key)){
                return count;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void put(K key, V value) {
        ensureCapacity();
        if (containsKey(key)){
            throw new IllegalArgumentException("Key " + key + " already exists");
        }
        keys[size] = key;
        values[size] = value;
        size++;

    }

    public V get(K key) {
        int index = indexOf(key);
        return index != -1 ? values[index] : null;



}

    public void update(K key, V value) {
        int index = indexOf(key);
        if(index == -1){
            throw new IllegalArgumentException("Key " + key + " does not exist");
        }
        values[index] = value;
    }

    public void remove(K key) {
        int index = indexOf(key);
        if(index == -1){
            throw new IllegalArgumentException("Key " + key + " does not exist");
        }
        for(int count = index; count< size; count++){
            keys[count] = keys[count+1];
            values[count] = values[count+1];
        }
        keys[size -1] = null;
        values[size -1] = null;
        size--;
    }

    public void clear() {
        for(int count = 0; count < size; count++){
            keys[count] = null;
            values[count] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }
    @Override
    public String toString() {
        StringBuilder myString = new StringBuilder("{");
        for(int count = 0; count < size; count++){
            myString.append(keys[count]).append(":").append(values[count]).append("\n");
            if(count < size -1) myString.append(",");
        }
        myString.append("}");
        return myString.toString();

    }
}

