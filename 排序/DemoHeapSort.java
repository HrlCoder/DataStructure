package 排序;

import java.util.Arrays;
import java.util.Random;

public class DemoHeapSort {

    public static void heapSort(long[] array) {
        //建大堆
        createHeap(array,array.length);

        //进行选择的过程，一共需要array.length-1组
        for (int i = 0; i < array.length - 1; i++) {
            //无序 [0,array.length-1)
            long temp = array[0];
            array[0] = array[array.length-1-i];
            array[array.length-1-i] = temp;
            //无序 [0,array.length-i-1)
            adjustDown(array,array.length-1-i,0);
        }
    }

    private static void adjustDown(long[] array, int size, int index) {
        while (2 * index + 1 < size) {
            int maxIndex = 2 * index + 1;
            if(maxIndex + 1 < size && array[maxIndex + 1] > array[maxIndex]) {
                maxIndex++;
            }

            if(array[index] >= array[maxIndex]) {
                break;
            }

            long temp = array[index];
            array[index] = array[maxIndex];
            array[maxIndex] = temp;

            index = maxIndex;
        }

    }

    private static void createHeap(long[] array, int size) {
        int lastIndex = array.length-1;
        int lastParentIndex = (lastIndex - 1) / 2;
        for (int i = lastParentIndex; i >= 0; i--) {
            adjustDown(array,size,i);
        }
    }

    public static void main(String[] args) {
        long[] a = 构建随机数组();
        System.out.println("随机数组测试");
        System.out.println(Arrays.toString(a));
        heapSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("----------------------------------------");
        long[] b = 构建有序数组();
        System.out.println("有序数组测试");
        System.out.println(Arrays.toString(b));
        heapSort(b);
        System.out.println(Arrays.toString(b));
        System.out.println("----------------------------------------");
        long[] c = 构建逆序数组();
        System.out.println("逆序数组测试");
        System.out.println(Arrays.toString(c));
        heapSort(c);
        System.out.println(Arrays.toString(c));
        System.out.println("----------------------------------------");
        long[] d = 构建完全相等的数组();
        System.out.println("完全相等的数组测试");
        System.out.println(Arrays.toString(d));
        heapSort(d);
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
