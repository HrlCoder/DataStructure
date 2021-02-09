package JavaSE4.搜索树;

public class Node {
    public Integer key;
    Node left;
    Node right;

    Node(Integer key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }
}
