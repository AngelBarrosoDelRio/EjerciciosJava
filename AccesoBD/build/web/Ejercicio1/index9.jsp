<%-- 
    Document   : index9
    Created on : Jan 27, 2016, 8:37:59 AM
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
        <h1>Introduzca la altura a la que desea la piramide</h1>
        <form action="piramide.jsp" method="get">
            numero: <input type="number" name="n" autofocus>           
            <input type="submit" value="Validar">
        </form>
    </body>
</html>
