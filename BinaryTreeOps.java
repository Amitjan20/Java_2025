import java.util.*;

public class BinaryTreeOps {

    public static void main(String[] args) {

        BinaryTreeNode Child2 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode leftChild2 = new BinaryTreeNode(6, null, null);
        BinaryTreeNode rightChild2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode leftChild1 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode rightChild1 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode leftChild = new BinaryTreeNode(2, null, null);
        BinaryTreeNode rightChild = new BinaryTreeNode(3, null, null);
        BinaryTreeNode root = new BinaryTreeNode(1, null, null);
        root.setLeft(leftChild);
        root.setRight(rightChild);
        leftChild.setLeft(leftChild1);
        leftChild.setRight(rightChild2);
        rightChild.setLeft(leftChild2);
        rightChild.setRight(Child2);

        leftSideView(root);
        //rightSideView(root);
        //topSideView(root);
        //bottomSideView(root);
    }

    private static void bottomSideView(BinaryTreeNode root) {
        Map<Integer, BinaryTreeNode> map = new TreeMap<Integer,BinaryTreeNode>();
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        root.height = 0;
        queue.add(root);
        map.put(root.height, root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            if(node.left != null) {
                node.left.height = node.height - 1;
                queue.add(node.left);
                map.put(node.left.height, node.left);
            }
            if(node.right != null) {
                node.right.height = node.height + 1;
                queue.add(node.right);
                map.put(node.right.height, node.right);
            }
        }
        for(Map.Entry<Integer, BinaryTreeNode> entry : map.entrySet()) {
            System.out.print(entry.getValue().getVal() + " ");
        }
    }

    private static void topSideView(BinaryTreeNode root) {
        Map<Integer, BinaryTreeNode> map = new TreeMap<Integer,BinaryTreeNode>();
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        root.height = 0;
        queue.add(root);
        map.put(root.height, root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            if(node.left != null) {
                node.left.height = node.height - 1;
                queue.add(node.left);
                if(!map.containsKey(node.left.height)) {
                    map.put(node.left.height, node.left);
                }
            }
            if(node.right != null) {
                node.right.height = node.height + 1;
                queue.add(node.right);
                if(!map.containsKey(node.right.height)) {
                    map.put(node.right.height, node.right);
                }
            }
        }
        for(Map.Entry<Integer, BinaryTreeNode> entry : map.entrySet()) {
            System.out.print(entry.getValue().getVal() + " ");
        }

    }

    private static void rightSideView(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode node = queue.poll();
                if (i == size - 1) {
                    System.out.print(node.getVal() + " ");
                }
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
        }
    }

    private static void leftSideView(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode node = queue.poll();
                if (i == 0) {
                    System.out.print(node.getVal() + " ");
                }
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
        }
    }
}

class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    int height;

    BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;

    }

    //getters and setters
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public BinaryTreeNode getLeft() {
        return left;
    }
    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }
    public BinaryTreeNode getRight() {
        return right;
    }
    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}
