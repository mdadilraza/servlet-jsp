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
String message  =(String) request.getAttribute("message");
  
  if(message != null){
	%>
	<h3><%=message%></h3>  
	<% 
	}%>
  
<form action="login" method="post">
 
     Phone: <input type="tel" placeholder="EnterPhone" name="personPhone">
     <br>
      Password: <input type="password" placeholder="EnterPassword" name="personPassword">
      <br>
      <button>LogIn</button>
 </form>
</body>
</html>