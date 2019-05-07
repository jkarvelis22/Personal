package com.revature.util;


public class BinaryTree {

    private Node root;

    public void add(int value) {
        this.root = addRecursively(this.root, value);

    }

    private Node addRecursively(Node currentNode, int value) {

        //if the node passed to this method is null return a new node containing the value
        if (currentNode == null) {
            System.out.println("The current node is null");
            System.out.println("Creating a new node to be added to the tree");
            return new Node(value);
        }

        /*
        If the value being added is less than the value of the current node, recursively
        invoke the addRecursively method to attempt to add a new value to the left child
        of the current node.
         */

        if (value < currentNode.getData()) {
            System.out.println("The new value is less than the current nodes value");
            System.out.println("Attempting to add a new value to the left of the child node.\n");
            currentNode.setLeftChild(addRecursively(currentNode.getLeftChild(), value));
        }

             /*
        If the value being added is greater than the value of the current node, recursively
        invoke the addRecursively method to attempt to add a new value to the right child
        of the current node.
         */

        else if (value > currentNode.getData()) {
            System.out.println("The new value is greater than the current nodes value");
            System.out.println("Attempting to add a new value to the right child node.\n");
            currentNode.setRightChild(addRecursively(currentNode.getRightChild(), value));
        }

           /*If the value being added is neither less or greater than the value of the current node,
           simply return the current node.
            */
        return currentNode;
    }

    public boolean containsValue(int value) {

    }
    private boolean containsValueRecursive(Node currentNode, int value){

        /*if the current node is null, then the sought value is not stored within the tree, so return false.
         */

        if (currentNode == null) {
            return false;

        }
        /*
        If the value contained within the current node is equal to the sought value, return
        true.
         */
        if (value == currentNode.getData()) {
            return true;
        }

        /*
        If the sought value is less than the value stored in the current node, then we know that we need
        to explore the nodes to the left of the current node
         */

        /*
        If the sought value is greater than the value stored in the current node, then we know that we need
        to explore the nodes to the right of the current node
         */


        return (value < currentNode.getData()) ?
                containsValueRecursive(currentNode.getLeftChild(), value)
                :
                containsValueRecursive(currentNode.getRightChild(), value);





    }
}



