<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error Page</title>
</head>
<style>
body  {
    background-color:red;
    border: solid;
    margin: 5em;
}
</style>
<body>
<form action="Logout" method="post">
<h1>OOPS !! ERROR OCCURED</h1>
<%String email=(String)request.getSession().getAttribute("passEmail");
out.print("Sorry !!"+email+" Please Register");%></h1><br>
<input type="submit" value="Logout">
</form>
</body>
</html>