package dao;
import java.sql.SQLException;
import pojos.*;

public interface UserDao {
	User authenticateUser(String email, String password) throws SQLException;
    void registerVoter(User voter) throws SQLException;
}
