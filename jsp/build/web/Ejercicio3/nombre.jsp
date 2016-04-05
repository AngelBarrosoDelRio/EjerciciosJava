<%-- 
    Document   : nombre
    Created on : Jan 27, 2016, 1:19:07 AM
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
        <% request.setCharacterEncoding("UTF-8"); %>
        HOLA 
        <% out.print(request.getParameter("nombre"));%>
        
    </body>
</html>
