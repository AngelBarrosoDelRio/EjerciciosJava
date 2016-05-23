<%-- 
    Document   : Ejercicio1
    Created on : May 6, 2016, 12:22:50 AM
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
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_acceso","root", "root");
      Statement s = conexion.createStatement();

      ResultSet listado = s.executeQuery ("SELECT * FROM usuarios");
      boolean existeParametros=false;
    %>
    <h3>Indique su nombre y contraseña</h3>
    <form method="get" >
        <input type="text" name="nombreUsuario" />
        <input type="password" name="password" />
        <input type="submit" value="validar">
    </form>
    <%
      ResultSet existe = s.executeQuery ("SELECT nombreUsuario,password FROM usuarios ");
      while (existe.next()) {
            if(existe.getString("nombreUsuario").equals(request.getParameter("nombreUsuario"))&&
                  existe.getString("password").equals(request.getParameter("password"))){
              %><script>document.location = "index9.jsp" </script><%
                existeParametros=true;
            }
      }
      
    
    %>
    </body>
</html>
