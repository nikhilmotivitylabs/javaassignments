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


@WebServlet("/Doctorlogin")
public class Doctorlogin extends HttpServlet{
	Connection connect =null;
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
String doctoremail=request.getParameter("email");
String doctorpassword=request.getParameter("password");
HttpSession hs=request.getSession();
try {
ps=connect.prepareStatement("select * from doctor where email=? and password=?");
ps.setString(1,doctoremail);
ps.setString(2,doctorpassword);

ResultSet rs=ps.executeQuery();

PrintWriter pw=response.getWriter();
pw.println("login");
if(rs.next()) {
	hs.setAttribute("id", rs.getInt(1));
	hs.setAttribute("email",rs.getString("email"));
	hs.setAttribute("name", rs.getString(2));
	hs.setAttribute("specialist",rs.getString("specialist"));
	response.sendRedirect("./Doctor_Home.html");
}
else {
	response.sendRedirect("./Doctorlogin.html");
}
}catch (SQLException | NumberFormatException e ) {
// TODO Auto-generated catche block
e.printStackTrace();
}
}
}


