<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		.error{
			color: #ff0000;
			font-weight: bold;	
		}
	</style>
</head>
<body>
	<form:form method="post" modelAttribute="reservation">
		<form:errors path = "*" cssClass="error"/>	
		<table>
			<tr>
				<td>Court Name</td>
				<td><form:input path="courtName" /></td>
				<td><form:errors path="courtName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><form:input path="date" /></td>
				<td><form:errors path="date" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Hour</td>
				<td><form:input path="hour" /></td>
				<td><form:errors path="hour" cssClass="error"/></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>