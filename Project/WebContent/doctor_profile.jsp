<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align='center'>Doctor Home page</h1>
<br><br><br>

<h2 align='center'>
<a href="Doctor_Home.html">Home</a>
<a href="doctor_profile.jsp">Profile</a>
<a href="doctor_appointment.jsp">Appointment</a>
<a href="index.html">login</a>

</h2>

<br><br><br>
<%@page import="java.sql.*" %>
<%@page import="com.doctor.*" %>
<table border="2" width="400" height="200" cellpadding="20">
<tr>
<td>Id</td>
<td>Name</td>
<td>Email</td>
<td>password</td>
<td>phone</td>
<td>specilist</td>
</tr>
<%  
Connection connect=DbConnection.getconnect();
int id=(Integer)session.getAttribute("id");


PreparedStatement ps=connect.prepareStatement("select * from doctor  where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();

while(rs.next()){
%>
<tr><td><%=rs.getInt(1) %></td>
<td><%=rs.getString(2) %></td>

<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6 ) %></td>
</tr>
<%} %>

</table>

</body>
</html>