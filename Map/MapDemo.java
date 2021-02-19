package JavaSE4.Map.TestTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        MyTreeMap txl = new MyTreeMap();

        Integer v = txl.put("cpx", 123);
        System.out.println(v);
        v = txl.put("cpx", 456);
        System.out.println(v);

        System.out.println(txl.get("cpx")); // 456
        System.out.println(txl.get("gb"));  // null
        System.out.println(txl.getOrDefault("cpx", 110));   // 456
        System.out.println(txl.getOrDefault("gb", 110));    // 110
    }
}
