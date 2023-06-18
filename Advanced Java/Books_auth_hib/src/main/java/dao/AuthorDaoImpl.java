package dao;

import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import  static utils.HibernateUtils.getFactory;
import pojos.Author;

public class AuthorDaoImpl implements AuthorDao{

	@Override
	public String addAuthor(Author newAuthor) throws SQLException {
		String mesg = "Adding author failed";
		// 1 get seesion from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(newAuthor);
			tx.commit();
			mesg = "Author added: ";
		}
		catch (RuntimeException e) {
			// TODO: handle exception
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		return mesg;
	}

}
