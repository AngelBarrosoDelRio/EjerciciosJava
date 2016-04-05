<%-- 
    Document   : index19
    Created on : Jan 30, 2016, 1:13:16 AM
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
        <h1>Bienvenido al juego de la ruleta. ¿¿Tendras suerte??</h1>
        <form action="ruletaFortuna.jsp" method="get">
            ¿Que cantidad desea a postar?: <br> <input type="number" name="apuesta"> <br>
            <input type="submit" value="Apostar">            
        </form>
    </body>
</html>
