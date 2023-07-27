package ds.linkedList.doublyLinkedList;

// Class to create nodes for Singly Linked List 
public class Node {
	// Data and Next fields 
	private int data;
	private Node next,prev; 
	
	// Create node, Data contains value 
	// Next node points to null 
	public Node(int data) {
		this.data = data; 
		this.next = null;
		this.prev = null;
	}
	
	// getters and setters
	public int getData() {
		return data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
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
