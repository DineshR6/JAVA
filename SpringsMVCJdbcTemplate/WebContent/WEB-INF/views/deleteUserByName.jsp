<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Delete Employee By Name</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

 <jsp:include page="header.jsp"></jsp:include>
    <h2>Delete Employee By Name</h2>
  ${messageInfo }
  <br/>
 <form action="deleteEmpByName">
Enter user name to delete:  <input type="text" name="name" name="" >
<br />
<input type="submit" name="Delete" value="Delete">

</form>

</body>
</html>