package ComparableAndEquals;

/**
 * @author ：浪漫不死
 * @version: 1.0
 * @description：
 * @date : 2020/9/11 19:12
 */
public class EqualsDemo {
    public static void main(String[] args) {
        Teacher1 t1 = new Teacher1("gg");
        Teacher1 t2 = new Teacher1("gg");
        Teacher1 t3 = new Teacher1("pp");
        Teacher1 t4 = new Teacher1("pp");

        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
    }
}

class Teacher1 {
    String name;

    public Teacher1(String name) {
        this.name = name;
    }

}
