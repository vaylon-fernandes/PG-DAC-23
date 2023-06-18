package tester;

import org.hibernate.SessionFactory;

import dao.AuthorDaoImpl;
import pojos.Author;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

public class AddAuthorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (SessionFactory sf = getFactory();Scanner sc=new Scanner(System.in)) {
			AuthorDaoImpl dao = new AuthorDaoImpl();
			System.out.println("Enter author details(first name, last name, email, password");
			System.out.println(dao.addAuthor(new Author(sc.next(),sc.next(),sc.next(),sc.next())));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
