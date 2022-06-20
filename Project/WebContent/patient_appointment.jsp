<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to patient home</title>
</head>
<body>

<h1 align='center'>Patient Appointment</h1>
<br><br><br>

<h2 align='center'>
<a href="Patient_Home.html">Home</a>
<a href="apply_appointment.jsp">Apply Appointment</a>
<a href="patient_appointment.jsp">Appointment</a>
<a href="index.html">logout</a>
</h2>

<%@page import="java.sql.*" %>
<%@page import="com.doctor.*" %>
<table border="2" width="400" height="200" cellpadding="20">
<tr>
<td>Id</td>
<td>Name</td>
<td>phone</td>
<td>date</td>
<td>time</td>
<td>specilist</td>
<td>Doctor Name</td>
<td>Status</td>
</tr>
<%  
Connection connect=DbConnection.getconnect();
int id=(Integer)session.getAttribute("pid");


PreparedStatement ps=connect.prepareStatement("select * from appointment  where pid=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();

while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getInt(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6 ) %></td>
<td><%=rs.getString(7) %></td>
<td><%=rs.getString(8) %></td>
</tr>
<%} %>

</table>

</body>
</html>