package List;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //插入数据
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //是否包含数据
        System.out.println(list.contains(1));
        //获得索引位置的值
        System.out.println(list.get(0));
        //集合是否为空
        System.out.println(list.isEmpty());
        //移除索引位置数据
        list.remove(1);
        System.out.println(list);
    }
}
