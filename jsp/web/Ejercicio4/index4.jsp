<%-- 
    Document   : index4
    Created on : Jan 27, 2016, 1:21:33 AM
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
        <h1>Introduzca sus ultimas 3 notas y le dire la media</h1>
        <form action="mediaNotas.jsp" method="get">
            nota1: <input type="number" name="nota1" autofocus>
            nota2: <input type="number" name="nota2" >
            nota3: <input type="number" name="nota3" >
            <input type="submit" value="Validar">
        </form>
    </body>
</html>
