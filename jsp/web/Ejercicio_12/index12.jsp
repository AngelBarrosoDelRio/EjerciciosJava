<%-- 
    Document   : index12
    Created on : Jan 28, 2016, 7:57:24 AM
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
        <h1>Bienvenido al calendario</h1>
        
        <form action="calendario2.jsp" method="get">
            
            nombre del mes:<br> <input type="text" name="nombreMes"> <br>
            año: <br> <input type="number" name="año"> <br>           
            <input type="submit" value="enviar datos">
            
        </form>
    </body>
</html>
