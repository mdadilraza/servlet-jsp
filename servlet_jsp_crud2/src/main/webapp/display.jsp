<%@page import="dto.Student"%>

<%@page import="java.util.List"%>
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
	Student student = (Student) request.getAttribute("students");
	%>
	<table border="2px solid">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>DOB</th>
			<th>Address</th>
			<th>Phone</th>

			<th>Password</th>
			<th>Delete</th>
			<th>Update</th>


		</tr>
		
		<tr>

			<td><%=student.getStudentId()%></td>
			<td><%=student.getStudentName()%></td>
			<td><%=student.getStudentAge()%></td>
			<td><%=student.getStudentDOB()%></td>
			<td><%=student.getStudentAddress()%></td>
			<td><%=student.getStudentPhone()%></td>
			<td><%=student.getStudentPassword()%></td>
			<td><a href="delete?id=<%=student.getStudentId()%>"><button>DELETE</button></a></td>
			<td><a href="update?id=<%=student.getStudentId()%>"><button>Update</button></a></td>




		</tr>
		
	</table>
</body>
</html>