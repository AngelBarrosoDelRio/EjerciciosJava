<%-- 
    Document   : levantaCubiletes
    Created on : Jan 30, 2016, 12:42:02 AM
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
            int posicionBolita= (int) (Math.random() * 3);
            String posicionFinal="";
            String posicionDadaXCLiente=request.getParameter("trilero");
            
            if(posicionBolita==0){
                posicionFinal="izqu";
            }else if(posicionBolita==1){
                posicionFinal="centro";
            } else if(posicionBolita==2){
                posicionFinal="derec";
            }
        
            for(int i=0;i<3;i++){
                if(posicionBolita==i){
                   %> <img src="cubilete_con_1bola.png" style="width: 150px;height: 250px;"><%
                } else{
                   %> <img src="cubilete_sin_bola.png" style="width: 150px;height: 250px;"><%
                }
            }
            
            if(posicionFinal.equals(posicionDadaXCLiente)){
                %><h2> Enhorabuena ha ganadoo!!!<%
            }else {
                %><h2> Lo siento ha perdidoo!!!<%
            }
        %>
    </body>
</html>
