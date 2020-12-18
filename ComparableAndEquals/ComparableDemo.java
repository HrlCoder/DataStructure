package ComparableAndEquals;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/10/31 16:36
 */

class Teacher implements Comparable<Teacher> {

    String name;
    int age;
    int height;
    int weight;

    public Teacher(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //“大小” 关系如何决定，留给开发者自己决定
    @Override
    public int compareTo(Teacher o) {
//            if(this.age < o.age) {
//                return -1;
//            } else if(this.age == o.age) {
//                return 0;
//            } else {
//                return 1;
//            }
        return this.age-o.age;
    }


}
public class ComparableDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("zz",19,180,121);
        Teacher t2 = new Teacher("yy",20,181,123);
        Teacher t3 = new Teacher("xx",21,182,121);

        int r = t1.compareTo(t2);
        System.out.println(r);

        int r1 = t3.compareTo(t2);
        System.out.println(r1);
    }
}
