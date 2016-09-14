<%-- 
    Document   : findCardView
    Created on : 31/08/2016, 17:46:27
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Card Details</title>
    </head>
    <body>
        <h1>Card Details</h1>
        <%
            long number = (long) request.getAttribute("number");
        %>
        <%
            String brand = (String) request.getAttribute("brand");
        %>
        <%
            String valid = (String) request.getAttribute("valid");
        %>
       <h1><%=number%></h1><hr>
       <h1><%=brand%></h1><hr>
       <h1><%=valid%></h1><hr>
         <a href="sisfin.html">Back</a>
    </body>
</html>
