package JavaSE4.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/10/25 16:51
 */
public class MyTreeSet {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
        // contains(key): 如果key存在，返回true，否则返回false
        System.out.println(s.contains(1));
        System.out.println(s.contains(0));
        // remove(key): key存在，删除成功返回true
        // key不存在，删除失败返回false
        // key为空，抛出空指针异常
        System.out.println(s.remove(5));
        System.out.println(s.remove(6));
        //System.out.println(s.remove(null));

        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
}
