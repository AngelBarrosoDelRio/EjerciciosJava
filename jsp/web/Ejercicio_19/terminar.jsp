<%-- 
    Document   : terminar
    Created on : Jan 30, 2016, 1:51:00 AM
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
        <%int cantidadApostada = Integer.valueOf(request.getParameter("dineroGanado"));%>
        <h1>Ha obtenido : <%=cantidadApostada %> </h1>
        <h2>Gracias por jugar con nosotros vuelva pronto</h2>
        <form action="index19.jsp" method="get">
            <input type="submit" value="volver a jugar">            
        </form>
    </body>
</html>
