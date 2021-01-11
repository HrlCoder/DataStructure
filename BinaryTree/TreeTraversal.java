package BinaryTree;

public class TreeTraversal {
    /**
     *前序遍历
     */
    public static void preTraversal(TreeNode root) {
        //处理前提
        if(root != null) {
            //处理根节点
            System.out.print(root.value);
            //根据前序的方式，递归处理该结点的左子树
            preTraversal(root.left);
            //根据前序的方式，递归处理该结点的右子树
            preTraversal(root.right);
        } else {
            //什么都不写即可
        }
    }
    /**
     *中序遍历
     */
    public static void inTraversal(TreeNode root) {
        if(root != null) {
            inTraversal(root.left);
            System.out.print(root.value);
            inTraversal(root.right);
        }

    }
    /**
     *后序遍历
     */
    public static void postTraversal(TreeNode root) {
        if(root != null) {
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.print(root.value);
        }
    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');
        TreeNode i = new TreeNode('I');
        TreeNode j = new TreeNode('J');
        a.left = b;
        a.right = c;
        b.left = d;
        d.right = g;
        g.left = j;
        c.left = e;
        c.right = f;
        f.left = h;
        f.right = i;
        System.out.println("前序遍历：");
        preTraversal(a);
        System.out.println();
        System.out.println("中序遍历：");
        inTraversal(a);
        System.out.println();
        System.out.println("后序遍历：");
        postTraversal(a);
    }
}
