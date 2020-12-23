package LinkedList;

/**
 * @author ：浪漫不死
 * @version:
 * @description：
 * @date : 2020/11/4 22:28
 */

class Node {
     int val;
     Node next;

    public Node(int val) {
        this.val = val;
    }
}

/**
 * 无头单向非循环链表实现
 */

public class LinkedList {
    public Node head;   //单链表第一个有效节点

    public LinkedList() {
        this.head = null;   //设置头节点为空
    }

    //打印
    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //头插法
    public void addFirst(int data) {
        Node newHead = new Node(data);
        if(head == null) {
            head = newHead;
            return;
        }
        newHead.next = head;
        head = newHead;
    }

    //尾插法
    public void addLast(int data) {
        Node newTail = new Node(data);
        if(head == null) {
            head = newTail;
            return;
        }
        Node cur = head;
        while (cur.next != null ) {
            cur = cur.next;
        }
        cur.next = newTail;
    }

    //任意位置插入,第一个数据节点为0号下标
    //找到的是当前节点的前一个下标
    public Node findIndex(int index) {
        //设置一个计数器，
        int count = 0;
        Node cur = head;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    public boolean addIndex(int index,int data) {
        if(index<0 || index>size()) {
            System.out.println("下标不合法！");
        } else if(index == 0) {
            addFirst(data);
        } else if(index == size()) {
            addLast(data);
        } else {
            Node node = new Node(data);
            Node prev = findIndex(index);
            node.next = prev.next;
            prev.next = node;
        }
        return false;
    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node node = new Node(key);
        Node cur = head;
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    private Node findPrev(int key) {
        Node prev = head;
        while (prev.next != null) {
            if(prev.next.val == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    public void remove(int key) {
        Node prev = findPrev(key);
        Node cur = prev.next;
        if(head.val == key) {
            head = head.next;
            return;
        }

        if(prev == null) {
            System.out.println("没有这个节点。");
            return;
        }
            prev.next = cur.next;
    }

    //删除所有值为key的节点
    // prev要删除的节点的前驱
    // cur代表当前需要删除的节点
    public void removeAllKey(int key) {
        if(head == null) {
            return;
        }
        Node prev = head;
        Node cur = prev.next;
        while (cur.next != null) {
            if(cur.val == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        if(head.val == key) {
            head = head.next;
        }
    }

    //清空单链表
    public void clear() {
        head = null;
    }
}
