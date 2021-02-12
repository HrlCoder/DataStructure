package JavaSE4.Set;

import java.util.*;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/1 9:28
 */
public class Set去重 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
        l.add(2);
        l.add(2);
        l.add(3);
        l.add(3);

        Set<Integer> s = new TreeSet<>();
        s.addAll(l);
        System.out.println(s);
//        将set中的元素转换为数组返回
        System.out.println(Arrays.toString(s.toArray()));
//        集合c中的元素是否在set中全部存在，是返回true，否则返回 false
        System.out.println(s.containsAll(l));
    }
}
