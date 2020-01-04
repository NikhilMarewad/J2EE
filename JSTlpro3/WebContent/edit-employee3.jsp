<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
	<form action="EmployeeDetialsServlet3" method="post">
		<table>
			<tr>
				<td>Id:</td>
				<td>${employee3.employeeId}</td>
			</tr>

			<tr>
				<td>Name:</td>
				<td><input type="text" value="${employee3.employeeName}"
					name="txtname" /></td>
			</tr>

			<tr>
				<td>Gender:</td>
				<td><label for="Gender">
				<input type="radio"value="${employee3.gender}" name="male" id="Gender" checked <c:if test="${employee3.gender eq 'Male'}"> </c:if> />Male
				<input type="radio" value="${employee3.gender}" name="Female" id="Gender"<c:if test="${employee3.gender eq 'Female'}"></c:if> />Female
					</label>
			</tr>
			
			<tr>
				<td>Date Of Birth:</td>
				
		      
				<td><input type="text" value = "${employee3.employeedob}" name="Dob" /></td>
			</tr>
			
		</table>

	</form>
</body>
</html>