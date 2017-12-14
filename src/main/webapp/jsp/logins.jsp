<%--
  Created by IntelliJ IDEA.
  User: 周波喜
  Date: 2017/12/8
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basepath %>" />
    <title>登录页面</title>
</head>
<body>
<form action="user/login" method="post">
    <label>用户名:</label>
    <input type="text" name="name"/>
    <label>密码:</label>
    <input type="password" name="password"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
