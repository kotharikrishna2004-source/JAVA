<%@ page import="Model.Reg, Model.Blog" %>
<%
    HttpSession session1 = request.getSession(false);
    if(session1 == null || session1.getAttribute("user") == null){
        response.sendRedirect("login.jsp");
        return;
    }
    Blog blog = (Blog) request.getAttribute("blog");
    if (blog == null) {
        response.sendRedirect("viewBlogs.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Blog</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Edit Blog</h2>
    <form action="UpdateBlog" method="post">
        <input type="hidden" name="id" value="<%= blog.getId() %>">
        <div class="mb-3">
            <label>Title</label>
            <input type="text" name="title" class="form-control" value="<%= blog.getTitle() %>" required>
        </div>
        <div class="mb-3">
            <label>Content</label>
            <textarea name="content" class="form-control" rows="5" required><%= blog.getContent() %></textarea>
        </div>
        <div class="mb-3">
            <label>Tags</label>
            <input type="text" name="tags" class="form-control" value="<%= blog.getTags() %>">
        </div>
        <button class="btn btn-primary">Update Blog</button>
        <a href="viewBlogs.jsp" class="btn btn-secondary">Cancel</a>
    </form>
</div>
</body>
</html>
