package cn.day06;

/*
如果希望一个方法当中产生了多个结果数据进行返回，怎么办？
解决方案：使用一个数组作为返回值类型即可。

任何数据类型都能作为方法的参数类型，或者返回值类型。

数组作为方法的参数，传递进去的七十是数组的地址值。
数组作为方法的返回值，返回的其实也是数组的地址值。
*/

public class ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("总和："+result[0]);
        System.out.println("============");
        System.out.println("平均数："+result[1]);
    }

    public static int[] calculate(int a ,int b ,int c){
        int sum = a + b + c;
        int avg = sum / 3;

        int[] array = { sum,avg };
        return array;
    }
}
