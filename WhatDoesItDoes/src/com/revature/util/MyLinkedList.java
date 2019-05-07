package com.revature.util;

public class MyLinkedList<T> {

	
	// The root node of our linked list, called the 'head'
	private Node<T> head;
	
	// The end node of our linked list, called the 'tail'
	private Node<T> tail;
	
	// insert a node at the end of the linked list
	public void insert(T data) {
		
		// create a new node object whose nextNode value is null, and contains some data
		Node<T> newNode = new Node<>(data, null);
		
		// if the head of this linked list is null, then the new node will become
		// the first and the last element of this list
		if(this.head == null) {
			System.out.println("List is empty...adding first element");
			this.head = newNode;
			this.tail = newNode;
		}
		
		// if there are elements in the linked list, then we will select the tail
		// set its next node to the new one we just created, and then set the tail
		// to the newly added node
		else {
			System.out.println("List has contents...adding new node to the tail of the list");
			this.tail.setNextNode(newNode);
			this.tail = newNode;
		}
	}
	
	// return, but do not remove, the first item in the list
	public T peek() {
		if(this.head != null) {
			return this.head.getData();
		}
		
		return null;
	}
	
	// remove and return the first item in the list (dequeuing)
	public T poll() {
		
		Node<T> firstNode = this.head;
		
		if(firstNode != null) {
			this.head = this.head.getNextNode();
			return firstNode.getData();
		}
		
		return null;
		
	}
	
	public boolean removeByKey(T key) {
		
		if(this.head == null) {
			return false;
		}
		
		// Create a reference to hold out current node
		Node<T> currentNode = this.head;
		
		// Create a reference to hold the next node (after the currentNode)
		Node<T> nextNode = currentNode.getNextNode();
		
		// If the currentNode has the data we want to delete, move the head to the next node
		if(currentNode.getData().equals(key)) {
			this.head = nextNode;
			return true;
		}
		
		// iterate across the linked list while currentNode is not null
		while(currentNode != null) {
			
			/*
			 * If the nextNode is not null and contains the data we want to delete, have the
			 * currentNode point to the node after nextNode and return true
			 */
			if(nextNode != null && nextNode.getData().equals(key)) {
				currentNode.setNextNode(nextNode.getNextNode());
				return true;
			}
			
			// advance currentNode to the next node in the list
			currentNode = currentNode.getNextNode();
			
			// if nextNode is not null, then advance the next node to the one after it
			if(nextNode != null) nextNode = nextNode.getNextNode();
			
		}
		
		return false;
	}
	
	// convenience method for printing the list contents
	public void printList() {
		
		// start with the head of this list
		Node<T> currentNode = this.head;
		
		// while currentNode is not null, print out the node information and move on to the next node
		while(currentNode != null) {
			System.out.println("Node Value: " + currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}
}


