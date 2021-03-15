<%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2021/3/14
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="http://index.jsp>/">go to ecjtu!</a><!--method is GET-->
<!--what is method when we use from?--><!--its GET Why? from data is added in the URL you can see-->
<!--its better to use POST in from,data is not added in the URL-->
<form method="post">
    Name:<input type="text" name="name"><br/>
    ID:<input type="text" name="id"><br/>
    <input type="submit" value="send data to server"/>
</form>
</body>
</html>
