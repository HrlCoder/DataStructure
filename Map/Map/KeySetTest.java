package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        Set<Integer> set = map.keySet();
        //遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String s = map.get(key);
            System.out.println(key+"="+s);
        }
        System.out.println("------------------");
        //增强for
        for (Integer i : set) {
            String s = map.get(i);
            System.out.println(i+"="+s);
        }
    }
}
