<%@ page import="com.liaowenlong.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2021-04-25
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp" %>
<h1> User Update</h1>
<%
    User u=(User) session.getAttribute("User");
%>
<!--need form -->
<form method="post" action="updateUser">

<span style="color: #FFA500"> This is my register JSP page</span><br/><br/>
<span style="color:#FFA500">Username</span> <input type="text" name="name" required="true" style="background-color: #EAEAAE" value="<%=u.getUsername()%>"><br/><br/>
<span style="color: #FFA500">Password</span> <input type="password" name="password" maxlength="8" style="background-color: #EAEAAE"value="<%=u.getPassword()%>"><br/><br/>
<span style="color: #FFA500">Email</span><input type="email" name="email" required="true"style="background-color: #EAEAAE"value="<%=u.getEmail()%>"><br/><br/>
<span style="color: #FFA500">Gender</span>
<label for="1">
    <input type="radio" name="gender" value="male" <%= "male".equals(u.getGender())?"cheked":""%> id="1"/> <span style="color: #D2B48C">Male</span>
</label>

<label for="2">
    <input type="radio" name="gender" value="female"<%= "fmale".equals(u.getGender())?"cheked":""%>  id="2"/> <span style="color: #D2B48C">Female</span>
</label>
<br/><br/>
<span style="color: #FFA500">Date of birth(yyyy-mm-dd)</span><input type="date"name="date"  pattern="yyyy-mm-dd" required="true"style="background-color: #EAEAAE"value="<%=u.getBirthdate()%>"><br/><br/>
<input type="submit" value="register Save Change"style="background-color: #EAEAAE">
</form>
<%@include file="footer.jsp"%>