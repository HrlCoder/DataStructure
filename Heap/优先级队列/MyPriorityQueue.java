package 堆.优先级队列;

public class MyPriorityQueue {
    private Integer[] array;
    private int size;

    public MyPriorityQueue() {
        array = new Integer[100];
        size = 0;
    }

    public Integer element() {
        if(size == 0) {
            throw new RuntimeException("空的");
        }
        return array[0];
    }

    /**
     * 插入
     */
    public void add(Integer e) {
        array[size] = e;
        size++;
        adjustUp(size-1);
    }

    public void adjustUp(int index) {
        while (true) {
            if(index == 0) {
                break;
            }
            int parentIndex = (index - 1) / 2;
            if(array[parentIndex] <= array[index]) {
                break;
            }
            int temp = array[index];
            array[index] = array[parentIndex];
            array[parentIndex] = temp;
            index = parentIndex;
        }
    }

    /**
     * 删除
     */
    public Integer remove() {
        if(size == 0) {
            throw new RuntimeException("空的");
        }

        int e = array[0];
        array[0] = array[size - 1];
        size--;

        adjustDown(0);
        return e;

    }

    private void adjustDown(int index) {
        while (true) {
            int leftIndex = 2 * index + 1;
            if(leftIndex >= size) {
                return;
            }
            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if(rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;
            }

            if(array[index] <= array[minIndex]) {
                return;
            }

            int temp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = temp;

            index = minIndex;
        }
    }
}
