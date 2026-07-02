<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>

<!-- Bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background: linear-gradient(to right,#4facfe,#00f2fe);
    height:100vh;
}

.form-container{
    width:400px;
    margin:auto;
    margin-top:120px;
    padding:30px;
    background:white;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
}

</style>

</head>
<body>

<div class="form-container">

<h3 class="text-center mb-4">Registration Form</h3>

<form action="get_and_post_handle">

<div class="mb-3">
<label class="form-label">Name</label>
<input type="text" name="name" class="form-control" placeholder="Enter your name">
</div>

<div class="mb-3">
<label class="form-label">Email</label>
<input type="email" name="email" class="form-control" placeholder="Enter your email">
</div>

<div class="mb-3">
<label class="form-label">Password</label>
<input type="password" name="password" class="form-control" placeholder="Enter password">
</div>

<div class="text-center">
<button type="submit" class="btn btn-primary w-100">Register</button>
</div>

</form>

</div>

</body>
</html>