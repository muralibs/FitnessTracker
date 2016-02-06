<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>

<title>Fitness Tracker</title>
<style type="text/css">
.abc {
	background-color: #ffffee;
	color: #000000;
	border: 15px;
	margin: 20px;
	
}

</style>
<script>
function submitGoal() {
	window.location.href="addGoal.html";
}

function submitMinutes() {
	window.location.href = "addMinutes.html";
}

function showGoals() {
	window.location.href = "getGoals.html";
}

function showGoalsReport() {
	window.location.href = "getGoalReports.html";
}
</script>
</head>
<body>

<table class="abc" >
	<tr>
		<td colspan="3"><h1 >Welcome to Fitness Tracker <sec:authentication property="name" /></h1></td>
	</tr>
	<tr>
		<td colspan="3">To get started, add goal of the day and add exercise minutes.</td>
	</tr>
	<tr>
		<td><button  onclick="submitGoal()">Add Goal Minutes</button></td>
		
		<sec:authorize access="hasRole('ROLE_ADMIN')">
			<td><button  onclick="submitGoal()">Edit Goal Minutes</button></td>
		</sec:authorize>
		
		<td><button onclick="submitMinutes()">Add Exercise Minutes</button></td>
	</tr>
	<tr>
		<td><button  onclick="showGoals()">Show Goals</button></td>
		<td><button onclick="showGoalsReport()">Show Goals Report</button></td>
	</tr>
</table>
</body>
</html>
