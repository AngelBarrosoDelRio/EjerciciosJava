<%-- 
    Document   : piramide
    Created on : Jan 27, 2016, 8:39:19 AM
    Author     : angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int altura=Integer.valueOf(request.getParameter("n"));
        int espaciosDelanteros= altura-1;
        int caracteres= 1;
        for(int i=0; i<altura;i++){
            for(int j=0;j < espaciosDelanteros;j++){
                //out.print("@");
                %>
                <img src="../Ejercicio1/img/oceano-1.png" style="width:50px;height:50px;">  
                <%
                
            }
            espaciosDelanteros--;
            for(int x=0;x<caracteres;x++){
                //out.print("*");
                 %>
                <img src="../Ejercicio1/img/ladrillo600.jpg"  style="width:50px;height:50px;">  
                <%
            }
            caracteres+=2;
        %>
        <br>
        <%
            
        }
        %>
    </body>
</html>
