package 堆.优先级队列;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.add(3);
        queue.add(5);
        queue.add(2);
        queue.add(7);

        System.out.println(queue.remove());//2
        System.out.println(queue.remove());//3
        System.out.println(queue.remove());//5
        System.out.println(queue.remove());//7
    }
}
