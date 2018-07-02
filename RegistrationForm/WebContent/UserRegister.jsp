<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>REGISTERATION PAGE</title>
</head>
<body>
<center><h3>REGISTERATION PAGE</h3></center>
<form action="Register" method="post">
<pre>
     Name:<input type="text" name="name" /><br>
    Email:<input type="text" name="email" pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9-\-\.]+)\.([a-zA-Z]{2,5})$" title="Follow abc@domain.com"/><br>
   Mobile:<input type="text" name="mobile" /><br>
 Password:<input type="password" name="pass" pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*].{8,})" title="Should contain atleast 1 uppercase,1 lowercase,1digit"/><br>
<input type="submit" value="Register" /><br><br>
</pre>
</form>
</body>
</html>