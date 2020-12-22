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
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>(list1);
        System.out.println(list2);

    }
}
