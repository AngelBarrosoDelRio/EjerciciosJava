<%-- 
    Document   : index11
    Created on : Jan 27, 2016, 12:11:38 PM
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
        
        <form action="calendario1.jsp" method="get">
            
            nombre del mes:<br> <input type="text" name="nombreMes"> <br>
            texto sobre calendario:<br> <input type="text" name="textoCalen"> <br>
            dia semana del 1:<br> <input type="text" name="dia1"> <br>
            año: <br> <input type="number" name="año"> <br>
            numero de dias del mes:<br> <input type="number" name="numeroDiasMes"> <br>
            
            <input type="submit" value="enviar datos">
            
        </form>
        
    </body>
</html>
