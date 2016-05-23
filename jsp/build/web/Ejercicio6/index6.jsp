<%-- 
    Document   : index6
    Created on : Jan 27, 2016, 1:57:42 AM
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
        <h1>Introduzca el numero del que desea saber su tabla de multiplicar</h1>
        <form action="tablaMultiplicar.jsp" method="get">
            numero: <input type="number" name="n" autofocus>
            
            <input type="submit" value="Validar">
        </form>
    </body>
</html>
