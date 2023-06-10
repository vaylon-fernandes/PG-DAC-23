package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import pojos.User;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDaoImpl;

/**
 * Servlet implementation class RegisterVoterServlet
 */
@WebServlet("/RegisterVoterServlet")
public class RegisterVoterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	public void init() throws ServletException {
		try {
			// create dao instance
			userDao = new UserDaoImpl();
		} catch (Exception e) {
			// re throw the exc to the caller (WC) , so that WC DOES NOT continue with the
			// rest of the servlet life cycle
			throw new ServletException("err in init of " + getClass(), e);
		}
	}
	
    public RegisterVoterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter pw = response.getWriter()) {
            String firstName = request.getParameter("first_name");
            String lastName = request.getParameter("last_name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String dobString = request.getParameter("dob");

            // Perform age validation
            Date dob = Date.valueOf(dobString);
            Date currentDate = new Date(System.currentTimeMillis());
            int age = (int) ((currentDate.getTime() - dob.getTime()) / (1000L * 60 * 60 * 24 * 365));
            if (age > 21) {
                User voter = new User();
                voter.setFirstName(firstName);
                voter.setLastName(lastName);
                voter.setEmail(email);
                voter.setPassword(password);
                voter.setDob(dob);
                voter.setVotingStatus(false);
                voter.setRole("voter");

                // Insert voter details into the database
                userDao.registerVoter(voter);
                
                pw.println("<h4>Voter registered successfully!</h4>");
                pw.println("<p>You can now <a href='index.html'>login</a> to cast your vote.</p>");
            } else {
                pw.println("<h4>Error: Voter must be at least 21 years old.</h4>");
                pw.println("<p>Please <a href='VoterRegistration.html'>retry</a> with a valid date of birth.</p>");
            }
        } catch (SQLException e) {
            throw new ServletException("Error in doPost of " + getClass(), e);
        }
    }	

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			// clean up dao
			userDao.cleanUp();
		} catch (Exception e) {
			System.out.println("err in destroy of " + getClass() + " " + e);
		}
	}

}
