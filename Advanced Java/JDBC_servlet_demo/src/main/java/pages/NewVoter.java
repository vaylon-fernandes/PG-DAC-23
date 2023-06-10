package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewVoter
 */
@WebServlet("/newvoter")
public class NewVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewVoter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(PrintWriter pw=response.getWriter()){
			pw.print("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "    <title>Voter Registration</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <h2>Voter Registration Form</h2>\r\n"
					+ "    <form action=\"RegisterVoterServlet\" method=\"POST\">\r\n"
					+ "        <label for=\"first_name\">First Name:</label>\r\n"
					+ "        <input type=\"text\" id=\"first_name\" name=\"first_name\" required><br>\r\n"
					+ "\r\n"
					+ "        <label for=\"last_name\">Last Name:</label>\r\n"
					+ "        <input type=\"text\" id=\"last_name\" name=\"last_name\" required><br>\r\n"
					+ "\r\n"
					+ "        <label for=\"email\">Email:</label>\r\n"
					+ "        <input type=\"email\" id=\"email\" name=\"email\" required><br>\r\n"
					+ "\r\n"
					+ "        <label for=\"password\">Password:</label>\r\n"
					+ "        <input type=\"password\" id=\"password\" name=\"password\" required><br>\r\n"
					+ "\r\n"
					+ "        <label for=\"dob\">Date of Birth:</label>\r\n"
					+ "        <input type=\"date\" id=\"dob\" name=\"dob\" required><br>\r\n"
					+ "\r\n"
					+ "        <input type=\"submit\" value=\"Register\">\r\n"
					+ "    </form>\r\n"
					+ "</body>\r\n"
					+ "</html>\r\n"
					+ "");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
