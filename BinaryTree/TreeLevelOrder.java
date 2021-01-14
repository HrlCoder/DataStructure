package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrder {
    /**
     * 层序遍历
     */
    public static void levelTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        //队列的元素类型是树的结点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            //这个node就是我们层序遍历经过的结点
            System.out.print(node.value);

            if(node.left != null) {
                queue.add(node.left);
            }

            if(node.right != null) {
                queue.add(node.right);
            }
        }
    }

    /**
     * 是否是层序遍历
     */
    public static boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (true) {
            TreeNode node = queue.remove();
            if(node == null) {
                break;
            }
            queue.add(root.left);
            queue.add(root.right);
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if(node == null) {
                //一个结点为null，不能说明是完全二叉树
            } else {
                //一个结点不为null，说明是完全二叉树
                return false;
            }
        }
        return true;
    }


    /**
     * 层序遍历+层数
     */
    public static void levelOrderWithLevel(TreeNode root) {
        if(root == null) {
            return;
        }
        Queue<NL> queue = new LinkedList<>();
        queue.add(new NL(root,1));

        while (!queue.isEmpty()) {
            NL nl = queue.remove();
            TreeNode node = nl.node;
            int level = nl.level;

            System.out.print(level);
            System.out.print(node.value);

            if(node.left != null) {
                queue.add(new NL(node.left,level+1));
            }

            if(node.right != null) {
                queue.add(new NL(node.right,level+1));
            }
        }
    }

    static class NL {
        TreeNode node;
        int level;

        NL(TreeNode node,int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        TreeNode root = BuildTree1.buildTree1();
        System.out.print("层序遍历：");
        levelTraversal(root);
        System.out.println();
        System.out.print("层序遍历和层号：");
        levelOrderWithLevel(root);
    }
}

