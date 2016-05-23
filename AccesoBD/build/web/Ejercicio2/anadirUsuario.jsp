<%-- 
    Document   : anadirUsuario
    Created on : May 9, 2016, 1:29:27 AM
    Author     : angelo
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_acceso", "root", "root");
            Statement s = conexion.createStatement();
            String cadena = "null";
            boolean existeYa = false;
            ResultSet existe = s.executeQuery("SELECT nombreUsuario,password FROM usuarios ");

            while (existe.next() && !existeYa) {
                if (existe.getString("nombreUsuario").equals(request.getParameter("nombreUsuario"))) {
                    existeYa = true;
                }
            }
            if (existeYa) {
                 %><script>alert("El usuario introducido ya existe por favor utilice otro noombre!");</script><%
            } else {
                    
                request.setCharacterEncoding("UTF-8");
                String insercion = "INSERT INTO usuarios VALUES (" + cadena + ",'" + request.getParameter("nombreUsuario") + "', '" + request.getParameter("password") + "')";
                s.execute(insercion);
                conexion.close();

            }

            //out.println(insercion);
%>
        Socio dado de alta.
        <script>document.location = "Ejercicio2.jsp"</script>



    </body>
</html>
