<%-- 
    Document   : index
    Created on : Jan 24, 2016, 11:23:49 PM
    Author     : angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="style.css"> 
        <title>JSP Page</title>
    </head>
    <body>
       <div>
            <h2>Mi nombre (html): Angel</h2>
            <h2>Mi apellido(html): Barroso del Rio</h2>
            <% out.println("<h2>Mi nombre (java): Angel</h2>"); %>
        </div>
    </body>
</html>
