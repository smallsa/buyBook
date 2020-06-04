<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 陈健铮
  Date: 2020/5/30
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cartList</title>
</head>
<body>
<%=session.getAttribute("username") %>
<p> 购物车中的商品:</p>
<%List s=(List)session.getAttribute("interest");
    if(s==null||s.size()==0)
    {
        out.print("null");
    }else{
        out.print(s);
    }

%>
<br>
</body>
</html>
