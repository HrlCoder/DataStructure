package 排序;

import java.util.Arrays;
import java.util.Random;

public class DemoSelectSort {

    public static void selectSort(long[] array) {
        //一共有多少次选择的过程
        for (int i = 0; i < array.length; i++) {
            //无序 [0,array.length-i)
            //有序 [array.length-i,array.length)
            int max = 0;
            for (int j = 0; j < array.length-i; j++) {
                if(array[max] < array[j]) {
                    max = j;
                }
            }
            long temp = array[max];
            array[max] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }


    public static void main(String[] args) {
        long[] a = 构建随机数组();
        System.out.println("随机数组测试");
        System.out.println(Arrays.toString(a));
        selectSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("----------------------------------------");
        long[] b = 构建有序数组();
        System.out.println("有序数组测试");
        System.out.println(Arrays.toString(b));
        selectSort(b);
        System.out.println(Arrays.toString(b));
        System.out.println("----------------------------------------");
        long[] c = 构建逆序数组();
        System.out.println("逆序数组测试");
        System.out.println(Arrays.toString(c));
        selectSort(c);
        System.out.println(Arrays.toString(c));
        System.out.println("----------------------------------------");
        long[] d = 构建完全相等的数组();
        System.out.println("完全相等的数组测试");
        System.out.println(Arrays.toString(d));
        selectSort(d);
        System.out.println(Arrays.toString(d));
    }

    public static long[] 构建随机数组() {
        Random random = new Random();
        long[] array = new long[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static long[] 构建有序数组() {
        long[] array = 构建随机数组();
        Arrays.sort(array);
        return array;
    }

    public static void swap(long[] array,int i,int j) {
        long t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static long[] 构建逆序数组() {
        long[] array = 构建有序数组();
        for (int i = 0,j = array.length-1; i < array.length/2; i++,j--) {
            swap(array,i,j);
        }
        return array;
    }

    public static long[] 构建完全相等的数组() {
        long[] array = new long[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 9;
        }

        return array;
    }
}
