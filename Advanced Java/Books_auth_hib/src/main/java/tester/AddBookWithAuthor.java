package tester;

import org.hibernate.*;

import dao.BooksDaoImpl;
import pojos.Books;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

//public class AddBookWithAuthor {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try(SessionFactory sf = getFactory();Scanner sc=new Scanner(System.in)){
//			BooksDaoImpl dao = new BooksDaoImpl();
//			System.out.println("Enter Book Name and Price");
//			Books book = new Books(sc.next(),sc.nextDouble());
//			System.out.println("Enter authors mail");
//			String msg = dao.addBook(book, sc.next());
//			System.out.println(msg);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//
//	}
//
//}

public class AddBookWithAuthor {

    public static void main(String[] args) {
        try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
            BooksDaoImpl dao = new BooksDaoImpl();
            System.out.println("Enter Book Name and Price");
            Books book = new Books(sc.next(), sc.nextDouble());
            System.out.println("Enter author's email");
            String msg = dao.addBook(book, sc.next());
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

