<%@ page import="java.util.*, Session.BlogManage, Model.Blog, Model.Reg" %>
<%
    HttpSession session1 = request.getSession(false);
    if(session1 == null || session1.getAttribute("user") == null){
        response.sendRedirect("login.jsp");
        return;
    }
    Reg user = (Reg) session1.getAttribute("user");
    BlogManage dao = new BlogManage();
    List<Blog> list;
    String keyword = request.getParameter("search");
    String filter = request.getParameter("filter");
    if (keyword != null && !keyword.trim().isEmpty()) {
        list = dao.searchBlogs(keyword);
    } else if ("my".equals(filter)) {
        list = dao.getBlogsByUserId(user.getId());
    } else if ("recent".equals(filter)) {
        list = dao.getRecentBlogs();
    } else {
        list = dao.getAllBlogs();
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>All Blogs</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h2>Blogs</h2>
        <a href="welcome.jsp" class="btn btn-secondary">Back to Home</a>
    </div>
    <form action="viewBlogs.jsp" method="get" class="row g-3 mb-4">
        <div class="col-md-6">
            <div class="input-group">
                <input type="text" name="search" class="form-control" placeholder="Search by title or tag" value="<%= keyword != null ? keyword : "" %>">
                <button class="btn btn-outline-primary" type="submit">Search</button>
            </div>
        </div>
        <div class="col-md-auto">
            <a href="viewBlogs.jsp?filter=my" class="btn btn-outline-info">My Posts</a>
            <a href="viewBlogs.jsp?filter=recent" class="btn btn-outline-warning">Recent Posts</a>
            <a href="viewBlogs.jsp" class="btn btn-outline-secondary">Clear</a>
        </div>
    </form>
    <div class="row">
        <% if (list.isEmpty()) { %>
            <p class="text-muted">No blogs found.</p>
        <% } %>
        <% for(Blog b : list){ %>
        <div class="col-md-6 mb-4">
            <div class="card h-100 shadow-sm border-0">
                <div class="card-body">
                    <h4 class="card-title">
                        <a href="viewBlogDetails.jsp?id=<%= b.getId() %>" class="text-decoration-none text-dark"><%= b.getTitle() %></a>
                    </h4>
                    <p class="text-muted small mb-2"><%= b.getCreatedAt() %></p>
                    <%
                        String content = b.getContent() != null ? b.getContent() : "";
                        if (content.length() > 100) { content = content.substring(0, 100) + "..."; }
                    %>
                    <p class="card-text"><%= content %></p>
                    <span class="badge bg-primary rounded-pill mb-3"><%= b.getTags() %></span>
                    <div class="d-flex">
                        <a href="viewBlogDetails.jsp?id=<%= b.getId() %>" class="btn btn-sm btn-outline-primary me-2">Read More</a>
                        <% if(user.getId() == b.getUser_id()){ %>
                            <a href="UpdateBlog?id=<%= b.getId() %>" class="btn btn-sm btn-outline-success me-2">Edit</a>
                            <a href="DeleteBlog?id=<%= b.getId() %>" class="btn btn-sm btn-outline-danger" onclick="return confirm('Are you sure you want to delete this post?');">Delete</a>
                        <% } %>
                    </div>
                </div>
            </div>
        </div>
        <% } %>
    </div>
</div>
</body>
</html>
