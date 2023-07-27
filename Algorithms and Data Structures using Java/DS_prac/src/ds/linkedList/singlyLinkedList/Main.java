package ds.linkedList.singlyLinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();

		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(56);
		for (int i = 0; i < 10; i++)
			l1.insert(i);
		l1.display();
		System.out.println("Display using recursion");
		l1.displayRec("");
		System.out.println("Display Reverse");
		l1.displayRec("reverse");
		System.out.println();
		System.out.println(l1.insert(50, 1));
		System.out.println(l1.insert(50, 10));
		System.out.println(l1.insert(50, 0));
		l1.display();
		l1.deleteByPostion(2);
		l1.display();
		l1.deleteByValue(50);
		l1.display();
		System.out.println(l1.deleteByValue(9));
		l1.display();
		l1.reverse();
		l1.display();
	}
}
