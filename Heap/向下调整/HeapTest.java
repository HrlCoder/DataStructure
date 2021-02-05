package 堆.向下调整;

public class HeapTest {
    public static void shiftDown(int[] array, int size, int index) {
        while (true) {
            //1.判断 index 对应的下标是不是叶子结点
            int leftIndex = 2 * index + 1;
            if(leftIndex >= size) {
                return;
            }

            //2.找到两个孩子中最小的
            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if(rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;
            }

            //3.最小的孩子的值和 index 对应位置的值比较
            if(array[index] <= array[minIndex]) {
                return;
            }

            //4.交换最小的孩子的值和 index 的值
            int temp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = temp;

            //5.把最小的孩子视为 index，循环回去（从步骤 1，继续往下走）
            index = minIndex;
        }
    }

    public static void createHeap(int[] array, int size) {
        //找到层序遍历的最后一个结点下标
        int lastIndex = size - 1;
        //找到最后一个结点的父节点的下标
        int lastParentIndex = lastIndex - 1 / 2;
        //从[(size-2)/2,0] 不断地进行向下调整
        for(int i = lastParentIndex; i >= 0; i++) {
            shiftDown(array,size,i);
        }
    }
}
