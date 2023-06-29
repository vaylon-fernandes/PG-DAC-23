package com.ds.linkedlist;

import java.util.Stack;

public class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null; // Initially head is set to null as there are no nodes
	}

	public boolean insert(int data) {
		// create and initialize the node
		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		// if list is empty,new node becomes the first node
		if (head == null) {
			head = newNode;
			return true;
		}

		// If list is not empty, locate the last node and

		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		// link new node to last node
		last.setNext(newNode);

		return true;
	}

	public boolean insert(int data, int position) {
		// check for valid position
		if (position <= 0) {
			return false;
		}

		// create and initialize the node
		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		if (position == 1) {
			newNode.setNext(head); // link new node to current head reference
			head = newNode; // set reference of head node to new node
			return true;
		}

		// position is not 1, locate the node at pos -1
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false; // position is invalid
			}
		}

		newNode.setNext(prev.getNext()); // get reference of next node
		prev.setNext(newNode); // set reference of previous node to next node

		return true;
	}

	public boolean delete(int position) {
		//Node temp = head;

		// check for valid position
		if (position <= 0) {
			return false;
		}
		
		if (position == 1) {
			head = head.getNext();
			return true;
		}
		//locate prev node
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false; // invalid position
            }
        }
        Node currNode = prev.getNext(); // pos-1
        Node nextNode = currNode.getNext(); // node to delete 
        prev.setNext(nextNode); // set link of previous node to next node
        currNode.setNext(null); // remove link of next node and current node
		return true;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData()+ " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void displayRev() {
		Node temp = head;
		Stack<Node> s = new Stack<Node>();

		while (temp != null) {
			s.push(temp);
			temp = temp.getNext();
		}

		while (!s.isEmpty()) {
			System.out.println(s.pop().getData() + " ");
		}
	}

	public void displayRev(Node head) {
		if (head == null) {
			return;
		}

		displayRev(head.getNext());
		System.out.println(head.getData() + " ");
	}
//	public void createLinkedList() {
//		Node node1 = new Node(10); // new node 
//		this.head = node1;         // head points to first node 
//		
//		Node node2 = new Node(20); // new node 
//		node1.next = node2;        // node 1 has reference of node 2 
//		
//		Node node3 = new Node(30); // new node 
//		node2.next = node3;			// node 2 has reference of node 3
//	}
//	
//	public void append(Node newNode) {
//		Node current = this.head;
//		
//		if(current == null) { // if head is null, list is empty
//			this.head = newNode; // append new node reference to head
//		}
//		else {
//			while(current.next!=null) { // iter till null node is found (tail)
//				current = current.next; 
//			}
//			current.next = newNode; // append data to tail
//		}
//	}

}
