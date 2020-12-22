package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacityDemo {
    public static void main(String[] args) {
        //区分容量和包含元素个数的区别
        //List的下标，和容量无关，只和元素个数有关
        List<Integer> list = new ArrayList<>(100);
        list.set(98,98);//这句代码是错的，下标越界

        //System.out.println(list);//java.lang.IndexOutOfBoundsException: Index: 98, Size: 0
    }
}
