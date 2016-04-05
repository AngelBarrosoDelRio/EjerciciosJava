<%-- 
    Document   : tablaMultiplicar
    Created on : Jan 27, 2016, 8:27:10 AM
    Author     : angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="cssEjercicio6.css">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <%
                int numero=Integer.valueOf(request.getParameter("n"));
                for(int i=0; i<=10;i++){
            
            %>
            
            <tr>
                <td><% out.print(i +" x "+ numero+" = "+i*numero); %></td>
            </tr>
            <%    
            }
            %>
        </table>
    </body>
</html>
