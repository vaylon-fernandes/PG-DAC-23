<%@page import="pojos.Student"%>
<%@page import="pojos.Course"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--1. Read Required Parameters --%>
 <%
 	String fn=request.getParameter("fn");
 	String ln=request.getParameter("ln");
 	int score=Integer.parseInt(request.getParameter("score"));
 	Course course=Course.valueOf(request.getParameter("course").toUpperCase());
 	/*Wrap everything in student obj  */
 	Student s1 = new Student(fn,ln,score,course);
 	if(score>course.getMinScore())
 		s1.setAdmitted(true);
 		/* server pull: forward */
 		/* min scope of attributes: request */
 		/* add attr */
 		request.setAttribute("student_info", s1); /* Marked for GC */
 		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
 		rd.forward(request, response);
 		System.out.println("Control came back");
 	
 %>
</body>
</html>