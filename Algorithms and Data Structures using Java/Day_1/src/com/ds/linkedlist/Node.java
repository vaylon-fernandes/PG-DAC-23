package com.ds.linkedlist;

public class Node { // represents a node
	private int data; 
	private Node next;
	
	public Node() {
		data = 0;
		next = null;
	}
	
	public Node(int data) {
		this.data = data; // holds data
		this.next = null; // reference to the next node
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	} 
	
}
