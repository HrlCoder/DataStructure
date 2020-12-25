package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/13 16:15
 */

//poll()    检索并移除此队列的头，或返回 null如果队列为空。
//remove()  检索和删除此队列的头。
//element() 检索，但不删除此队列的头。
//offer(E e)如果可能立即在不违反容量限制的情况下这样做的话，将指定的元素插入到队列中。
//peek()    检索，但不删除，这个队列头，或返回 null如果队列为空。

public class QueueDemo {
    public static void main(String[] args) {
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.print(q+" ");
        }
        System.out.println();
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        for(String q : queue){
            System.out.print(q+" ");
        }
        System.out.println();
        System.out.println("element="+queue.element()); //返回第一个元素
        for(String q : queue){
            System.out.print(q+" ");
        }
        System.out.println();
        System.out.println("peek="+queue.peek()); //返回第一个元素
        for(String q : queue){
            System.out.print(q+" ");
        }
    }
}

