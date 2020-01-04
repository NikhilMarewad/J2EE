<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Employee Details</h2>
	<form action="EmployeeDetialsServlet2" method="post">
		<table>
			<tr>
				<td>Id:</td>
				<td>${employee2.employeeId}</td>
			</tr>

			<tr>
				<td>Name:</td>
				<td><input type="text" value="${employee2.employeeName}"
					name="txtname" /></td>
			</tr>

			<tr>
				<td>Gender:</td>
				<td><label for="Gender">
				<input type="radio"value="${employee2.gender}" name="male" id="Gender" <c:if test="${employee2.gender eq 'Male'}"> </c:if> checked />Male
				<input type="radio" value="${employee2.gender}" name="Female" id="Gender"<c:if test="${employee2.gender eq 'Female'}"></c:if> />Female
				</label>
			</tr>
		</table>

	</form>
</body>
</html>