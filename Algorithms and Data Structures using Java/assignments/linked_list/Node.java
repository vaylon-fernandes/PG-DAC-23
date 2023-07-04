package assignments.linked_list;

public class Node {
	// Node having data and reference to next 
	private int data; 
	private Node next;
	
	public Node() {
		data = 0; 
		next = null;
	}
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
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

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	} 
	
	
}
