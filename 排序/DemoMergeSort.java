package JavaSE4.排序;

import java.util.Arrays;
import java.util.Random;

public class DemoMergeSort {

    public static void main(String[] args) {
        long[] a = 构建逆序数组();
        System.out.println(Arrays.toString(a));
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(long[] array) {
        mergeSortInternal(array, 0, array.length);
    }

    // 区间范围是左闭右开的
    // array[lowIndex, highIndex)
    private static void mergeSortInternal(long[] array, int lowIndex, int highIndex) {
        int size = highIndex - lowIndex;
        if (size <= 1) {
            return;
        }

        int middleIndex = (lowIndex + highIndex) / 2;
        // 左区间：[lowIndex, middleIndex)
        // 右区间：[middleIndex, highIndex)
        mergeSortInternal(array, lowIndex, middleIndex);
        mergeSortInternal(array, middleIndex, highIndex);

        // 左右两个区间都有序了
        合并两个有序区间(array, lowIndex, middleIndex, highIndex);
    }

    private static void 合并两个有序区间(long[] array, int lowIndex, int middleIndex, int highIndex) {
        int size = highIndex - lowIndex;
        long[] extraArray = new long[size];

        int leftIndex = lowIndex;
        int rightIndex = middleIndex;
        int extraIndex = 0;

        // 两个队伍都有人
        while (leftIndex < middleIndex && rightIndex < highIndex) {
            if (array[leftIndex] <= array[rightIndex]) {
                extraArray[extraIndex] = array[leftIndex];
                extraIndex++;
                leftIndex++;
            } else {
                extraArray[extraIndex] = array[rightIndex];
                extraIndex++;
                rightIndex++;
            }
        }

        // 有个队伍没有人
        if (leftIndex < middleIndex) {
            while (leftIndex < middleIndex) {
                extraArray[extraIndex++] = array[leftIndex++];
            }
        } else {
            while (rightIndex < highIndex) {
                extraArray[extraIndex++] = array[rightIndex++];
            }
        }

        // 最后，把数据从新数组统一搬回去
        // 新数组 [0, size)
        // 搬回去的下标范围 [lowIndex, highIndex)
        for (int i = 0; i < size; i++) {
            array[i + lowIndex] = extraArray[i];
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
