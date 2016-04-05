<%-- 
    Document   : cuestionario
    Created on : Jan 27, 2016, 11:58:59 AM
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
          String respuesta1 = request.getParameter("pregunta1"); 
          String respuesta2 = request.getParameter("pregunta2"); 
          String respuesta3 = request.getParameter("pregunta3"); 
          int puntos=0;
          
          if(respuesta1.equals("a")){
              puntos++;
          }
          if(respuesta2.equals("a")){
              puntos++;
          }
          if(respuesta3.equals("b")){
              puntos++;
          }
          
          if(puntos==3){
              out.print("eres un maquina");
          }
          if(puntos==2){
              out.print("casii");
          }
          if(puntos==1){
              out.print("hay que estudiar");
          }
          if(puntos==0){
              out.print("muy mal eres un paquete");
          }
        %>
    </body>
</html>
