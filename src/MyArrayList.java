public class MyArrayList<L> {
    private Object[] myArrayList = new Object[10];
    private int position = 0;
    public void add(L value) {
        myArrayList[position] = value;
        System.out.println(position + "  " + myArrayList[position]);
        position++;
    }
    public L get(int position) {
        return (L) myArrayList[position];
    }
    public int size() {
        return position;
    }
    public void clear() {
        for (int i = 0; i <= position; i++) {
            myArrayList[position] = null;
        }
        position = 0;
    }
    public boolean remove(int index) {
        if (index < position) {
            for (int i = index; i < position; i++) {
                myArrayList[i] = myArrayList[i + 1];
            }
            myArrayList[position] = null;
            position--;
            return true;
        } else {
            return false;
        }
    }
}


