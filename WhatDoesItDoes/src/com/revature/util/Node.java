package com.revature.util;

public class Node<T> {
	
	private T data;
	private Node<T> nextNode;
	
	public Node(T info, Node<T> next) {
		super();
		this.data = info;
		this.nextNode = next; 
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T newData) {
		this.data = newData;
	}
	
	public Node<T> getNextNode() {
		return this.nextNode;
	}
	
	public void setNextNode(Node<T> newNode) {
		this.nextNode = newNode;
	}

}
