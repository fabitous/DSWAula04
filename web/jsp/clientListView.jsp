<%@page import="java.util.List"%>
<%@page import="br.edu.ifsp.tads.dsw.sisfin.model.Client"%>
<%@page import="br.edu.ifsp.tads.dsw.sisfin.DAO.ClienteDAO"%>
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
        ClienteDAO dao = new ClienteDAO();
        List<Client> clients = null;
        if (clients != null) {
            for(Client c : clients){        
        %>
       
        <%=c.getName()%> | <%=c.getEmail()%> <br>
        
        <%}}%>
    </body>
</html>