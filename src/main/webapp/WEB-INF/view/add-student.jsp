<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/general.css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/student-form.css"/>
	<title>Add Student</title>
</head>

<body>
	<div id="content">
	<jsp:include page="header.jsp"/>
	
	<div id="margin-left">
		<div>
			<h3>Add Student</h3>
		</div>
		
		<div>
			<form:form action="${pageContext.request.contextPath}/customer/add" 
			modelAttribute="customer" method="post">
			
				<table>
				<tr>
					<td><label for="firstName">First Name:</label></td>
					<td><form:input id="firstName" path="firstName"/></td>
				</tr>
				<tr>
					<td><label for="lastName">Last Name:</label></td>
					<td><form:input id="lastName" path="lastName"/></td>
				</tr>
				<tr>
					<td><label for="email">Email:</label></td>
					<td><form:input id="email" path="email"/></td>
				</tr>
				<tr>
					<td></td>
					<td><button class="button save-button" type="submit">Save</button></td>
				</tr>
				
				</table>
			</form:form>
		</div>
	</div>
	
	<div>
		<a href="${pageContext.request.contextPath}/customer/list">Back to the List</a>
	</div>
	</div>
</body>	
</html>