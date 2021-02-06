package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        Set<Map.Entry<Integer, String>> s = map.entrySet();
        for (Map.Entry<Integer, String> maps : s) {
            System.out.println(maps.getKey() + "=" + maps.getValue());
        }
    }
}
