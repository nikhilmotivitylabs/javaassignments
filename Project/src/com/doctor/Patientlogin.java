package com.doctor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.protocol.Resultset;


@WebServlet("/Patientlogin")
public class Patientlogin extends HttpServlet{ Connection connect =null;
PreparedStatement ps=null;
public void init(ServletConfig config) {
try {
connect=DbConnection.getconnect();
} catch (ClassNotFoundException | SQLException e) {
e.printStackTrace();
}
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String patientemail=request.getParameter("email");
String patientname=request.getParameter("password");
try {
ps=connect.prepareStatement("select * from patient where email=? and password=?");
ps.setString(1,patientemail );
ps.setString(2,patientname);
HttpSession session=request.getSession();
ResultSet rs=ps.executeQuery();
PrintWriter pw = response.getWriter();
if(rs.next()) {
	session.setAttribute("id", rs.getInt(1));
	session.setAttribute("email",rs.getString("email"));
	session.setAttribute("phone",rs.getString("phone"));
	response.sendRedirect("./Patient_Home.html");
}
else {
	response.sendRedirect("./Patientlogin.html");
}
}catch (SQLException | NumberFormatException e ) {
// TODO Auto-generated catche block
e.printStackTrace();
}
}
}
