package JavaSE4.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/10/25 16:32
 */
public class DemoSet {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        s.add("高飞");
        s.add("专业");
        s.add("代");
        s.add("体测");

        System.out.println(s);
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
