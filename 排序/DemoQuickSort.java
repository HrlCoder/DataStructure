package JavaSE4.排序;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/10/20 19:02
 */
public class DemoQuickSort {

    public static void main(String[] args) {
        long[] a = 构建逆序数组();
        System.out.println(Arrays.toString(a));
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void quickSort(long[] array) {
        quickSortInternal(array,0,array.length-1);
    }

    private static void quickSortInternal(long[] array, int lowIndex,int highIndex) {
        //由于是闭区间，所以，区间内个数需要加1
        int size = highIndex - lowIndex+1;
        if(size <= 1) {
            return;
        }
        //选择其中一个数(选最左边的) ————array[lowIndex]
        //执行partition，小的放左，大的放右
        //keyIndex是经过partition后，选出来数的最终下标
        int keyIndex = partition(array,lowIndex,highIndex);
        //分别对左右区间进行相同的处理——递归方法
        quickSortInternal(array,lowIndex,keyIndex-1);
        quickSortInternal(array,keyIndex+1,highIndex);
    }

    /*
    挖坑法
     */
    private static int partitionWaKen(long[] array,int lowIndex,int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;

        long key = array[lowIndex];
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && array[rightIndex] >= key) {
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];
            while (leftIndex < rightIndex && array[leftIndex] <= key) {
                leftIndex++;
            }
            array[rightIndex] = array[leftIndex];
        }
        array[leftIndex] = key;
        return leftIndex;

    }

    /*
    首尾
     */
    private static int partitionHover(long[] array,int lowIndex,int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;

        long key = array[lowIndex];

        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && array[rightIndex] >= key) {
                rightIndex--;
            }
            while (leftIndex < rightIndex && array[leftIndex] <= key){
                leftIndex++;
            }
            swap(array,leftIndex,rightIndex);
        }
        swap(array,lowIndex,highIndex);
        return leftIndex;
    }

    /*
    双下标法
     */
    private static int partitionIndex(long[] array,int lowIndex,int highIndex) {
        return 0;
    }

    private static int partition(long[] array, int lowIndex, int highIndex) {
        /*1.选择array[lowIndex]作为特殊的数
          2.需要遍历整个数组
         */
        //return partitionHover(array,lowIndex,highIndex);
        return partitionWaKen(array,lowIndex,highIndex);
    }

    public static void swap(long[] array,int i,int j) {
        long t = array[i];
        array[i] = array[j];
        array[j] = t;
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
