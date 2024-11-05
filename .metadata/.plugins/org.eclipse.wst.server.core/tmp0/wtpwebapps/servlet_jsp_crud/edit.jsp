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
 Person persons=(Person)request.getAttribute("persons");
 %>
<form action="edit" method="post">
 <% if (persons != null) { %>
     Id: <input type="hidden" placeholder="EnterId" value="<%=persons.getPersonId()%>" name="personId">
     <br><br>
    Name: <input type="text" placeholder="EnterName" value="<%=persons.getPersonName()%>" name="personName">
     <br><br>
 <% } %>

  Age: <input type="number" placeholder="EnterAge" name="personAge" value="<%=persons.getPersonAge()%>">
  <br><br>
   Address: <input type="text" placeholder="EnterAddress" name="personAddress" value="<%=persons.getPersonAddress()%>">
   <br><br>
   
    Phone: <input type="hidden" placeholder="EnterPhone" name="personPhone" value="<%=persons.getPersonPhone()%>" >
    <br><br>
     Email: <input type="email" placeholder="EnterEmail" name="personEmail" readonly="readonly" value="<%=persons.getPersonEmail()%>">
     <br><br>
      Password: <input type="password" placeholder="EnterPassword" name="personPassword" value="<%=persons.getPersonPassword()%>">
      
      <br><br>
     
      <button>Update</button>
 </form>
</body>
</html>