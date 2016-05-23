<%-- 
    Document   : index5
    Created on : Jan 27, 2016, 1:31:49 AM
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
       <h1>Introduzca la cantidad que desea modificar</h1>
        <form action="conversorEurosPesetas.jsp" method="get">
            cantidad: <input type="number" name="cantidad" autofocus>
            cambiar a: 
                <select name="conver">
                    <option>pesetas</option>
                    <option>euros</option>
                </select>
                <br>
            <input type="submit" value="Validar">
        </form>
    </body>
</html>
