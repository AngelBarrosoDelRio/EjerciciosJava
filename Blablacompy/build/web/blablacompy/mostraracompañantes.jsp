<%-- 
    Document   : mostraracompañantes
    Created on : May 20, 2016, 9:03:32 AM
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
        <style>
            td{
                padding:15px;
                border: 1px solid black;
            }
            
        </style>
    </head>
    <body>
        <%Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy", "root", "root");
            Statement s = conexion.createStatement();
            String codiApasarcodviaje =request.getParameter("codiApasarcodviaje");
            String nombreRecibido = request.getParameter("nombreRecibido");
            int codigoviajerecibido=Integer.valueOf(codiApasarcodviaje);
            //out.println(codigoviajerecibido);
            ResultSet codusuario = s.executeQuery("SELECT distinct cod_usuario_pasajero FROM detalle_viaje WHERE cod_viaje =any(select cod_viaje from viaje where cod_viaje="+codigoviajerecibido+")");
            int suma=0;
            while (codusuario.next()) {

                suma++;

            }
            int[]array=new int[suma];
            int i=0;
            ResultSet codusuario2 = s.executeQuery("SELECT distinct cod_usuario_pasajero FROM detalle_viaje WHERE cod_viaje ="+codigoviajerecibido);

            while (codusuario2.next()) {

                   array[i]=Integer.valueOf(codusuario2.getString("cod_usuario_pasajero"));
                   i++;

            }
            String[]arrayaux=new String[suma];
            ResultSet codconductor;
            int x;
            for(x=0; x<array.length;x++){
                
                codconductor = s.executeQuery("SELECT nom_ape_usuario FROM usuario WHERE cod_usuario ="+array[x]);
                //out.print("SELECT conductor_viaje FROM viaje WHERE cod_viaje ="+array[x]);
                while (codconductor.next()) {
                    String codaux=codconductor.getString("nom_ape_usuario");
                    //out.println("cod conductor "+codconductor);
                    //out.println(codconductor.getString("nom_ape_usuario"));
                    arrayaux[x]=codaux;
                }
                //out.println("arry 1"+array[x]);
            }
            
             %>
            <div class="contenedor">
                <div class="tituloviajes">
                    <h1>MIS ACOMPAÑANTES</h1>
                </div>
                <div class="contenidoacompañantes">
                <table>
                    <tr>
                        <td  class="titulos_misviajes">codigo del viaje</td>
                        <td class="titulos_misviajes">nombre de tus pasajeros</td>
                    </tr>
                    <%for(i=0;i<arrayaux.length;i++){

                    %>
                    <tr>
                        <%

                        out.println("<td>"+codigoviajerecibido+"</td><td>"+arrayaux[i]+"</td>");
                        %>
                    </tr>
                    <%}%>
                </table>
                <form method="get" action="principal.jsp">

                        <input type="hidden" name="nombreUsuario" value="<%=nombreRecibido%>"/></br>
                        <button type="submit" class="btn btn-primary">Volver inicio</button>
                </form>
            </div>
        </div>
    </body>
</html>
