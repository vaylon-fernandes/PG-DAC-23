package dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import static utils.HibernateUtils.getFactory;
import pojos.Author;
import pojos.Books;

public class BooksDaoImpl implements BooksDao {

	@Override
	public String addBook(Books newBook, String authorMail) throws SQLException {
		// TODO Auto-generated method stub
		String mesg = "Adding book failed!!";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try{
			
			String jpql = "select a from Author a where a.email=:em";
			Author author = (Author) session.createQuery(jpql).setParameter("em", authorMail).getSingleResult();
			if (author != null) {

				author.addBook(newBook);
				session.persist(newBook);
				tx.commit();
				mesg = "Added new book for author " + newBook.getAuthor();
			}
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
