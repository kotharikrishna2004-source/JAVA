package Controller;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Blog;
import Model.Reg;
import Session.BlogManage;

@WebServlet("/Blogservlet")
public class Blogservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Blogservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("addBlog.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		Reg user = (session != null) ? (Reg) session.getAttribute("user") : null;

		if (user != null) {
			String title   = request.getParameter("title");
			String content = request.getParameter("content");
			String tags    = request.getParameter("tags");

			Blog blog = new Blog(title, content, tags);
			blog.setUser_id(user.getId());
			blog.setCreatedAt(new Date());

			BlogManage blogManage = new BlogManage();
			blogManage.saveBlog(blog);

			response.sendRedirect("viewBlogs.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}
}
