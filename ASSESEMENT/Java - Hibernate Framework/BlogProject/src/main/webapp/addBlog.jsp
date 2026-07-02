<%@ page import="Model.Reg" %>
<%
    HttpSession session1 = request.getSession(false);
    if(session1 == null || session1.getAttribute("user") == null){
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Blog</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>Add Blog</h2>
    <form action="Blogservlet" method="post">
        <div class="mb-3">
            <label>Title</label>
            <input type="text" name="title" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Content</label>
            <textarea name="content" class="form-control" required></textarea>
        </div>
        <div class="mb-3">
            <label>Tags</label>
            <input type="text" name="tags" class="form-control">
        </div>
        <button class="btn btn-primary">Add Blog</button>
    </form>
</div>
</body>
</html>
