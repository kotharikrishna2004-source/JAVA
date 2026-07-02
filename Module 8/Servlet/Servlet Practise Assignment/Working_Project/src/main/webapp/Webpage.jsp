<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CSS Types Demo</title>

    <!-- 🔹 External CSS -->
    <link rel="stylesheet" type="text/css" href="style.css">

    <!-- 🔹 Internal CSS -->
    <style>
        .internal-style {
            color: white;
            background-color: #6c5ce7;
            padding: 10px;
            border-radius: 5px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table, th, td {
            border: 1px solid black;
            padding: 8px;
        }
    </style>
</head>
<nav>
    <ul>
        <li><a href="home.jsp">Home</a></li>
        <li><a href="about.jsp">About</a></li>
        <li><a href="profile.jsp">MyProfile</a></li>
    </ul>
    </nav>
<body>

<h2>CSS Implementation Example</h2>

<!-- 🔹 Inline CSS Example -->
<div class="d1">
<p style="color: red; font-weight: bold;">
    This paragraph is styled using Inline CSS.
</p>
</div>

<!-- 🔹 Internal CSS Example -->
<div class="internal-style">
    This section is styled using Internal CSS.
</div>

<!-- 🔹 External CSS Example -->
<div class="external-box">
    <h3 class="external-heading">External CSS Section</h3>
    <p>This content is styled using External CSS file.</p>
</div>

<hr>

<!-- Form -->
<h3>User Form</h3>
<form>
    <label>Name:</label>
    <input type="text"><br><br>

    <label>Email:</label>
    <input type="email"><br><br>

    <input type="submit" value="Submit">
</form>

<hr>

<!-- Table -->
<h3>User Table</h3>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
    </tr>
    <tr>
        <td>1</td>
        <td>Rahul</td>
        <td>rahul@gmail.com</td>
    </tr>
</table>

</body>
</html>