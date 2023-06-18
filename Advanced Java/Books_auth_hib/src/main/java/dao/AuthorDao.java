package dao;

import java.sql.SQLException;

import pojos.Author;

public interface AuthorDao {
	public String addAuthor(Author newAuthor) throws SQLException;
}
