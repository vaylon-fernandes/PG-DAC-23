import java.util.Scanner;

public class PizzaShop {

	public static void main(String[] args) {
	int choice, quantity;
	float price, amount=0;
	
	Scanner sc = new Scanner(System.in);
	
	do {
	System.out.println("\nMenu");
	System.out.println("1. Cheese Burst Pizza Rs. 110\n2.Veggy Delight Pizza Rs. 120\n3.Pepperoni Pizza Rs.130"
			+ "\n4. Bill\n5. Exit");
	System.out.println("Enter Your Choice: ");
	choice = sc.nextInt();
	switch(choice) {
	case 1: 
		System.out.println("How many would you like? ");
		quantity = sc.nextInt();
		price = 110;
		amount+=quantity*price;
		System.out.println("Current Amount"+amount);
		break;
	case 2: 
		System.out.println("How many would you like? ");
		quantity = sc.nextInt();
		price = 120;
		amount+=quantity*price;
		System.out.println("Current Amount"+amount);
		break;
	case 3: 
		System.out.println("How many would you like? ");
		quantity = sc.nextInt();
		price = 130;
		amount+=quantity*price;
		System.out.println("Current Amount"+amount);
		break;
	case 4: 
		System.out.println("Total Amount: "+amount+"Enjoy your pizza!!");
		break;
	case 5: 
		System.out.println("Bye!!! Do come back!!!");
		break;
	default: 
		System.out.println("Invalid Choice. Try Again.");
	}
	}while(choice!=5);
	}

}
