<%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2021/3/14
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/resgister">
    <table>
    <tr>
        <td bgcolor="#faebd7">
            Username<input type="text" name="username" ><br/></td></tr>
</table>
    <table>
        <tr>
            <td bgcolor="#faebd7">
                password<input type="password"  name="password" ><br/></td></tr>
    </table>
    <table>
        <tr>
            <td bgcolor="#faebd7">
                Email <input type="text" name="email" ><br/></td></tr>
    </table>
    Gender<input name="sex" type="radio" value="male">Male
    <input name="sex" type="radio" value="femal">Female<br/>
    <table>

        <tr>
            <td bgcolor="#faebd7">
                Date  <input type="text" name="date" ><br/></td></tr>
    </table>


    <input type="submit" value="submit"/>
</form><!--
Task 1:Check request method type when you click write url to call register.jsp
Answer : doGet（）

0.





.............0000
Task 2: Check request method type when you submit register <form>.
Answer :doPost（）-->

</body>
</html>
