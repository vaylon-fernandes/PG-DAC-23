<%@page import="pojos.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello, ${param.fn} ${requestScope.student_info.lastName}</h1>
	<%
	Student s = (Student) request.getAttribute("student_info");
	if(s.isAdmitted()){
	%>
		<h5 style="color:green;">Congratulations!! You are admitted in ${requestScope.student_info.selectedCourse}</h5>
	<% 
	}
	else{
		%>
		<h5 style="color:red;"> You are not admitted in ${requestScope.student_info.selectedCourse}</h5>
	<%}%>
</body>
</html>