package List;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] s = {"1","2","3","4"};
        //s的实现类不是ArrayList
        List<String> list = Arrays.asList(s);
        System.out.println(list);
        System.out.println(list.getClass());    //class java.util.Arrays$ArrayList(Arrays下的内部类ArrayList)
    }
}
