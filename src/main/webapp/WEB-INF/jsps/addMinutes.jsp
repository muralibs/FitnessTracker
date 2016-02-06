<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Minutes</title>
<script language="javascript" src="jquery-1.12.0.js"></script>

<script>
function gotoHome() {
	window.location.href ="index.jsp";
}

$(document).ready(
		function() {
			$.getJSON('<spring:url value="activities.json"/>', {
				ajax: true
			}, function(data) {
				var html = '<option value="">--Please select value---</option>';
				var len = data.length;
				
				for (var i= 0; i < data.length; i++) {
					 html += '<option value="' + data[i].desc + '">' + data[i].desc + '</option>';
				}
				$('#activities').html(html);
			});	
		}	
	);

</script>
</head>
<body>

	<h1>Add Minutes Exercised</h1>
	<a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
	<form:form commandName="exercise">
		<table>
			<tr>
				<td><spring:message code="minutes.exercised"/></td>
				<td><form:input path="minutes"/></td>
				<td><form:select id="activities" path="activity"/></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Enter Minutes"/></td>
			</tr>
		</table>
	
	</form:form>
	
	<h1><spring:message code="our.goal"/> ${goal.minutes} </h1>
	<button onclick="gotoHome()">Home</button>
</body>
</html>