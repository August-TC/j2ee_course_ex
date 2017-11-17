<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="beerColor" scope="request" class="lesson.j2ee.ex3.Beer"/>
<jsp:setProperty name="beerColor" property="color" value="${param.color}"/>
<%
	String color = request.getParameter("color");
	if(color.equals("amber")){
%>
	<!--if use this statement:response.sendRedirect("ShowAmberBeer.jsp") the result is? -->;

	<jsp:forward page="ShowAmberBeer.jsp" />

<%	}
	if(color.equals("brown")){
%>

	<jsp:forward page="ShowBrownBeer.jsp" />

<%	}
	if(color.equals("dark")){
%>
	<jsp:forward page="ShowDarkBeer.jsp" />

<%	}
%>
<jsp:include page="Header_act.jsp">
	<jsp:param name="subTitle" value="Welcome to the ${beerColor.color} Beer World!"/>
</jsp:include>

<%@ include file="DisplayItem.jsp" %>