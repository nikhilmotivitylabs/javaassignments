<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.doctor.*" %>

<%  
Connection connect=DbConnection.getconnect();
String name=request.getParameter("name");
int mobile=Integer.parseInt(request.getParameter("mobile"));
String doa=request.getParameter("doa");
String toa=request.getParameter("toa");
String specialist=request.getParameter("specialist");
int pid=(Integer)session.getAttribute("pid");
String sql="insert into appointment(name,mobile,doa,toa,specialist,pid,doctor_name,status) values(?,?,?,?,?,?,?,?)";
PreparedStatement ps=connect.prepareStatement(sql);
ps.setString(1,name);
ps.setInt(2,mobile);
ps.setString(3,doa);
ps.setString(4,toa);
ps.setString(5,specialist);
ps.setInt(6,pid);
ps.setString(7,"None");
ps.setString(8,"Pending");

int x=ps.executeUpdate();

if(x!=0){
	response.sendRedirect("./patient_appointment.jsp");
}



%>