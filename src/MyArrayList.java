import java.util.Arrays;

public class myarraylist<L> {
    private static int capacity = 10;
    private Object[] myArrayList = new Object[capacity];

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
    public L get(int index) {
        if(index < size){
            return (L) myArrayList[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size() {
        return size;
    }
    public void clear() {
        myArrayList =  new Object[capacity];
        size = 0;
    }

    public Object remove(int index) {
        if(index < size){
            Object obj = myArrayList[index];
            myArrayList[index] = null;
            int y = index;
            while(y < size){
                myArrayList[y] = myArrayList[y+1];
                myArrayList[y+1] = null;
                y++;
            }
            size--;
            return  obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}


