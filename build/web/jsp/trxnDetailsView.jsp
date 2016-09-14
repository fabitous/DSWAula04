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
        <title>Transaction Details</title>
    </head>
    <body>
       <h1>Modulo: Transaction</h1><hr>
            <div><b>Card number :</b> <%=request.getParameter("carNumber")%> </div>
            <div><b>Value :</b> ${param.email}</div>
            <div><b>Date :</b> ${param.email}</div>
        <hr>
        <a href="/WSisFin1/sisfin.html">Back</a>
    </body>
</html>
