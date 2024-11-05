<%@page import="dto.Person"%>
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
 List<Person> persons=(List)request.getAttribute("persons");
 %>
 <table border="2px solid" >
  <tr>
  <th>Id</th>
  <th>Name</th>
  <th>Age</th>
  <th>Address</th>
  <th>Phone</th>
  <th>Email</th>
  <th>Password</th>
  <th>Delete</th>
  <th>Update</th>
  
  
  </tr>
  <%
  for(Person person:persons){
	%>
	<tr>
	
	<td><%=person.getPersonId()%></td>
	<td><%=person.getPersonName()%></td>
	<td><%=person.getPersonAge() %></td>
	<td><%=person.getPersonAddress() %></td>
	<td><%=person.getPersonPhone() %></td>
	<td><%=person.getPersonEmail() %></td>
	<td><%=person.getPersonPassword()%></td>
	<td><a href="delete?id=<%=person.getPersonId() %>"><button>DELETE</button></a></td>
	<td><a href="update?id=<%=person.getPersonId() %>"><button>Update</button></a></td>
	
	
	
	
	</tr>  
  <%
  }
  %>
  
 </table>
</body>
</html>