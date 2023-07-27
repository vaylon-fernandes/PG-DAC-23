package ds.linkedList.singlyLinkedList;

// Class to create nodes for Singly Linked List 
public class Node {
	// Data and Next fields 
	private int data;
	private Node next; 
	
	// Create node, Data contains value 
	// Next node points to null 
	public Node(int data) {
		this.data = data; 
		this.next = null; 
	}
	
	// getters and setters
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

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
	
}
