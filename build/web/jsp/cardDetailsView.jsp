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
        <title>Card Details</title>
    </head>
    <body>
       <h1>Modulo: Card</h1><hr>
            <div><b>Brand :</b> <%=request.getParameter("brand")%> </div>
            <div><b>Number :</b> ${param.number}</div>
            <div><b>Valid :</b> ${param.valid}</div>
        <hr>
        <a href="/WSisFin1/sisfin.html">Back</a>
    </body>
</html>
