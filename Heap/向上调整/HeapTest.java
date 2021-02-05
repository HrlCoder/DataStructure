package 堆.向上调整;

public class HeapTest {
    public static void adjustUp(int[] array,int size,int index) {
        //1.判断 index 是不是树的根,如果是根，调整结束
        //2.找到 index 的父结点
        //3.比较父结点的值和 index 的值
        //4.只要父结点的值 <= index，调整结束
        //5.交换父结点和 index 的值
        //6.把父结点看做 index，继续这个大循环

        while (true) {
            //1.判断 index 是不是树的根,如果是根，调整结束
            if(index == 0) {
                break;
            }
            //2.找到 index 的父结点
            int parentIndex = (index - 1) / 2;
            //3.比较父结点的值和 index 的值
            //4.只要父结点的值 <= index，调整结束
            if(array[parentIndex] <= array[index]) {
                break;
            }
            //5.交换父结点和 index 的值
            int temp = array[index];
            array[index] = array[parentIndex];
            array[parentIndex] = temp;
            //6。把父结点看做 index，继续这个大循环
            index = parentIndex;

        }
    }
}
