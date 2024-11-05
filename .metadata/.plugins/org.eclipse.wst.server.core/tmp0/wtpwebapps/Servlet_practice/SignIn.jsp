<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        *{
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }
        form{
            display: flex;
            justify-content: center;
            position: relative;
            top: 100px;

            
        }
        table{
            border: 2px solid black;
           
            padding: 100px;
            background-color: aqua;
        }
    </style>
</head>
<body>
  <form action="signIn">
    <table>
        <tr>
            <td><label for="userName">User_Name</label></td>
            <td>:</td>
            <td><input type="text" name="userName" id="userName" placeholder="Enter Your Name"></td>
        </tr>
        
        
        <tr>
            <td><label for="password">Password</label></td>
            <td>:</td>
            <td><input type="password" name="password" id="password" placeholder="Enter Your Password"></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td><button>SignIn</button></td>
        </tr>
    </table>
  </form>
   
</body>
</html>



