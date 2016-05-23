<%-- 
    Document   : mediaNotas
    Created on : Jan 27, 2016, 1:23:05 AM
    Author     : angelo
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
            int nota1;
            int nota2;
            int nota3;
            nota1 = Integer.parseInt (request.getParameter("nota1"));
            nota2 = Integer.parseInt (request.getParameter("nota2"));
            nota3 = Integer.parseInt (request.getParameter("nota3"));
            
            double resultado= ((nota1+nota2+nota3)/3);
            
            out.print(resultado);
        
        
        
        
        %>
    </body>
</html>
