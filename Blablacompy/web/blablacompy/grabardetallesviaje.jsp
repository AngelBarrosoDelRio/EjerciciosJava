<%-- 
    Document   : grabardetallesviaje
    Created on : May 20, 2016, 3:37:34 AM
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
            
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy", "root", "root");
            Statement s = conexion.createStatement();
            
            
            String[] pasajerosViaje=request.getParameterValues("pasajero");
            String codigo=request.getParameter("codigoultimoviaje");
            String metros = request.getParameter("metros");
            String nombreRecibido = request.getParameter("nombreRecibido");
            /*out.println("nombre usuario actual:"+nombreRecibido);
           for(String favorito: pasajerosViaje){
                out.println(favorito + "<br/>");
           }*/
           
            for(int i=0;i<pasajerosViaje.length; i++){
            request.setCharacterEncoding("UTF-8");
            String insercion = "INSERT INTO detalle_viaje (cod_viaje,cod_usuario_pasajero,metros_entre_puntos) VALUES ('" + codigo
                               + "', '" + pasajerosViaje[i]
                               + "', '" + metros+ "')";
            
            //out.println(insercion);
            s.execute(insercion);
            //out.println("principal.jsp?nombreUsuario="+nombreRecibido);
            }
            
                    
            conexion.close();
            %><script>document.location = "principal.jsp?nombreUsuario=<%=nombreRecibido%>"</script><%
       
            
        %>
        
    </body>
</html>
