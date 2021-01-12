package BinaryTree;

import java.util.Arrays;

public class SomeMethod {
    private static int n = 0;

    /**
     * 返回root为根的树中，有多少个结点
     */
    private static void preOrder(TreeNode root) {
        //1.一个树的结点 2.没有结点
        if(root != null) {
            n++;
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static int sumTreeNodeSize(TreeNode root) {
        preOrder(root);
        return n;
    }

    public static int sumTreeNodeSize2(TreeNode root) {
        if(root != null) {
            int rootNodeSize = 1;
            int leftSubTreeNodeSize = sumTreeNodeSize2(root.left);
            int rightSubTreeNodeSize = sumTreeNodeSize2(root.right);
            return rightSubTreeNodeSize+leftSubTreeNodeSize+rootNodeSize;
        }
        return 0;
    }

    /**
     * 求叶子结点个数
     */
    private static int m = 0;

    private static void preOrder2(TreeNode root) {
        if(root != null) {
            if(root.left == null && root.right == null) {
                m++;
            }
            preOrder2(root.left);
            preOrder2(root.right);
        }
    }

    public static int sumTreeLeafNodeSize(TreeNode root) {
        m = 0;//保证下次打印
        preOrder2(root);
        return m;
    }

    public static int sumTreeLeafNodeSize2(TreeNode root) {
        if(root == null) {
            return 0;
        } else if(root.left == null && root.right == null) {
            return 1;
        } else {
            int leftSubTreeNodeSize = sumTreeLeafNodeSize2(root.left);
            int rightSubTreeNodeSize = sumTreeLeafNodeSize2(root.right);
            return rightSubTreeNodeSize + leftSubTreeNodeSize;
        }
    }

    /**
     *求二叉树第K层的结点个数
     */
    public static int sumKLevelNodeSize(TreeNode root,int k) {
        if(root == null) {
            return 0;
        } else if(k == 1) {
            return 1;
        } else {
            int leftSubTreeK_1 = sumKLevelNodeSize(root.left,k-1);
            int rightSubTreeK_1 = sumKLevelNodeSize(root.right,k-1);
            return leftSubTreeK_1 + rightSubTreeK_1;
        }
    }

    /**
     * 求二叉树的高度
     */
    public static int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        } else if(root.left == null && root.right == null) {//可以和下面else合并
            return 1;
        } else {
            int leftTreeHeight = getHeight(root.left);
            int rightTreeHeight = getHeight(root.right);
            return Math.max(leftTreeHeight,rightTreeHeight)+1;
        }

    }

    /**
     * 二叉树中是否包含某个数
     */
    public static boolean containsTree(TreeNode root,char v) {
        if(root == null) {
            return false;
        } else {
            if(root.value == v) {
                return true;
            } else {
                boolean leftSubTreeContains = containsTree(root.left, v);
                if(leftSubTreeContains) {
                    return true;
                } else {
                    boolean rightSubTreeContains = containsTree(root.right,v);
                    if(rightSubTreeContains) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    public static boolean containsTree2(TreeNode root,char v) {
        if(root == null) {
            return false;
        }

        if(root.value == v) {
            return true;
        }

        boolean left = containsTree2(root.left,v);
        if(left) {
            return true;
        }
        return containsTree2(root.right,v);
    }

    /**
     * 返回包含v所在的节点
     */
    public static TreeNode containsTree3(TreeNode root,char v) {
        if(root == null) {
            return null;
        }

        if(root.value == v) {
            return root;
        }

        TreeNode leftContains = containsTree3(root.left, v);
        if(leftContains != null) {
            return leftContains;
        }
        return containsTree3(root.right,v);
    }

    /**
     * 返回node是不是以root为根的二叉树上的一个结点
     * 空树一律返回false，即使找的是null
     */
    public static boolean containsTree4(TreeNode root,TreeNode node) {
        if(root == null) {
            return false;
        }
        if(root == node) {
            return true;
        }
        boolean leftVontains = containsTree4(root.left, node);
        if(leftVontains) {
            return true;
        }

        return containsTree4(root.right,node);
    }

    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();
        System.out.println("树的结点个数："+sumTreeNodeSize(root));//10
        System.out.println("树的结点个数："+sumTreeNodeSize2(root));//10
        System.out.println("树的叶子结点个数："+sumTreeLeafNodeSize(root));//4
//        System.out.println("数的叶子结点个数："+sumTreeLeafNodeSize(root));//8
        System.out.println("树的叶子结点个数："+sumTreeLeafNodeSize2(root));//4
        System.out.println("树的第一层有："+sumKLevelNodeSize(root, 1)+"个结点");
        System.out.println("树的第四层有："+sumKLevelNodeSize(root, 4)+"个结点");
        System.out.println("树的高度："+getHeight(root));
        System.out.println("树中是否包含F:"+containsTree(root,'F'));
        System.out.println("树中是否包含F:"+containsTree2(root,'F'));
        System.out.println("树中包含F的结点:"+containsTree3(root, 'F').value);

    }
}
