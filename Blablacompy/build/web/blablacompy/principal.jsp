<%-- 
    Document   : principal
    Created on : May 19, 2016, 1:47:13 AM
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
        <!DOCTYPE html>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="cssprincipal.css" />
        <title>JSP Page</title>
        <style>
            .sinformato{
                text-decoration:none;
                color: black;
            }
        </style>
    </head>
    <body>
        <%
            String nombreRecibido = request.getParameter("nombreUsuario");//recibo el nombre de URL
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy", "root", "root");
            Statement s = conexion.createStatement();
            
        %>
        <div class="contenedor">
            
        <div class="datosusuariologin">
            <%out.println("Usuario:"+nombreRecibido);%><button <button type="button" class="btn btn-primary btn-xs"><a class="sinformato"href="http://localhost:8080/Blablacompy/blablacompy/index.jsp">Cerrar Sesion</a></button>

        </div>
        <div class="barraNavegacion">
                <div id="header">
                    <ul class="nav" style="list-style-type:none;">
                        <li style="float:left" >
                            <button type="button" class="btn btn-primary"><a class="sinformato"href="http://localhost:8080/Blablacompy/blablacompy/miviajes.jsp?nombreUsuario=<%= nombreRecibido%>">Mis viajes</a></button>
                        </li>
                        <li style="float:left" >
                            <button type="button" class="btn btn-primary"><a class="sinformato"href="http://localhost:8080/Blablacompy/blablacompy/organizarviaje.jsp?nombreUsuario=<%= nombreRecibido%>">Organizar viaje</a></button>
                        </li>
                        <li style="float:left" >
                            <button type="button" class="btn btn-primary"><a class="sinformato"href="http://localhost:8080/Blablacompy/blablacompy/miperfil.jsp?nombreUsuario=<%= nombreRecibido%>">Mi perfil</a></button>
                        </li>
                        
                         
                    </ul>
                </div>
                        
            </div>
            <div class="miniinfo">
                <img src="compartircoche.png" WIDTH=995 HEIGHT=400 BORDER=2 >
                <div class="inforfuncionamiento">
                    <h2>¡¡ES HORA DE COMPARTIR GASTOS!!</h2>
                    <P>Deja de gastar en tus trayectos y empieza a pensar en compartir
                        gastos con tus compañeros de trabajo, escuela, etc... Solo debereis registraros 
                        los participantes y organiza los viajes. Se termino ese imenso desembolso diario!!</P>
                </div>
            </div>
            </div>
    </body>
</html>
