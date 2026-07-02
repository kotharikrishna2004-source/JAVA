package Http_and_Genric;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class get_and_post_handle
 */
@WebServlet("/get_and_post_handle")
public class get_and_post_handle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public get_and_post_handle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		response.setContentType("text/html");
		out.println("<h1>Welcome to get method</h1>");
		out.println("<h2>Name: "+name+"</h2>");
		out.println("<h2>Email: "+email+"</h2>");
		out.println("<h2>Password: "+password+"</h2>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		response.setContentType("text/html");
		out.println("<h1>Welcome to post method</h1>");
		out.println("<h2>Name: "+name+"</h2>");
		out.println("<h2>Email: "+email+"</h2>");
		out.println("<h2>Password: "+password+"</h2>");
	}

}
