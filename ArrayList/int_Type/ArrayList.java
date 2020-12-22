package ArrayList.int_Type;

import java.util.Arrays;
import java.util.Iterator;

// 仿写真实的（java.util.ArrayList)实现类
public class ArrayList implements List {
    private int[] array;    // 顺序表内部的数组
    private int size;       // 顺序表内部的元素个数

    public ArrayList() {
        // 初始容量是 10 个
        array = new int[10];
        // 初始的元素个数是 0 个
        size = 0;
    }

    public ArrayList(List other) {
        array = new int[other.size()];
        for (int i = 0; i < other.size(); i++) {
            array[i] = other.get(i);
        }
        size = other.size();
    }

    // 平时时间复杂度是 O(1)
    // 碰到需要扩容了，时间复杂度是 O(n)
    // 由于扩容的情况比较少见，所以，这个方法的时间复杂度一般被称为 平均 O(1)
    @Override
    public boolean add(Integer e) {
        if (array.length == size) {
            // 现在已经满了，需要扩容了
            ensureCapacity(array.length * 2);
        }

        array[size++] = e;

        return true;
    }

    // 调用完这个方法后，保证容量一定是 >= capacity
    // 时间复杂度 O(n)
    public void ensureCapacity(int capacity) {
        // 0. 检查是否需要扩容
        if (this.array.length >= capacity) {
            return;
        }

        // 1. 定义新的数组
        int[] newArray = new int[capacity];
        // 2. 进行搬家，从 array 数组中搬到 newArray 数组中
        for (int i = 0; i < size; i++) {
            newArray[i] = this.array[i];
        }
        // 3. 不再关联捞的 array，关联新的 newArray
        this.array = newArray;
    }

    @Override
    public void add(int index, Integer e) {
        // 合法的下标 [0, size]
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }

        if (array.length == size) {
            ensureCapacity(array.length * 2);
        }

        // 要把 index 及之后的所有元素，全部向后搬移
        // 为了保证元素不被覆盖，从后往前搬

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        /*  循环实现的效果是一样的，看 i 是哪套标准而已
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        */

        array[index] = e;
        size++;
    }

    @Override
    public Integer remove(int index) {
        // 合法的下标: [0 , size-1]
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }

        int e = array[index];

        // 从前往后删
        // [index + 1, size-1] 的元素，搬移到 [index, size-2] 的下标处
        for (int i = index + 1; i <= size - 1; i++) {
            array[i - 1] = array[i];
        }
        size--;

        return e;
    }

    @Override
    public boolean remove(Integer e) {
        int index = indexOf(e);
        if (index != -1) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer get(int index) {
        // 合法下标: [0, size-1]
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }

        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        // 合法下标: [0, size-1]
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("不合法的下标: " + index);
        }

        Integer old = array[index];
        array[index] = e;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        // -1 暂时代表无效值
        Arrays.fill(array, -1);

        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) != -1;
    }

    @Override
    public int indexOf(Integer e) {
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
