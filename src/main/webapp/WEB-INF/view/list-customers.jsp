<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/general.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/list-customer.css"/>
<title>Customers List</title>
</head>

<body>
<div id="content">
	<jsp:include page="header.jsp"/>
	
	<div id="under-menu">
		<button class="button add-student-button" 
		onclick="window.location.href='add'; return false;">
			Add Student
		</button>
	</div>
	
	<div>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		
		<c:forEach var="customer" items="${customers}">
			
			<tr>
				<td>${customer.firstName}</td>
				<td>${customer.lastName}</td>
				<td>${customer.email}</td>
				<td>
					<form action="update" method="get">
						<input type="hidden" name="id" value="${customer.id}"/>
						<button type="submit" class="button action-button">Update</button>
					</form>
					|
					<form action="delete" method="post">
						<input type="hidden" name="id" value="${customer.id}"/>
						<button type="submit" class="button action-button">Delete</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</div>
</body>
</html>