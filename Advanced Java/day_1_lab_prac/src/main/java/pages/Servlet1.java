package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/test1",loadOnStartup = 2)
// Webcontainer reads this only once. At the web app dep time
// WC creates an empty map and then populates it
// WC populates the URL map
// key="/test1" value=pages.Servelet1
public class Servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In do get: "+Thread.currentThread());
		// set response content type (setting a resp header content-type:text/html)
		resp.setContentType("text/html");
		// get thr Print Writer to write the character type buffer data to the client
		try(PrintWriter pw = resp.getWriter()){
			pw.print("<h4>Welcome to servelet:"+getClass()+"TS"+LocalDateTime.now()+"</h4>");
		} // W
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("In Destroy: "+Thread.currentThread());
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("In Init: "+Thread.currentThread());
	}
	

}
