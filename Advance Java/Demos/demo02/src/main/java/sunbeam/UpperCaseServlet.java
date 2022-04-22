package sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/upper")
public class UpperCaseServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// business logic
		//	1. take user input from the request
		String uname = req.getParameter("uname");
		// 	2. convert into capital case
		String capName = uname.toUpperCase();
		// presentation logic
		//	3. generate dynamic HTML output
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cap Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Name: " + uname + "<br/>");
		out.println("Capital: " + capName + "<br/>");
		out.println("</body>");
		out.println("</html>");
	}
}




