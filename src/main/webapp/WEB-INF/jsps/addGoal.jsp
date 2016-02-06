<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Goal of the day</title>

<style>
.error {
	color: #ff0000;
}

.errorBlock {
	color: #ff0000;
	background-color: #ffeeee;
	border: 3x solid #ff0000;
	padding: 8px;
	margin: 16px;
}

</style>
</head>
<body>

	<h1>Add Goal of the day</h1>
	
	<form:form commandName="goal">
		<form:errors path="*" cssClass="errorBlock" element="div"/>
		<table>
			<tr>
				<td><spring:message code="goal.text"/></td>
				<td><form:input path="minutes"/></td>
				<td><form:errors path="minutes" cssClass="error"/>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Goal"/></td>
			</tr>
		</table>
	
	</form:form>
	
</body>
</html>