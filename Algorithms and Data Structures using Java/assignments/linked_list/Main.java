package assignments.linked_list;
public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.display();

        l1.insertAtBeg(10);
        l1.display();

        l1.insertAtBeg(20);
        l1.display();

        l1.insertAtBeg(30);
        l1.display();

        l1.insertAtBeg(40);
        l1.display();

        l1.insertAtBeg(50);
        l1.display();

        l1.insertAtBeg(60);
        l1.display();

        l1.insertAtBeg(70);
        l1.display();

        l1.insertAtBeg(100);
        l1.display();
        
        l1.insertAtEnd(77);
        l1.display();
        
        l1.insertAtEnd(88);
        l1.display();
        System.out.println("delete at beg");
        l1.deleteAtBeg();
        l1.display();
        
        l1.deleteAtBeg();
        l1.display();
        l1.deleteAtEnd();
        l1.display();

        l1.deleteAtEnd();
        l1.display();


    }
}
