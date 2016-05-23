<%-- 
    Document   : administradoEjercicios
    Created on : May 9, 2016, 4:48:47 AM
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
            String nombreRecibido = request.getParameter("nombreUsuario");//recibo el nombre de URL
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_acceso", "root", "root");
            Statement s = conexion.createStatement();

            int codigo = 0;
            int suma = 0;
            //consulta para obtener el codigo del usuario del parametro recibido en la URL
            ResultSet listadoUsuario = s.executeQuery("SELECT * FROM usuarios WHERE nombreUsuario ='" + nombreRecibido + "'");
            while (listadoUsuario.next()) {
                // le asigno el valor DEL CODIGO OBTENIDO  a la variable codigo por que no me lo coge directamente
                codigo = Integer.valueOf(listadoUsuario.getString("cod_usuario"));

            }
            
            //consulto el codigo del ejercicio con permiso k coincide con el codigo del usuario pasado por la URL
            ResultSet listadoPermisos = s.executeQuery("SELECT cod_permiso FROM permisos_usuarios WHERE cod_usuario=" + codigo);
            //creo este whle para obtener el numero de coincidencias y poder darle el valor al array
            while (listadoPermisos.next()) {

                suma++;

            }
            /*creo el array codigopermiso y creo otra consulta para obtener el mismo 
            resultado de antes e introducirlos en el array creado haciendole un casth para pasarlo a INT*/
            int i = 0;
            int[] codigopermiso = new int[suma];
            ResultSet listadoPermisos2 = s.executeQuery("SELECT cod_permiso FROM permisos_usuarios WHERE cod_usuario=" + codigo);

            while (listadoPermisos2.next()) {

                codigopermiso[i] = Integer.valueOf(listadoPermisos2.getString("cod_permiso"));

                i++;

            }
            /*creo otro array ara almacenar los nombres de los ejercicios*/
            String[] nombre = new String[suma];
            int a = 0;
            for (int x = 0; x < suma; x++) {
                //consulto el nombre del ejercicio mediante los codigos obtenidos de la otra consulta
                ResultSet listadoPermisosUsuario = s.executeQuery("SELECT nombre_ejercicio_con_permiso FROM permisos  WHERE cod_permiso=" + codigopermiso[x]);
                //introduzco los nombres obtenidos en el array de nombre
                while (listadoPermisosUsuario.next()) {

                    nombre[a] = listadoPermisosUsuario.getString("nombre_ejercicio_con_permiso");
                    a++;
                }
            }
            //muestro los enlaces a los diferente ejercicios de los que tiene permiso cada usuario
            for (int x = 0; x < suma; x++) {
                    %><a href="http://localhost:8080/jsp/<%out.println(nombre[x]);%>/index.jsp"><%out.println(nombre[x]);%></a><%
                    System.out.println("\n");

                 }


        %>
    </body>
</html>
