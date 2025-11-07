package com.esi.dwr.lock;

import java.util.*;

public class MaxValAtEachLevel {

    public static void main(String[] args) {
        MaxValAtEachLevel obj = new MaxValAtEachLevel();
        BinaryTree root = new BinaryTree(1);
        root.setLeft(new BinaryTree(2));
        root.setRight(new BinaryTree(3));

        root.getLeft().setLeft(new BinaryTree(4));
        root.getLeft().setRight(new BinaryTree(5));

        root.getRight().setLeft(new BinaryTree(6));
        root.getRight().setRight(new BinaryTree(7));

        levelOrderTraversal(root);
    }

    private static void levelOrderTraversal(BinaryTree root) {

        Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
        List<Integer> list = new LinkedList<Integer>();
        int level = 0;
        queue.add(root);
        queue.add(null);
        List<Integer> currLevel = new ArrayList<Integer>();
        List<Integer> finalResult = new ArrayList<>();
        finalResult.add(root.getValue());
        while (!queue.isEmpty()) {
            BinaryTree current = queue.remove();
            if(current == null) {
                if(!queue.isEmpty()) {
                    queue.add(null);
                }
                int maxInLevel = Collections.max(currLevel);
                finalResult.add(maxInLevel);
            }else{
                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                    currLevel.add(current.getLeft().getValue());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                    currLevel.add(current.getRight().getValue());
                }
            }
        }

        finalResult.remove(finalResult.size() - 1);
        finalResult.forEach(System.out::println);
    }


}

class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
    }

    // generate getters and setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }


}
