<%-- 
    Document   : configuracionCoche
    Created on : Jan 28, 2016, 11:51:07 PM
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
        <%
            String tapiceria = request.getParameter("tapiceria");
            String moldura = request.getParameter("moldura");
            String imagen = tapiceria + moldura + ".jpg";
        %>
        <p><img src="<%= imagen%>"></p>
    </body>
</html>
