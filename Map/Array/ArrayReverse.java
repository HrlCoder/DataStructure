package cn.day06;

/*
数组元素的反转：(对称位置的元素交换)
本来的样子{1,2,3,4,5}
之后的样子{5,4,3,2,1}
*/

public class ArrayReverse {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("==========");

        for(int min = 0,max = array.length-1;min < max;min++,max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        printArray(array);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
