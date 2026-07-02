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
    background-color:#f2f2f2;
}

.form-box{
    width:400px;
    margin:auto;
    margin-top:80px;
    padding:30px;
    background:white;
    border-radius:10px;
    box-shadow:0px 0px 10px gray;
}
</style>

</head>
<body>

<div class="form-box">

<h3 class="text-center mb-4">Registration Form</h3>

<form action="cgi" >

<div class="mb-3">
<label class="form-label">Full Name</label>
<input type="text" name="name" class="form-control" placeholder="Enter your name" required>
</div>

<div class="mb-3">
<label class="form-label">Email</label>
<input type="email" name="email" class="form-control" placeholder="Enter email">
</div>

<div class="mb-3">
<label class="form-label">Password</label>
<input type="password" name="password" class="form-control" placeholder="Enter password">
</div>



<div class="d-grid">
<button type="submit" class="btn btn-primary">Register</button>
</div>

</form>

</div>

</body>
</html>