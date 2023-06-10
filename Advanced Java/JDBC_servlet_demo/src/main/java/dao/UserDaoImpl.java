package dao;

import java.sql.*;

import pojos.User;

import static utils.DBUtils.*;

public class UserDaoImpl implements UserDao{
	private Connection cn;
	private PreparedStatement pst1;
	private PreparedStatement pst2;
	
	public UserDaoImpl() throws SQLException {
		// open conn
		cn = openConnection();
		pst1 = cn.prepareStatement("select * from users where email=? and password=?"); // Why PST? TO avoid SQL injection. Efficiency
		pst2 = cn.prepareStatement("INSERT INTO users (first_name, last_name, email, password, dob, status, role) "
                + "VALUES (?, ?, ?, ?,?,?,?)");
		System.out.println("user dao created!");
	}

	@Override
	public User authenticateUser(String email, String password) throws SQLException {
		pst1.setString(1, email);
		pst1.setString(2, password);
		try(ResultSet rst=pst1.executeQuery()){
			if(rst.next())
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), email, password, 
						rst.getDate(6), rst.getBoolean(7), rst.getString(8));
		}
		return null;
	}
	
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		closeConnection();
		System.out.println("user dao cleaned up!");
	}

	@Override
	public void registerVoter(User voter) throws SQLException {
		// TODO Auto-generated method stub
		/*
		 * int id, String firstName, String lastName, String email, 
		 * String password, Date dob,
	boolean votingStatus, String role
		 */
		pst2.setString(1, voter.getFirstName());
		pst2.setString(2, voter.getLastName());
		pst2.setString(3, voter.getEmail());
		pst2.setString(4, voter.getPassword());
		pst2.setDate(5, voter.getDob());
		pst2.setBoolean(6, voter.isVotingStatus());
		pst2.setString(7, voter.getRole());
		int rows=pst2.executeUpdate();
			System.out.println("Updated "+rows);
		
	}
	
}
