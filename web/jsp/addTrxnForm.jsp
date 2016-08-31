<%-- 
    Document   : addClientForm.jsp
    Created on : 24/08/2016, 21:36:04
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trxn Details</title>
    </head>
    <body>
       <h1>Modulo: Trxn</h1><hr>
       <form action="../AddClient.do">
            <div>Cartão <input type="text" name="cardNumber"> </div>
            <div>Valor <input type="text" name="value"> </div>
            <div>Data <input type="text" name="date"> </div>
            <input type="submit" value="Add">
        </form>
            <hr>
        <a href="/WSisFin1/sisfin.html">Back</a>
    </body>
</html>