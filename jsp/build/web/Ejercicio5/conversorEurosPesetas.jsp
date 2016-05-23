<%-- 
    Document   : conversorEurosPesetas
    Created on : Jan 27, 2016, 1:32:26 AM
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
        <h1>Cambio</h1>

        <%
            request.setCharacterEncoding("UTF-8");
            String convertir = request.getParameter("conver");
            int cantidad = Integer.valueOf(request.getParameter("cantidad"));
            double resultado;
            if (convertir.equals("pesetas")) {
                resultado = cantidad * 166.67;
                out.print("cambiado a euros: " + resultado + "pstas");
            } else {

                resultado = cantidad / 166.67;
                out.print("cambiado a pesetas: " + resultado + "€");
            }


        %>
    </body>
</html>
