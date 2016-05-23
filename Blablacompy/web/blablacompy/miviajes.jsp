<%-- 
    Document   : miviajes
    Created on : May 19, 2016, 2:53:27 AM
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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="cssprincipal.css" />

        <title>mis viajes</title>
        <style>
            td{
                padding:15px;
                border: 1px solid black;
            }
            .titulos_misviajes{
                text-align: center;
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
            <div class="tituloviajes">
               <h1>VIAJES REALIZADOS</h1> 
            </div>

            <div class="contenido">

                    <%  

                        int codigo = 0;

                        //consulta para obtener el codigo del usuario del parametro recibido en la URL
                        ResultSet codusuario = s.executeQuery("SELECT * FROM usuario WHERE nombre_acceso ='" + nombreRecibido + "'");
                        while (codusuario.next()) {
                            // le asigno el valor DEL CODIGO OBTENIDO  a la variable codigo por que no me lo coge directamente
                            codigo = Integer.valueOf(codusuario.getString("cod_usuario"));

                        }
                        int suma=0;
                        ResultSet listadoUsuario = s.executeQuery("SELECT distinct V.cod_viaje,V.punto_partida,V.punto_llegada FROM viaje V,detalle_viaje D WHERE V.conductor_viaje ='" + codigo + "'");
                        ResultSet pasajeros = s.executeQuery("SELECT distinct D.cod_usuario_pasajero,V.cod_viaje FROM detalle_viaje D,viaje V  WHERE V.conductor_viaje ='" + codigo + "'");
                        while (pasajeros.next()) {

                            suma++;

                        }
                        int i = 0;
                        int[] codigopasajero = new int[suma];
                        ResultSet pasajeros2 = s.executeQuery("SELECT distinct D.cod_usuario_pasajero,V.cod_viaje FROM detalle_viaje D,viaje V  WHERE V.conductor_viaje ='" + codigo + "'");

                        while (pasajeros2.next()) {

                            codigopasajero[i] = Integer.valueOf(pasajeros2.getString("D.cod_usuario_pasajero"));

                            i++;

                        }
                        /*creo otro array ara almacenar los nombres de los ejercicios*/
                        String[] nombrepasajero = new String[suma];
                        int a = 0;
                        for (int x = 0; x < suma; x++) {
                            //consulto el nombre del ejercicio mediante los codigos obtenidos de la otra consulta
                            ResultSet listadoPermisosUsuario = s.executeQuery("SELECT nom_ape_usuario FROM usuario  WHERE cod_usuario=" + codigopasajero[x]);
                            //introduzco los nombres obtenidos en el array de nombre
                            while (listadoPermisosUsuario.next()) {

                                nombrepasajero[a] = listadoPermisosUsuario.getString("nom_ape_usuario");
                                a++;
                            }
                        }
                        ResultSet listadoUsuario2 = s.executeQuery("SELECT distinct V.cod_viaje,V.punto_partida,V.punto_llegada FROM viaje V,detalle_viaje D WHERE V.conductor_viaje ='" + codigo + "' ORDER BY V.cod_viaje");
                    if(nombrepasajero.length==0){
                        %><h1>NO HA REALIZADO NINGUN VIAJE</h1>
                        <form method="get" action="principal.jsp">

                            <input type="hidden" name="nombreUsuario" value="<%=nombreRecibido%>"/></br>
                            <button type="submit" class="btn btn-primary">Volver inicio</button>
                        </form>
                        <%
                    }else{
                    %>
                    <table >
                        <tr>
                            <td class="titulos_misviajes">codigo viaje</td>
                            <td class="titulos_misviajes">punto partida</td>
                            <td class="titulos_misviajes">punto llegada</td>

                        </tr>
                        <tr>
                            <%
                            int comrueba=0;
                            while (listadoUsuario2.next()) {


                            %>                        
                            <td class="titulos_misviajes1"><%out.println(listadoUsuario2.getString("V.cod_viaje"));%></td>
                            <% 
                            int codiApasar=Integer.valueOf(listadoUsuario2.getString("V.cod_viaje"));
                            %>
                            <td><%out.println(listadoUsuario2.getString("V.punto_partida"));%></td>
                            <td><%out.println(listadoUsuario2.getString("V.punto_llegada"));%></td>

                            <td class="botones">
                                <form method="get" action="mostraracompañantes.jsp">
                                    <input type="hidden" name="codiApasarcodviaje" value="<%=codiApasar%>"/></br>
                                    <input type="hidden" name="nombreRecibido" value="<%=nombreRecibido%>"/></br>
                                <button type="submit" class="btn btn-primary">Mis acompañantes</button>
                                </form>

                            </td>
                            <td class="botones">
                                <form method="get" action="eliminarviaje.jsp">
                                <input type="hidden" name="codiApasarcodviaje" value="<%=codiApasar%>"/></br>
                                <input type="hidden" name="nombreRecibido" value="<%=nombreRecibido%>"/></br>
                                <button type="submit" class="btn btn-danger">Eliminar viaje</button>
                                </form>

                            </td>
                            </tr>


                            <%


                            } %>



                    </table>
                    
                    <form method="get" action="principal.jsp">

                        <input type="hidden" name="nombreUsuario" value="<%=nombreRecibido%>"/></br>
                        <button type="submit" class="btn btn-primary">Volver inicio</button>
                    </form>
                     <%}%>
            </div>
    </div>
    </body>
</html>
