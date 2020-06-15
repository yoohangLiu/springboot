<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功消息页</title>
</head>
<body>
    ${msg}
    <form action="${basePath}/" method="post">
        <input type="submit" value="返回主页">
    </form>
</body>
</html>
