<%--
    Document   : ClientDetails.jsp
    Created on : 16/08/2016, 14:35:53
    Author     : carloseduardobeluzo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String msg = (String) request.getAttribute("msg");
        %>
       <h1><%=msg%></h1><hr>
         <a href="managerForm.js">Back</a>
    </body>
</html>