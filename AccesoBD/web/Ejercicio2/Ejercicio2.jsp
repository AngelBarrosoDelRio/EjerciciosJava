<%-- 
    Document   : Ejercicio1
    Created on : May 6, 2016, 12:22:50 AM
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
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_acceso", "root", "root");
            Statement s = conexion.createStatement();

            ResultSet listado = s.executeQuery("SELECT * FROM usuarios");
            
        %>
        
        <%
            ResultSet existe = s.executeQuery("SELECT nombreUsuario,password FROM usuarios ");

            
                %>
                <table>
                      
                
                <%
                    while (existe.next()) {
                        %><tr><%
                        out.println("<td>" + existe.getString("nombreUsuario") + "</td>"+"<td>" + existe.getString("password") + "</td>");
                        %></tr><%
                    }
            %>
                <tr>
                <h3>Añadir nuevo usuario</h3>
                </tr>
                <tr>
                    <td>
                        <form method="get" action="anadirUsuario.jsp" >
                            nombre   <input type="text" name="nombreUsuario" />
                            contraeña<input type="password" name="password" />
                            <input type="submit" value="añadir usuario">
                        </form> 
                    </td>
                </tr>
                </table>
            
                <form method="get" action="indexPrincipal.jsp" >
                <input type="submit" value="cerrar sesion">
            </form> 
           

        
    </body>
</html>
