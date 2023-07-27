package ds.linkedList.doublyLinkedList;

// Class to implement Singly Linked List
public class DoublyLinkedList {
	// head node
	private Node head;

	// Initialise empty Linked List
	public DoublyLinkedList() {
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
		newNode.setPrev(last);
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
			if(head!=null) {
			newNode.setNext(head);
			head.setPrev(newNode);
			}
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

		Node next = prev.getNext();
		newNode.setPrev(prev);
		prev.setNext(newNode);
		if(next!=null) {
			newNode.setNext(next);
			next.setPrev(newNode);
		}
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

	

	// delete by value
	public boolean deleteByValue(int data) {
		// check if list is empty
		if (head == null)
			return false;

		// if data is at head
		// point head to next node
		if (head.getData() == data) {
			head = head.getNext();
			if(head!=null) {
				head.setPrev(null);
			}
			return true;
		}

		// if data is not at head, create 2 pointers
		Node del = head;
		while (del.getData() != data) {
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		Node prev = del.getPrev();
		Node next = del.getNext();
		
		prev.setNext(next);
		if(next!=null)
			next.setPrev(prev);
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
			if(head!=null)
				head.setPrev(null);
			return true;
		}

		// to insert at a different position
		// locate node previous to the postion
		// newNode -> prev and prev -> newNode

		Node del = head;
		for (int i = 1; i < position - 1; i++) {
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}

		
		Node next = del.getNext();
		Node prev = del.getPrev();
		// set next reference of deletable node
		// to next of previous node
		prev.setNext(next);
		if(next!=null)
			next.setPrev(prev);
		return true;
	}

	// Reverse a linked list
		// display using recursion
	public void display(Node head) {
		if (head == null)
			return;
		System.out.print(head.getData() + " ");
		display(head.getNext());
	}

	

}
