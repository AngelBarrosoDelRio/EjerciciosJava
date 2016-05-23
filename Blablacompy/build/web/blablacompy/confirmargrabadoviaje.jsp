<%-- 
    Document   : confirmargrabadoviaje
    Created on : May 20, 2016, 2:55:29 AM
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
            
            String nombreRecibido = request.getParameter("nombreRecibido");
            String codigo=request.getParameter("codigoconductor");
            int metrosEntrePuntos=(int)(Math.random()*50000 + 1);
            int codigoultimoviaje=0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy", "root", "root");
            Statement s = conexion.createStatement();
            //out.println("nombre usuario actual:"+nombreRecibido);
            ResultSet codusuario = s.executeQuery("select max(cod_viaje) as codigo from viaje");
            while (codusuario.next()) {
                        // le asigno el valor DEL CODIGO OBTENIDO  a la variable codigo por que no me lo coge directamente
                        codigoultimoviaje = Integer.valueOf(codusuario.getString("codigo"));

            }
            
         %>  
         
            <form method="get" action="grabardetallesviaje.jsp">
                <input type="hidden" name="codigoconductor" value="<%=codigo%>"/></br>
                <input type="hidden" name="codigoultimoviaje" value="<%=codigoultimoviaje%>"/></br>
                <input type="hidden" name="metros" value="<%=metrosEntrePuntos%>"/></br>
                <input type="hidden" name="nombreRecibido" value="<%=nombreRecibido%>"/></br>
                <div class="tituloviajes"><h2>Selecciona tus pasajeros para este viaje:</h2></div>
          <br />
          <div class="contenido2">
          <%
            ResultSet codusuario2 = s.executeQuery("SELECT cod_usuario,nombre_acceso FROM usuario");        
            while (codusuario2.next()){%>
            <input name="pasajero" type="checkbox" value="<%=codusuario2.getString("cod_usuario")%>" /><%out.println(codusuario2.getString("nombre_acceso"));%>
                <br />
          <%}%>
          
          
          <button type="submit" class="btn btn-primary">Confirmar viaje</button>
           </form>
          <form method="get" action="cancelarviaje.jsp">
                <input type="hidden" name="codiApasarcodviaje" value="<%=codigoultimoviaje%>"/></br>
                <input type="hidden" name="nombreRecibido" value="<%=nombreRecibido%>"/></br>
                <button type="submit" class="btn btn-danger">Cancelar viaje</button>
          </form>
        </div>
        
    </body>
</html>
