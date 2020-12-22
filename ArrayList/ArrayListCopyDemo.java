package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author： 浪漫不死
 * @Date： 2020/12/17
 * @description：
 * @version: 1.0
 */
public class ArrayListCopyDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list2 = list1;
        List<Integer> list3 = new ArrayList<>(list2);

        list2.set(0,111);
        System.out.println(list1);//[111, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(list2);//[111, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(list3);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
