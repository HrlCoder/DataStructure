package Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/13 16:29
 */

/*
                          First Element (Head)                      Last Element (Tail)
                  Throws exception        Special value       Throws exception        Special value
        Insert    addFirst(e)             offerFirst(e)       addLast(e)              offerLast(e)
        Remove    removeFirst()           pollFirst()         removeLast()            pollLast()
        Examine   getFirst()              peekFirst()         getLast()               peekLast()
 */

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addLast(5);
        deque.addLast(6);
        deque.addLast(7);

        while (!deque.isEmpty()) {
            if(!deque.isEmpty()) {
                System.out.print(deque.getFirst()+" ");
            }
            if(!deque.isEmpty()) {
                System.out.print(deque.removeFirst()+" ");
            }
            if(!deque.isEmpty()) {
                System.out.print(deque.getLast()+" ");
            }
            if(!deque.isEmpty()) {
                System.out.print(deque.removeLast()+" ");
            }
        }
    }
}