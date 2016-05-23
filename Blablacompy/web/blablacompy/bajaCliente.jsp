<%-- 
    Document   : bajaCliente
    Created on : May 22, 2016, 3:24:34 AM
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
        <%Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy", "root", "root");
            Statement s = conexion.createStatement();
            int codiusuarioEliminar =Integer.valueOf(request.getParameter("codusuario"));
            
            //ResultSet codusuario = s.executeQuery("DELETE FROM `viaje` WHERE  cod_viaje = "+codiApasarcodviaje);
            s.execute ("DELETE FROM `usuario` WHERE  cod_usuario = "+codiusuarioEliminar); 
            s.execute ("DELETE FROM `blablacompy`.`detalle_viaje` WHERE `detalle_viaje`.`cod_usuario_pasajero` = "+codiusuarioEliminar);
            conexion.close();
            %><script>document.location = "index.jsp"</script><%
        %>
        <h1>Hello World!</h1>
    </body>
</html>
