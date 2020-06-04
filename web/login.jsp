<%--
  Created by IntelliJ IDEA.
  User: 陈健铮
  Date: 2020/6/1
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/loginServlet" >
    <center>
        登陆信息
        <br>
        <br>
        用户<input type="text" name="username">
        密码<input type="password" name="password"><br><br>
        <input type="submit" value="登录">
    </center>
</form> <br>
</body>
</html>
