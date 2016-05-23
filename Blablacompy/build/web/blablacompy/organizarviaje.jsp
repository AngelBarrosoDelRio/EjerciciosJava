<%-- 
    Document   : organizarviaje
    Created on : May 20, 2016, 1:53:14 AM
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
        <%
            String nombreRecibido = request.getParameter("nombreUsuario");//recibo el nombre de URL
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy", "root", "root");
            Statement s = conexion.createStatement();
            
            
            /*int suma=0;
            while (codusuario.next()) {

                        suma++;

                    }*/
                    
        %>
        <div class="contenedor">
            <div class="tituloviajes">
                <h1>Organiza un viaje</h1>
            </div>
            <div class="contenido">
            <h2>Introduzca los datos del nuevo viaje: </h2>
            <form method="get" action="grabarviaje.jsp">

              Punto de partida: <input class="cajita1" type="text" name="puntosalida"/></br>
              Punto de destino: <input class="cajita1" type="text" name="puntollegada"/></br>

              <input type="hidden" name="nombreRecibido" value="<%=nombreRecibido%>"/></br>


              <button type="submit" class="btn btn-primary">Crear viaje</button>
            </form>
              <form method="get" action="principal.jsp">
                    <input type="hidden" name="nombreUsuario" value="<%=nombreRecibido%>"/></br>
              <button type="submit" class="btn btn-danger">Cancelar</button>
            </form>
              </div>
        </div>
    </body>
</html>
