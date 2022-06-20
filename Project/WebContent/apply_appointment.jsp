<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align='center'>Patient Home page</h1>
<br><br><br>

<h2 align='center'>
<a href="Patient_Home.html">Home</a>
<a href="apply_appointment.jsp">Apply Appointment</a>
<a href="patient_appointment.jsp">Appointment</a>
</h2>

<h1 align="center" margin="30px">welcome to maxhospital</h1>
<h3>Doctor Registration</h3>
<h5>if you already have an account click this <a href="Doctorlogin.html">DoctorLogin</a></h2>
<div class="ml-10 w-75 h-70 rounded-3 border border-5 p-5" align="center">

<form class="w-50 h-70 rounded-3  border mt-5"  action="./appointment_apply.jsp" method="get">
  <div class="mb-2 col-sm-7">
    <label for="exampleInputName" class="form-label">Name</label>
    <input type="text" class="form-control" name="name" id="exampleInputEmail1" aria-describedby="emailHelp">
    
  </div>
  <div class="mb-2 col-sm-7">
    <label for="exampleInputEmail" class="form-label">Mobile</label>
    <input type="text" class="form-control" name="name" id="exampleInputPassword1">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-2 col-sm-7">
    <label for="exampleInputPassword1" class="form-label">Select date</label>
    <input type="date" class="form-control" name="doa" id="exampleInputPassword1">
  </div>
  <div class="mb-2 col-sm-7">
    <label for="exampleInputPhone" class="form-label">Select the time</label>
    <input type="text" class="form-control" name="toa" id="exampleInputPassword1">
  </div>
  <div class="mb-2 form-check col-sm-7">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <div class="col-md-7">
  <select class="form-select col-md-4" aria-label="Default select example" name="specialist">
  <option selected>Open this select menu</option>
 <option value="ENT">ENT</option>
<option value="Heart">Heart</option>
<option value="Dentist">Dentist</option>
<option value="Eye">Eye</option>
<option value="Kidney">Kidney</option>
<option value="Cardio">Cardio</option>
 
  
</select>
 </div>
  

<br>

<input type="submit" class="btn btn-primary">
</form>

</div>

</body>
</html>