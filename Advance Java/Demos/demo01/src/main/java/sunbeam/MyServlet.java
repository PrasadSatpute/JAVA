package sunbeam;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.servlet.annotation.*;

@WebServlet("/hello") // url-pattern
public class MyServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("MyServlet.init() called.");
	}
	@Override
	public void destroy() {
		System.out.println("MyServlet.destroy() called.");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("MyServlet.doGet() called.");
		processRequest(req, resp);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("MyServlet.doPost() called.");
		processRequest(req, resp);
	}
	public void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// business logic
		// presentation logic
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Java EE</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Hello My Servlet</h2>");
		out.println("<h5>Response generated at: " + new Date() + "</h5>");
		out.println("</body>");
		out.println("</html>");
	}
}
