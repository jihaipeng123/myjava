<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el隐式对象</title>
</head>
<body>
<%--
* pageContext：
* 获取jsp其他八个内置对象
* ${pageContext.request.contextPath}：动态获取虚拟目录
--%>


    ${pageContext.request}<br>
    <h4>在jsp页面动态获取虚拟目录</h4>
    ${pageContext.request.contextPath}

<%


%>
</body>
</html>
