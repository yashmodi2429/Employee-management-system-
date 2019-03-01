<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">Home</a>
<center>
<h1>Know Your Employee :</h1><br>
<form action="ShowEmployee" method=get>
	<label>Enter Employee Id: </label><input type="number" name="id" placeholder="Enter Employee Id" autocomplete="off"><br><br>
	<input type="submit">
	</form>
	<img src="images/search.jpg" style="width:28%"/>
</center>
</body>
</html>