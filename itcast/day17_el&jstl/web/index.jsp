<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=gbk" errorPage="500.jsp"   pageEncoding="GBK" language="java" buffer="16kb" %>
<%--只要有错误就跳转到500.jsp中--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--前缀prefix--%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%
    List list = new ArrayList();
    int i = 3/0;

  %>

  </body>
</html>
