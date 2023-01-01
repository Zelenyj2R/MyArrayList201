import java.util.Arrays;

public class MyArrayList<L> {
    private static int capacity = 10;
    private Object[] myArrayList = new Object[capacity];
    private int position = 0;
    private int size;
    private void grow() {
        myArrayList = Arrays.copyOf(myArrayList, capacity *= 1.5);
    }
    public void add(Object value) {
        if (size == capacity) {
            grow();
        }
        myArrayList[size] = value;
        size++;
    }
    public L get(int position) {
        return (L) myArrayList[position];
    }
    public int size() {
        return size;
    }
    public String clear() {
        Object [] AnotherArr = new Object[capacity];
        myArrayList =  AnotherArr;
        size = 0;
        return null;
    }
    public boolean remove(int index) {
        if (index < size) {
            for (int i = index; i < size; i++) {
                myArrayList[i] = myArrayList[i + 1];
            }
            myArrayList[size] = null;
            size--;
            return true;
        } else {
            return false;
        }
    }
}


