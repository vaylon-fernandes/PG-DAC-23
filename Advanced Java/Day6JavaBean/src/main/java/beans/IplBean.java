package beans;

import java.sql.SQLException;
import java.util.List;

import dao.TeamDaoImpl;
import pojos.Team;

public class IplBean {
	private TeamDaoImpl teamDao; 
	public IplBean() throws SQLException { // Default ctr
		teamDao = new TeamDaoImpl(); // Dao Layer instance
	}
	
	// getters and setters
	public TeamDaoImpl getTeamDao() {
		return teamDao;
	}
	public void setTeamDao(TeamDaoImpl teamDao) {
		this.teamDao = teamDao;
	}
	
	// add BL method to ret list of all teams to the caller (JSP)
	
	public List<Team> getAllTeams() throws SQLException{
		// invoke daos method
		return teamDao.getSelectedDetails();
	}
}
