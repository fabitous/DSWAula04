<%-- 
    Document   : findCardForm
    Created on : 31/08/2016, 18:41:48
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modulo: Card</h1><hr>
       <form action="../FindCard">
            <div>Número <input type="text" name="number"> </div>
            <div>Bandeira <input type="text" name="brand"> </div>
            <div>Validade (MM/AAAA) <input type="text" name="valid"> </div>
            <input type="submit" value="Find">
        </form>
            <hr>
        <a href="/WSisFin1/sisfin.html">Back</a>
    </body>
</html>
