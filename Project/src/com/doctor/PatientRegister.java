package com.doctor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PatientRegister")
public class PatientRegister extends HttpServlet{
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
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	
	String password=request.getParameter("password");
	
	int phone=Integer.parseInt(request.getParameter("phone"));
	
//	String specialist=request.getParameter("specialist");
ps=connect.prepareStatement("insert into patient(name,email,password,phone) values(?,?,?,?)");
ps.setString(1, name);
ps.setString(2, email);
ps.setString(3, password);
ps.setInt(4, phone);
//ps.setString(5,specialist);
int x =ps.executeUpdate();

if(x!=0) {
	response.sendRedirect("./Patientlogin.html");
}else {
	response.sendRedirect("./PatientRegister.html");
}

} catch (SQLException | NumberFormatException e ) {
// TODO Auto-generated catche block
e.printStackTrace();
}
}
}