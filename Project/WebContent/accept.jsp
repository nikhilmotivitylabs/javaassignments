<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.doctor.*" %>

<%  
Connection connect=DbConnection.getconnect();
int id=Integer.parseInt(request.getParameter("aid"));
String name=(String)session.getAttribute("name");
PreparedStatement ps=connect.prepareStatement("update appointment set doctor_name=?,status=? where aid=?");
ps.setString(1,name);
ps.setString(2,"Accepted");
ps.setInt(3,id);
int x=ps.executeUpdate();

if(x!=0){
	response.sendRedirect("./doctor_appointment.jsp");
}
%>