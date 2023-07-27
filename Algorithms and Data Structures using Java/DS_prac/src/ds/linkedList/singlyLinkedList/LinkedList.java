package ds.linkedList.singlyLinkedList;

// Class to implement Singly Linked List
public class LinkedList {
	// head node
	private Node head;

	// Initialise empty Linked List
	public LinkedList() {
		this.head = null;
	}

	// Insert operation
	public boolean insert(int data) {
		// Create new node
		Node newNode = new Node(data);

		// check if valid node
		if (newNode == null)
			return false;

		// check if list is empty
		// insert new node at head
		if (head == null) {
			this.head = newNode;
			return true;
		}

		// if list is not empty
		// locate last node and insert at end
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

	// insert at given position
	public boolean insert(int data, int position) {
		// check for invalid position
		if ((head == null && position > 1) || position <= 0) {
			return false;
		}

		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		// if first postion insert at head
		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}

		// to insert at a different position
		// locate node previous to the postion
		// newNode -> prev and prev -> newNode

		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}

		newNode.setNext(prev.getNext());
		prev.setNext(newNode);

		return true;
	}

	// display linked list
	public void display() {
		// Create new node
		Node temp = head;
		System.out.print("Linked List: ");
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	// helper method for display using recursion
	public void displayRec(String reverse) {
		if (!reverse.contains("r"))
			display(head);
		else
			displayRev(head);

	}

	// delete by value
	public boolean deleteByValue(int data) {
		// check if list is empty
		if (head == null)
			return false;

		// if data is at head
		// point head to next node
		if (head.getData() == data) {
			head = head.getNext();
		}

		// if data is not at head, create 2 pointers
		Node prev = head, del = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

	// delete by position
	public boolean deleteByPostion(int position) {
		// check for invalid position
		if ((head == null && position > 1) || position <= 0) {
			return false;
		}

		// if first postion
		// set next of head to next node
		if (position == 1) {
			head = head.getNext();
			return true;
		}

		// to insert at a different position
		// locate node previous to the postion
		// newNode -> prev and prev -> newNode

		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}

		// node to delete
		Node del = prev.getNext();
		// set next reference of deletable node
		// to next of previous node
		prev.setNext(del.getNext());

		return true;
	}

	// Reverse a linked list
	public void reverse() {
		// if list is empty or has only one node
		if (head == null || head.getNext() == null) {
			return;
		}

		// Initialize 3 pointers-- head, next and null
		Node n1 = head, n2 = head.getNext(), n3 = null;

		while (n2 != null) {
			n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}

		head.setNext(null);
		head = n1;

	}

	// display using recursion
	public void display(Node head) {
		if (head == null)
			return;
		System.out.print(head.getData() + " ");
		display(head.getNext());
	}

	// display reverse
	public void displayRev(Node head) {
		if (head == null)
			return;
		displayRev(head.getNext());
		System.out.print(head.getData() + " ");
	}

}
