package LinkedList;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/4 23:00
 */
public class TestDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.display();
        list.addLast(4);
        list.display();
        list.addIndex(1,123);
        list.display();
        System.out.println(list.contains(1));
        System.out.println(list.contains(6));
        list.remove(123);
        list.display();
        list.addFirst(0);
        list.addFirst(0);
        list.addFirst(0);
        list.display();
        list.removeAllKey(0);
        list.display();
        list.clear();
        list.display();
    }
}
