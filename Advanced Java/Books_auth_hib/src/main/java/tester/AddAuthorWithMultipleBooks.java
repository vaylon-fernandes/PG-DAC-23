package tester;

import org.hibernate.*;

import dao.AuthorDao;
import dao.AuthorDaoImpl;
import pojos.Author;
import pojos.Books;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

public class AddAuthorWithMultipleBooks {
	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			AuthorDao dao = new AuthorDaoImpl();
			System.out.println("Enter author details(first name, last name, email, password");
			Author newAuthor = new Author(sc.next(), sc.next(), sc.next(), sc.next());
			for (int i = 0; i < 2; i++) {
				System.out.println("Enter book name and price");
				Books newBook = new Books(sc.next(),sc.nextDouble());
				newAuthor.addBook(newBook);
			}
			System.out.println(dao.addAuthor(newAuthor));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
