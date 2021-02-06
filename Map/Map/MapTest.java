package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        show03();
    }

    private static void show03() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(4));
    }

    private static void show02() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map);
        map.remove(1);
        System.out.println(map);
    }

    private static void show01() {
        Map<Integer,String> map = new HashMap<>();
        String v = map.put(1, "a");
        System.out.println(v);
        String v2 = map.put(1, "b");
        System.out.println(v2);
        map.put(2,"c");
        System.out.println(map);
    }
}
