<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    pageContext.setAttribute("basePath",basePath);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户地址修改</title>
</head>
<body>
<div style="text-align: center;">
    <form action="${basePath}user/update_s" method="post">
        <span>ID:</span><input type="int" name="id" value="${user.id}"><br>
        <span>地址:</span><input type="text" name="address" value="${user.address}"><br>
        <input type="submit" value="修改">
    </form>
</div>
</body>
</html>
