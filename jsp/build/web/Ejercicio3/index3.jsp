<%-- 
    Document   : index3
    Created on : Jan 27, 2016, 1:15:50 AM
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
        <h1>Introduzca su nombre para poder saludarlo por su nombre</h1>
        <form action="nombre.jsp" method="get">
            nombre: <input type="text" name="nombre" autofocus>
            <input type="submit" value="Validar">
        </form>
    </body>
</html>
