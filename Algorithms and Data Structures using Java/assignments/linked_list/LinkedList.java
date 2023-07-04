package assignments.linked_list;

public class LinkedList {
	Node head;

	public LinkedList() {
		// set head to null at the start
		this.head = null;
	}

	public boolean insertAtBeg(int data) {
		// initialise node
		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		// if head is null list is empty
		// point head to new node
		if (head == null) {
			head = newNode;
		} else {
			// if list is not empty

			// point newNode to reference of head node i.e. first node
			newNode.setNext(head);
			// point head to new node
			head = newNode;
			return true;
		}
		return false;
	}

	public boolean insertAtEnd(int data) {
		// initialise node
		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		// if head is null list is empty
		// point head to new node
		if (head == null) {
			head = newNode;
		} else {
			// if list is not empty
			// traverse the list and find last node
			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			// set reference of new node to last nodes next
			last.setNext(newNode);
			return true;
		}
		return false;
	}

	public boolean deleteAtBeg() {
		if (head != null) {
			head = head.getNext();
		}
		return false;
	}

	public boolean deleteAtEnd() {
		// locate the last node (to delete)
		// and keep a track of the previous node
		// remove reference of last node from previous node by setting reference of next
		// to reference of last node next
		Node prev = head, del = head;
		while (del.getNext() != null) {
			prev = del;
			del = del.getNext();
		}
		prev.setNext(del.getNext());
		return true;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

}
