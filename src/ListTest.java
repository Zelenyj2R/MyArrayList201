import static javax.swing.UIManager.get;

public class ListTest {




    public static void main(String[] args) {
        MyArrayList<String> deliveryCities = new MyArrayList();

        deliveryCities.add("Chicago");
        deliveryCities.add("New York");
        deliveryCities.add("Toronto");
        deliveryCities.add("Paris");
        deliveryCities.add("Warsaw");

        String name = deliveryCities.get(3);
        System.out.println(name);





        System.out.println(deliveryCities.size());



        System.out.println(deliveryCities.remove(3));
        System.out.println(deliveryCities.size());
        deliveryCities.clear();




    }


    }
