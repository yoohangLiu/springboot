<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    pageContext.setAttribute("basePath",basePath);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户查找</title>
</head>
<body>
<div style="text-align: center;">
    <form action="${basePath}user/find_s" method="post">
        <span>ID:</span><input type="int" name="id" value="${user.id}"><br>
        <input type="submit" value="查找">
    </form>
</div>
</body>
</html>
