package com.revature;

import com.revature.util.BinaryTree;

public class Driver {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        System.out.println("The binary tree contains the value 8: " + bt.containsValue(8));
        System.out.println("The binary tree contains the value 10: " + bt.containsValue(10));

    }
}
