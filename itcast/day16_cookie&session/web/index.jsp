<%--
  Created by IntelliJ IDEA.
  User: fqy
  Date: 2018/6/8
  Time: 14:47
  To change this template use File | Settings | File Templates.--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

      <%
        System.out.println("222222");  /*//输出到服务器*/
        int i = 5;

        String contextPath = request.getContextPath();
        out.print(contextPath);
      %>

      <%!
        int i = 3;
      %>
      <%= "3333" %> <%-- 输出到页面上--%>


      System.out.println("111111");
      <h1>hi~ jsp!</h1>  <%-- h1标签--%>

      <% response.getWriter().write("4444444....."); %>
  </body>
</html>
