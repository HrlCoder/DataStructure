package JavaSE4.Map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/1 9:15
 */
public class Test2Map {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("AAA",1);
        map.put("BBB",2);
        map.put("CCC",3);
        map.put("DDD",4);
        System.out.println(map.size());
        System.out.println(map);
        // get(key): 返回key所对应的value
        // 如果key存在，返回key所对应的value
        // 如果key不存在，返回null
        System.out.println(map.get("AAA"));
        System.out.println(map.get("EEE"));
        //GetOrDefault(): 如果key存在，返回与key所对应的value，如果key不存在，返回一个默认值
        System.out.println(map.getOrDefault("AAA", 0));
        System.out.println(map.getOrDefault("EEE", 0));
        //containKey(key)：检测key是否包含在Map中，时间复杂度：O(logN)
        // 按照红黑树的性质来进行查找
        // 找到返回true，否则返回false
        System.out.println(map.containsKey("AAA"));
        // containValue(value): 检测value是否包含在Map中，时间复杂度: O(N)
        // 因为TreeMap是按照Key进行组织的，因此查找value时候就需要整体遍历
        // 找到返回true，否则返回false
        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue(5));
        // 打印所有的key
        // keySet是将map中的key防止在Set中返回的
        for (String s : map.keySet()) {
            System.out.print(s+" ");
        }
        System.out.println();
        // 打印所有的value
        // values()是将map中的value放在collect的一个集合中返回的
        for (Integer value : map.values()) {
            System.out.print(value+" ");
        }
        System.out.println();
        // 打印所有的键值对
        // entrySet(): 将Map中的键值对放在Set中返回了
        for (Map.Entry<String, Integer> str : map.entrySet()) {
            System.out.print(str.getKey()+"----"+str.getValue()+"  ");
        }
        System.out.println();
    }
}
