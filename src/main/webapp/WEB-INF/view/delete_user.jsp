<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    pageContext.setAttribute("basePath",basePath);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户删除</title>
</head>
<body>
<div style="text-align: center;">
    <form action="${basePath}user/delete_s" method="post">
        <span>ID:</span><input type="int" name="id" value="${user.id}"><br>
        <input type="submit" value="删除">
    </form>
</div>
</body>
</html>
