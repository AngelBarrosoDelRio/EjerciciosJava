<%-- 
    Document   : modificardatospersonales
    Created on : May 21, 2016, 3:27:45 AM
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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="cssprincipal.css" />
    </head>
    <body>
        <%Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy", "root", "root");
            Statement s = conexion.createStatement();
            String nombreacceso =request.getParameter("nombreacceso");
            String nombrecompleto =request.getParameter("nombrecompleto");
            String telefono =request.getParameter("telefono");
            String dni =request.getParameter("dni");
            String codusuario =request.getParameter("codusuario");
            
        %>
        <div class="contenedor">
            <div class="tituloviajes">
                <h1>MODIFICAR DATOS</h1>
            </div>
            <div class="contenido">
                <form method="get" action="guardarmodificacionespersonales.jsp">
                   Nombre acceso:   <input class="cajita1" type="text" name="nombreacceso" value="<%=nombreacceso%>"/></br>
                   Nombre completo: <input class="cajita1" type="text" name="nombrecompleto" value="<%=nombrecompleto%>"/></br>
                   Numero telefono: <input class="cajita1" type="number" name="telefono" value="<%=telefono%>"/></br>
                   Numero DNI:   <input class="cajita1" type="text" name="dni" value="<%=dni%>"/></br>
                   <input type="hidden" name="codusuario" value="<%=codusuario%>"/></br>
                   <button type="submit" class="btn btn-primary">Guardar modificaciones</button>
                </form>
                <form method="get" action="principal.jsp">

                        <input type="hidden" name="nombreUsuario" value="<%=nombreacceso%>"/></br>
                        <button type="submit" class="btn btn-primary">Volver inicio</button>
                </form>
            </div>
        </div>
    </body>
</html>
