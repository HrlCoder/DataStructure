package JavaSE4.排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/10/20 18:34
 */
public class DemoBubbleSort {
    public static void main(String[] args) {
        long[] a = 构建逆序数组();
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(long[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    long temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
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
