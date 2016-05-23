<%-- 
    Document   : guardarmodificacionespersonales
    Created on : May 21, 2016, 3:44:55 AM
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
            String nombreacceso =request.getParameter("nombreacceso");
            String nombrecompleto =request.getParameter("nombrecompleto");
            String telefono =request.getParameter("telefono");
            String dni =request.getParameter("dni");
            String codusuario =request.getParameter("codusuario");
            request.setCharacterEncoding("UTF-8");
            String actualizar = "UPDATE usuario SET nom_ape_usuario='"+nombrecompleto+"',dni_usuario='"+dni+"',telf='"+telefono+"',nombre_acceso='"+nombreacceso+"' where usuario.cod_usuario="+codusuario;
            
            out.println(actualizar);
            s.execute(actualizar);
            s.close();
            %><script>document.location = "miperfil.jsp?nombreUsuario=<%=nombreacceso%>"</script><%
            
        %>
        
    </body>
</html>
