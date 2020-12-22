package ArrayList;

import java.util.Arrays;

public class MyArrayList {
    public int[] e;
    public int size;

    public MyArrayList() {
        this.e = new int[5];
        this.size = 0;
    }
    // 打印顺序表
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(e[i]+" ");
        }
        System.out.println();
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(pos<0 || pos>size) {
            System.out.println("位置不合法。");
        }

        //扩容
        if(size == e.length) {
            e = Arrays.copyOf(e,2*e.length);
        }

        for (int i = size-1; i >= pos; i--) {
            e[i+1] = e[i];
        }
        e[pos] = data;
        size++;

    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < size; i++) {
            if(e[i] == toFind){
                return true;
            }
        }
        return false;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0 || pos>size) {
            System.out.println("位置不合法。");
        }
        return e[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos<0 || pos>size) {
            System.out.println("位置不合法。");
        }
        e[pos] = value;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < size; i++) {
            if(e[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有关键字。");
            return;
        }
        for (int i = index; i < size-1; i++) {
            e[i] = e[i+1];
        }
        size--;
    }

    // 获取顺序表长度
    public int size() {
        return size;
    }

    // 清空顺序表
    public void clear() {
        size = 0;
    }
}
