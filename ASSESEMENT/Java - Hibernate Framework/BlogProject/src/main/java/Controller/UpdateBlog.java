package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Blog;
import Model.Reg;
import Session.BlogManage;

@WebServlet("/UpdateBlog")
public class UpdateBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateBlog() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Blog b = new BlogManage().getBlogById(id);
        request.setAttribute("blog", b);
        request.getRequestDispatcher("editBlog.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		Reg user = (session != null) ? (Reg) session.getAttribute("user") : null;

		if (user != null) {
            int id = Integer.parseInt(request.getParameter("id"));
			String title   = request.getParameter("title");
			String content = request.getParameter("content");
			String tags    = request.getParameter("tags");

			BlogManage blogManage = new BlogManage();
            Blog blog = blogManage.getBlogById(id);
            
            if (blog != null && blog.getUser_id() == user.getId()) {
                blog.setTitle(title);
                blog.setContent(content);
                blog.setTags(tags);
                blogManage.updateBlog(blog);
            }

			response.sendRedirect("viewBlogs.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}
}
