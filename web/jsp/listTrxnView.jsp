<%@page import="br.edu.ifsp.tads.dsw.sisfin.model.Trxn"%>
<%@page import="br.edu.ifsp.tads.dsw.sisfin.DAO.TrxnDAO"%>
<%@page import="br.edu.ifsp.tads.dsw.sisfin.model.Card"%>
<%@page import="br.edu.ifsp.tads.dsw.sisfin.DAO.CardDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page - Trxn list</title>
    </head>
    <body>
        <b>Card | Value | Date </b> <br>
        <%
        TrxnDAO dao = new TrxnDAO();
        List<Trxn> trxn = dao.list();
        if (trxn != null) {
            for(Trxn t : trxn){        
        %>
       
        <%=t.getCardNumber() %> | <%=t.getValue()%> | <%=t.getDate()%> <br>
        
        <%}}%>
    </body>
</html>