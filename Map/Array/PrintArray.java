package cn.day06;

import java.util.*;
/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都需要亲力亲为，详细处理每一个细节。
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮做事。
 */

public class PrintArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        //要求打印格式：[10 20 30 40 50]
        //使用面向过程

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {//如果是最后一个元素
                System.out.println(array[i] + "]");
            } else {//如果不是最后一个元素
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("====================");

        //使用面向对象
        //找一个JDK给提供好的Arrays类
        //其中有一个toString方法，直接就能把数组变成想要格式的字符串
        System.out.println(Arrays.toString(array));
    }
}