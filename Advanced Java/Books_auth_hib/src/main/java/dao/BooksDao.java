package dao;

import java.sql.SQLException;

import pojos.Books;

public interface BooksDao {
	public String addBook(Books newBook,String authorMail) throws SQLException;
}
