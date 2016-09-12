<%@page import="br.edu.ifsp.tads.dsw.sisfin.model.Card"%>
<%@page import="br.edu.ifsp.tads.dsw.sisfin.DAO.CardDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b>Nome | Email </b> <br>
        <%
        CardDAO dao = new CardDAO();
        List<Card> cards = dao.list();
        if (cards != null) {
            for(Card c : cards){        
        %>
       
        <%=c.getBrand()%> | <%=c.getNumber()%> | <%=c.getValid()%> <br>
        
        <%}}%>
    </body>
</html>