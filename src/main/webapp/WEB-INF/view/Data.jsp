<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information</title>
</head>
<body>
<h2>USER  SUCCESSFULLY  LOGGEDIN!!</h2>
   <!--Model Attribute...<br><br>  --> 
<h4>User Data</h4>
    Name: ${s.name }<br><br>
    Age: ${s.age }<br><br>
    City: ${s.city }<br><br>
    Email: ${s.emailId }<br><br>
    Mobile Number: ${s.mobNum }<br><br>
    Password: ${s.password }<br><br>

</body>
</html>
