import static javax.swing.UIManager.get;

public class ListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList();
        myArrayList.add("Chicago");
        myArrayList.add("New York");
        myArrayList.add("Toronto");
        myArrayList.add("Paris");
        myArrayList.add("Warsaw");
        String name = myArrayList.get(3);
        System.out.println(name);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.remove(3));
        System.out.println(myArrayList.size());
        myArrayList.clear();
    }
}
