<%-- 
    Document   : index
    Created on : May 19, 2016, 1:46:12 AM
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
        <title>ACCESO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">       
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="cssprincipal.css" />
        <style>
            
        </style>
    </head>
    <body>
        <div class="conjunto">
            <div class="titulo">
                <h2>Introduzca sus datos de acceso</h2>
            </div>
            <div class="cajainiciosesion">

            <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy","root", "root");
            Statement s = conexion.createStatement();



            %>
            <div class="minititulo">
                <h4>Indique su nombre y contraseña</h4>
            </div>
            
            <form method="get" >
                Nombre: <input class="cajita" type="text" name="nombreUsuario" /><br>
                Contraseña: <input type="password" name="password" /><br>
                <button type="submit" class="btn btn-primary">entrar</button>
            </form>
            <%
           
            ResultSet existe = s.executeQuery ("SELECT nombre_acceso,password FROM usuario ");
            while (existe.next()) {
                    if(existe.getString("nombre_acceso").equals(request.getParameter("nombreUsuario"))&&
                        existe.getString("password").equals(request.getParameter("password"))){
                        String nombre=request.getParameter("nombreUsuario");
                        
                        %><script>document.location = "principal.jsp?nombreUsuario=<%=nombre%>"</script><%
                        
                    }
            }
            

            %>
            </div>
        
                
            <div class="registro">
            <h4>Registrarme</h4>
            
            <form method="get" action="altanueva.jsp">
                
                <button type="submit" class="btn btn-primary">Registrarme</button>
            </form>
        

        </div>
      </div>
    </body>
</html>
