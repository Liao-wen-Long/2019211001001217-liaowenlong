<%@include file="header.jsp" %>
Login <br>
<%

    Cookie[] allCookies = request.getCookies();
    String username="",password="",rememberMeVal="";
    if (allCookies!=null){
        for (Cookie c:allCookies){
            if (c.getName().equals("cUsername")){
                username=c.getValue();
            }

                if (c.getName().equals("cPassword")){
                    password=c.getValue();
                }

                    if (c.getName().equals("cRememberMe")){
                        rememberMeVal=c.getValue();
                    }
        }
    }
%>
<form method="post" action="${pageContext.request.contextPath}/login">
  Username:<input type="text" name="username" value="<%=username%>"/><br/>
    Password:<input type="password" name="password" value="password"/><be/>
    <input type="checkbox" name="rememberMe" value="1" <%=rememberMeVal.equals("1") ?"checked":""%>checked/>RememberMe><br/>
    <input type="submit" value="Login"/>
</form>
<%@include file="footer.jsp" %>