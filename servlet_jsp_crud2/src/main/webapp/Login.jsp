<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
padding: 0;
margin: 0;
box-sizing: border-box;
}
button {
	padding: 10px;
	color:white;
	border-radius:10px;
	background-color: red;
	
}



</style>
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
 <table border="2">
 <tr>
 <td><label for="name">Student Phone:</label></td>
        <td><input type="tel" id="name" name="studenPhone" placeholder="Enter Student Phone"></td>
    </tr>
    <tr>
        <td><label for="Password">Student Password:</label></td>
        <td><input type="password" id="password" name="studentPassword" placeholder="Enter Student Password"></td>
    </tr>
    <tr>

<td></td>
<td><button>Login</button></td>
</tr>
 </table>
    
 </form>
</body>
</html>