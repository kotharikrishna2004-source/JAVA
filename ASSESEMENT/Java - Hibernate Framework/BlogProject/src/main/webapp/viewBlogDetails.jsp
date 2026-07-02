<%@ page import="java.util.*, Session.BlogManage, Model.Blog, Model.Reg" %>
<%
    HttpSession session1 = request.getSession(false);
    if(session1 == null || session1.getAttribute("user") == null){
        response.sendRedirect("login.jsp");
        return;
    }
    String idStr = request.getParameter("id");
    if (idStr == null) {
        response.sendRedirect("viewBlogs.jsp");
        return;
    }
    int id = Integer.parseInt(idStr);
    BlogManage dao = new BlogManage();
    Blog blog = dao.getBlogById(id);
    if (blog == null) {
        response.sendRedirect("viewBlogs.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title><%= blog.getTitle() %></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <a href="viewBlogs.jsp" class="btn btn-outline-secondary mb-3">&larr; Back to Blogs</a>
    <div class="card shadow-sm">
        <div class="card-body">
            <h2 class="card-title"><%= blog.getTitle() %></h2>
            <h6 class="card-subtitle mb-2 text-muted">Posted on: <%= blog.getCreatedAt() %></h6>
            <span class="badge bg-info text-dark mb-4"><%= blog.getTags() %></span>
            <p class="card-text" style="white-space: pre-wrap;"><%= blog.getContent() %></p>
        </div>
    </div>
</div>
</body>
</html>
