<%-- 
    Document   : grabarviaje
    Created on : May 20, 2016, 2:21:40 AM
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
           
            String puntosalida = request.getParameter("puntosalida");//recibo el nombre de URL
            String puntollegada = request.getParameter("puntollegada");
            
            String nombreRecibido = request.getParameter("nombreRecibido");
            int codigo=0;
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy", "root", "root");
            Statement s = conexion.createStatement();
            ResultSet codusuario = s.executeQuery("SELECT * FROM usuario WHERE nombre_acceso ='" + nombreRecibido + "'");
            
            
            while (codusuario.next()) {
                        // le asigno el valor DEL CODIGO OBTENIDO  a la variable codigo por que no me lo coge directamente
                        codigo = Integer.valueOf(codusuario.getString("cod_usuario"));

            }
            request.setCharacterEncoding("UTF-8");
            String insercion = "INSERT INTO viaje (punto_partida,punto_llegada,conductor_viaje) VALUES ('" + puntosalida
                               + "', '" + puntollegada
                               + "', '" + codigo+ "')";
            //out.println(insercion);
            
            s.execute(insercion);         
            conexion.close();
            
            %><script>document.location = "confirmargrabadoviaje.jsp?nombreRecibido=<%=nombreRecibido%>&puntosalida=<%=puntosalida%>&puntollegada=<%=puntollegada%>&codigoconductor=<%=codigo%>"</script><%
            
         %>
        
    </body>
</html>
