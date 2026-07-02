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
    background: linear-gradient(to right, #4facfe, #00f2fe);
    height: 100vh;
}

.form-container{
    width: 400px;
    margin: auto;
    margin-top: 80px;
    padding: 30px;
    background: white;
    border-radius: 10px;
    box-shadow: 0px 5px 20px rgba(0,0,0,0.2);
}

h2{
    text-align:center;
    margin-bottom:20px;
}

</style>

</head>
<body>

<div class="form-container">

<h2>Registration Form</h2>

<form action="Display" >

<div class="mb-3">
<label class="form-label">Full Name</label>
<input type="text" name="name" class="form-control" placeholder="Enter your name">
</div>

<div class="mb-3">
<label class="form-label">Email</label>
<input type="email" name="email" class="form-control" placeholder="Enter email">
</div>

<div class="mb-3">
<label class="form-label">Password</label>
<input type="password" name="password" class="form-control" placeholder="Enter password">
</div>

<div class="mb-3">
<label class="form-label">Mobile</label>
<input type="text" name="mobile" class="form-control" placeholder="Enter mobile number">
</div>

<button type="submit" class="btn btn-primary w-100">Register</button>

</form>

</div>

</body>
</html>