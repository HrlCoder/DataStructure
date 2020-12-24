package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //插入数据
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        Object[] o = list.toArray();
        for (Object obj : o) {
            System.out.println(obj);
        }

        String[] str = list.toArray(new String[0]);
        for (String s : str) {
            System.out.println(s);
        }

        String[] str1 = new String[] {"1","2","3","4","5","6","7"};
        String[] strings = list.toArray(str1);
        //大于list的长度，会插入一个null
        System.out.println(Arrays.toString(str1));  //[1, 2, 3, null, 5, 6, 7]
        System.out.println(Arrays.toString(strings));   //[1, 2, 3, null, 5, 6, 7]
    }
}
