<%-- 
    Document   : guardardatospersonalesNuevos
    Created on : May 22, 2016, 4:19:17 AM
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
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy", "root", "root");
        Statement s = conexion.createStatement();
        String nombrecompleto=request.getParameter("nombrecompleto");
        String telefono =request.getParameter("telefono");
        String dni =request.getParameter("dni");
        String nombreacceso =request.getParameter("nombreacceso");
        String contrasena =request.getParameter("contrasena");
        String insercion = "INSERT INTO usuario (nom_ape_usuario,dni_usuario,telf,nombre_acceso,password) VALUES ('" + nombrecompleto
                                + "', '" + dni
                                + "', '" + telefono
                                + "', '" + nombreacceso
                                + "', '" + contrasena+ "')";
            //out.println(insercion);
            
            s.execute(insercion);         
            conexion.close();
            
            %><script>document.location = "index.jsp"</script><%
         %>   
    </body>
</html>
