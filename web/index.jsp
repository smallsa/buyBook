<%--
  Created by IntelliJ IDEA.
  User: 陈健铮
  Date: 2020/5/30
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%=session.getAttribute("username")%>
  欢迎您光临本网站<br/>
  <%String s[]={"java","jsp","web"};%>
  <form action="${pageContext.request.contextPath}/cartServlet" method="get">
    <%for(int i= 0;i<s.length;i++){%>
    <input type="checkbox" name="interest" value="<%=s[i]%>"/><%=s[i]%>
    <%}%>
    <br>
    <input type="submit" value="加入购物车"/>
    <br>
  </form><br>
  <button onclick="location='cartList.jsp'">查看购物车</button>
  <button onclick="location='<%=basePath%>deleteServlet'">注销</button>
  </body>
</html>
