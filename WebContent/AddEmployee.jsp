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
	<h1>Add Employee Form</h1>
	<pre>
<form action ="AddEmployee" method="post" >
<div>
	
	Employee Name  : <input type ="text" name="name" autocomplete="off" placeholder="Enter Name"><br>
	Employee Salary: <input type="number" name="salary" autocomplete="off" placeholder="Enter Salary"><br>
	
	<input type ="submit" value="Add Employee">
	</div>
</form>
</pre>
<img src="images/add.png" style="width: 23%;"/>
	</center>
</body>
</html>