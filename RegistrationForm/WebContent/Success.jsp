<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success Page</title>
</head>
<style>
body  {
    background-color:orange;
    border: solid;
    margin: 5em;
}
</style>
<body>
<center>
<form action="Logout" method="post">
<h4>
<%String email=(String)request.getSession().getAttribute("passEmail");
out.print(email);%></h4><br>
<h3>WELCOME TO THE JAVA WORLD!!!!!</h3>
<input type="submit" value="Logout">
</form>
</center>
</body>
</html>