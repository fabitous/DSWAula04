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
        <title>Client Details</title>
    </head>
    <body>
       <h1>Modulo: Client</h1><hr>
            <div><b>Nome</b>: <%=request.getParameter("name")%> </div>
            <div><b>Email</b>: ${param.email}</div>
        <hr>
        <a href="/WSisFin1/sisfin.html">Back</a>
    </body>
</html>
