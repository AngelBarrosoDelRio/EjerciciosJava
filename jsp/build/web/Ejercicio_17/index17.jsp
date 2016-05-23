<%-- 
    Document   : index17
    Created on : Jan 28, 2016, 11:50:52 PM
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
        <form action="configuracionCoche.jsp" method="get">
            Tapicería:
            <select name="tapiceria">
                <option value="negro" selected="selected">Cuero negro</option>
                <option value="berengena">Color berengena</option>
                <option value="blanco">Blanco marfil</option>
            </select>
            <br>
            <br>
            Tipo de moldura interior:
            <select name="moldura">
                <option value="carbono" selected="selected">Fibra de carbono</option>
                <option value="madera">Madera de nogal</option>
            </select>
            <br>
            <br>
            
            <input type="submit" value="crear interior">
        </form>
    </body>
</html>
