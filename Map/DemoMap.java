package JavaSE4.Map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/10/29 18:48
 */
public class DemoMap {
    public static void main(String[] args) {
        Map<String,Integer> txl = new TreeMap<>();
        //用int ————> NullPointerException
        Integer v = txl.put("aa",123);

        //返回key值对应的value
        v = txl.get("aa");
        System.out.println(v);
        System.out.println(txl);

        //getOrDefault  通过key获取对应的value 如果不是，返回设定的默认值defaultValue
        v = txl.getOrDefault("aa",456);
        System.out.println(v);

        //删除key对应的映射关系
        v = txl.remove("aa");
        System.out.println(txl);
    }
}
