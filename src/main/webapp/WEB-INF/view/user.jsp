<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    pageContext.setAttribute("basePath",basePath);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
</head>
<body>
<div style="text-align: center;">
    <form action="${basePath}user/add_s" method="post">
        <span>姓名:</span><input type="text" name="name" value="${user.name}"><br>
        <span>年龄:</span><input type="text" name="age" value="${user.age}"><br>
        <span>地址:</span><input type="text" name="address" value="${user.address}"><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
