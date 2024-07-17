<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<h2 align="center"><font color = "red"> ${msg } </font>  </h2> 
<p>${msg2 }</p>
<form action=./loginForm>
<input type="text" name="name" placeholder="Enter Name"/><br><br>
<input type="password" name="password" placeholder="Enter Password"/><br><br>
<input type="submit" value="Submit"/><br><br>


</form>
</head>
<body>

</body>
</html>