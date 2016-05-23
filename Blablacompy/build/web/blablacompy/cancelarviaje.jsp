<%-- 
    Document   : cancelarviaje
    Created on : May 23, 2016, 10:49:55 AM
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
            String nombreRecibido =request.getParameter("nombreRecibido");
            int codiApasarcodviaje =Integer.valueOf(request.getParameter("codiApasarcodviaje"));
            
            //ResultSet codusuario = s.executeQuery("DELETE FROM `viaje` WHERE  cod_viaje = "+codiApasarcodviaje);
            s.execute ("DELETE FROM `viaje` WHERE  cod_viaje = "+codiApasarcodviaje); 
            //out.println("DELETE FROM `viaje` WHERE  cod_viaje = "+codiApasarcodviaje);
            conexion.close();
            %><script>document.location = "principal.jsp?nombreUsuario=<%=nombreRecibido%>"</script><%
        %>
        
    </body>
</html>
