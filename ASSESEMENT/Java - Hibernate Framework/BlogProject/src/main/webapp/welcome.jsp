<%@ page import="Model.Reg" %>
<%@ page session="true" %>
<%
    HttpSession session1 = request.getSession(false);
    if(session1 == null || session1.getAttribute("user") == null){
        response.sendRedirect("login.jsp");
        return;
    }
    Reg user = (Reg) session1.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background: linear-gradient(to right, #667eea, #764ba2); color: white; }
        .card { border-radius: 15px; }
        .btn-custom { width: 100%; }
    </style>
</head>
<body>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow-lg p-4 text-center">
                <h2 class="mb-3">Welcome 👋 </h2>
                <h5 class="text-dark">Username: <%= user.getName() %></h5>
                <p class="text-muted">Email: <%= user.getEmail() %></p>
                <hr>
                <div class="d-grid gap-2">
                    <a href="addBlog.jsp" class="btn btn-primary btn-custom"> Add Blog</a>
                    <a href="viewBlogs.jsp" class="btn btn-success btn-custom"> View Blogs</a>
                    <a href="Logout" class="btn btn-danger btn-custom"> Logout</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
