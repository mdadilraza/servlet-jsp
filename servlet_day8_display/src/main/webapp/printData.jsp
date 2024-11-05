
<%@ page import="java.sql.*, java.io.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Print Data</title>
</head>
<body>
    <h2>Data from Database:</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>
             <th>Phone</th>
            <th>Email</th>
             <th>password</th>
           
        </tr>
        <% 
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_day8_display", "root", "root");

                String sql = "SELECT * FROM Person";
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getInt("personId") + "</td>");
                    out.println("<td>" + rs.getString("personName") + "</td>");
                    out.println("<td>" + rs.getInt("personAge") + "</td>");
                    out.println("<td>" + rs.getString("personAddress") + "</td>");
                    out.println("<td>" + rs.getLong("personPhone") + "</td>");
                    out.println("<td>" + rs.getString("personEmail") + "</td>");
                    out.println("<td>" + rs.getString("personPassword") + "</td>");
                    out.println("</tr>");
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        %>
    </table>
</body>
</html>
