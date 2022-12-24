public class MyArrayList <L> {

    private  Object[] deliveryCities = new Object[10];
    private int position = 0;

        public void add(L value){
            deliveryCities[position] = value;
            System.out.println(position+"  "+deliveryCities[position]);position++;

        }
    public L get(int position) {
        return (L) deliveryCities[position];

    }


    public int size() {
        return position;
    }

    public void clear() {
        for (int i= 0; i<=position; i++)
            deliveryCities[position] = null;
        position = 0;
    }

    public boolean remove(int index) {
        if(index<position) {
            for (int i = index; i < position; i++)
                deliveryCities[i] = deliveryCities[i + 1];
            deliveryCities[position] = null;
            position--;
            return true;
        }
        else {
            return false;
        }
    }
}


