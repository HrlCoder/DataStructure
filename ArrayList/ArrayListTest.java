package ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.display();
        System.out.println(list.contains(1));
        System.out.println(list.getPos(0));
        System.out.println(list.search(2));
        list.remove(4);
        list.display();
    }
}
