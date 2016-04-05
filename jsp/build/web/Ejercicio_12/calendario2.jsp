<%-- 
    Document   : calendario2
    Created on : Jan 28, 2016, 7:57:43 AM
    Author     : angelo
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String mes = request.getParameter("nombreMes");
        int año = Integer.valueOf(request.getParameter("año"));
        
        Calendar ahoramismo = Calendar.getInstance();
        
        %>
    </body>
</html>
