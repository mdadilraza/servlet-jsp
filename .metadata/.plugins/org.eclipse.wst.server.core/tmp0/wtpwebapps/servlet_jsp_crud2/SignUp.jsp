<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
padding:0;
margin: 0;
box-sizing: border-box;
}
button{
border-radius: 5px;
background-color: red;
color:white;
padding:10px;
}
input{
border-radius: 5px;

}

</style>
</head>
<body>
 <form action="signup" >
 <table border="2">
    <tr>
        <td><label for="name">Student Name:</label></td>
        <td><input type="text" id="name" name="studenName" placeholder="Enter Student Name"></td>
    </tr>
    <tr>
        <td><label for="name">Student Age:</label></td>
        <td><input type="number" id="age" name="studentAge" placeholder="Enter Student Age"></td>
    </tr>
    <tr>
        <td><label for="dob">Student DOB:</label></td>
        <td><input type="date" id="dob" name="studenDOB" placeholder="Enter Student DOB"></td>
    </tr>
    <tr>
        <td><label for="add">Student Address:</label></td>
        <td><input type="text" id="add" name="studentAddress" placeholder="Enter Student Address"></td>
    </tr>
    <tr>
        <td><label for="name">Student Phone:</label></td>
        <td><input type="tel" id="name" name="studentPhone" placeholder="Enter Student Phone"></td>
    </tr>
    <tr>
        <td><label for="Password">Student Password:</label></td>
        <td><input type="password" id="password" name="studentPassword" placeholder="Enter Student Password"></td>
    </tr>
    <tr>

<td></td>
<td><button>SignUp</button></td>
</tr>

 </table>

</form>
</body>
</html>