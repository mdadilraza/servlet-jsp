<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
 Student student =(Student)request.getAttribute("student");
  %>
  <form action="edit" method="get">
<table border="2">
    <tr>
        <td><label for="id">Student Id:</label></td>
        <td><input type="hidden" id="name" name="studentId" placeholder="Enter Student Id" value="<%=student.getStudentId()%>"></td>
    </tr>
    <tr>
        <td><label for="name">Student Name:</label></td>
        <td><input type="text" id="name" name="studentName" placeholder="Enter Student Name" value="<%=student.getStudentName()%>" ></td>
    </tr>
    <tr>
        <td><label for="name">Student Age:</label></td>
        <td><input type="number" id="age" name="studentAge" placeholder="Enter Student Age" value="<%=student.getStudentAge()%>"></td>
    </tr>
    <tr>
        <td><label for="dob">Student DOB:</label></td>
        <td><input type="date" id="dob" name="studentDOB" placeholder="Enter Student DOB" value="<%=student.getStudentDOB()%>"></td>
    </tr>
    <tr>
        <td><label for="add">Student Address:</label></td>
        <td><input type="text" id="add" name="studentAddress" placeholder="Enter Student Address" value="<%=student.getStudentAddress()%>"></td>
    </tr>
    <tr>
        <td><label for="name">Student Phone:</label></td>
        <td><input type="tel" id="name" name="studentPhone" placeholder="Enter Student Phone" readonly value="<%=student.getStudentPhone()%>"></td>
    </tr>
    <tr>
        <td><label for="Password">Student Password:</label></td>
        <td><input type="password" id="password" name="studentPassword" placeholder="Enter Student Password" value="<%=student.getStudentPassword()%>"></td>
    </tr>
    <tr>

<td></td>
<td><button>Update</button></td>
</tr>

</table>

</form>
</body>
</html>