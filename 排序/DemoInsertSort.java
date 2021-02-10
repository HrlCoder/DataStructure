package 排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/10/18 15:25
 */
public class DemoInsertSort {

    public static void main(String[] args) {
        long[] a = 构建随机数组();
        System.out.println("随机数组测试");
        System.out.println(Arrays.toString(a));
        insertSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("----------------------------------------");
        long[] b = 构建有序数组();
        System.out.println("有序数组测试");
        System.out.println(Arrays.toString(b));
        insertSort(b);
        System.out.println(Arrays.toString(b));
        System.out.println("----------------------------------------");
        long[] c = 构建逆序数组();
        System.out.println("逆序数组测试");
        System.out.println(Arrays.toString(c));
        insertSort(c);
        System.out.println(Arrays.toString(c));
        System.out.println("----------------------------------------");
        long[] d = 构建完全相等的数组();
        System.out.println("完全相等的数组测试");
        System.out.println(Arrays.toString(d));
        insertSort(d);
        System.out.println(Arrays.toString(d));
    }

    private static void insertSort(long[] array) {
        for (int i = 0; i < array.length-1; i++) {
            // 有序[0,i+1)
            // 无序[i+1,array.length)
            // 抓出来的数是[i+1]
            long key = array[i+1];
            //依次在有序区间进行比较
            int j = i;
            for (; j >= 0; j--) {
                if(key<array[j]) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = key;
        }
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
