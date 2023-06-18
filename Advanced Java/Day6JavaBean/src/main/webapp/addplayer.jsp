<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%--getServletContext().setAttribute("ipl",new IPLBean())--%>

<jsp:useBean id="Team" class="beans.IplBean" scope="application"></jsp:useBean>

<body>
	<%--Display team details --%>
	<%--getServletContext() --%>
	<h5>Team: ${applicationScope.Team.allTeams}</h5>
	
</body>
</html>