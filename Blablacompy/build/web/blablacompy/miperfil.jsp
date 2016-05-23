<%-- 
    Document   : miperfil
    Created on : May 21, 2016, 2:32:30 AM
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
            String nombreRecibido =request.getParameter("nombreUsuario");
            String nombreCompleto="",telefono="",dni="",codusuario="";
        %>
        <div class="contenedor">
            <div class="tituloviajes2">
                <h1>MI PERFIL</h1>
            </div>
            <div class="contenidoacompañantes">
                <img src="invitado.jpg" alt="invitado" class="img-circle" width="200" height="200">
            <%
               ResultSet usuario = s.executeQuery("SELECT * FROM usuario WHERE nombre_acceso ='"+nombreRecibido+"'");
               //out.println("SELECT * FROM usuario WHERE nombre_acceso ='"+nombreRecibido+"'");
               while (usuario.next()) {

                   codusuario=usuario.getString("cod_usuario");
                   nombreCompleto= usuario.getString("nom_ape_usuario");
                   telefono = usuario.getString("telf");
                   dni=usuario.getString("dni_usuario");

                }   
            %>
            <p>Nombre acceso <%out.println(nombreRecibido);%></p>
            <p>Nombre usuario: <%out.println(nombreCompleto);%></p>
            <p>telfono usuario: <%out.println(telefono);%></p>
            <p>DNI: <%out.println(dni);%></p>
                <div class="modfica">
                    <form method="get" action="modificardatospersonales.jsp">
                        <input type="hidden" name="codusuario" value="<%=codusuario%>"/></br>
                        <input type="hidden" name="nombreacceso" value="<%=nombreRecibido%>"/></br>
                        <input type="hidden" name="nombrecompleto" value="<%=nombreCompleto%>"/></br>
                        <input type="hidden" name="telefono" value="<%=telefono%>"/></br>
                        <input type="hidden" name="dni" value="<%=dni%>"/></br>
                        <button type="submit" class="btn btn-primary">Modificar mis datos</button>
                    </form>
                </div>
                <div class="dardebaja">
                    <form method="get" action="bajaCliente.jsp">
                        <input type="hidden" name="codusuario" value="<%=codusuario%>"/></br>

                        <button type="submit" class="btn btn-danger">Darme de baja</button>
                    </form>
                </div>
                <div class="dardebaja2">
                    <form method="get" action="principal.jsp">

                            <input type="hidden" name="nombreUsuario" value="<%=nombreRecibido%>"/></br>
                            <button type="submit" class="btn btn-primary">Volver inicio</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
