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
	
	<pre>
<form action ="AddProject" method="post" >
<div>
	<h1>Add Project Form</h1>
	Project Name: <input type="text" name="name" autocomplete="off" placeholder="Enter Name"><br>
	Assign To   : <input type="number" name="assign_to" autocomplete="off" placeholder="Employee Id"><br>
	<input type ="submit" value="Add Project">
	</div>
</form>
</pre>
<img src="images/project-management-6.jpg" style="width: 23%;"/>
	</center>
</body>
</html>