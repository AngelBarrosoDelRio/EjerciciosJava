<%-- 
    Document   : ruletaFortuna
    Created on : Jan 30, 2016, 1:13:30 AM
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
            int cantidadApostada = Integer.valueOf(request.getParameter("apuesta"));
            String[] figura = {"calavera.png", "gatochinosuerte.gif", "mediolimon.jpg"};
            int jugada = (int) (Math.random() * 3);
            


        %><img src="img/<%= figura[jugada]%>"><br><%
        if (jugada == 0) {
                cantidadApostada = 0;
                out.println("Lo siento ha perdido todo el dinero");
            } else if (jugada == 1) {
                cantidadApostada *= 2;
                out.println("Enhorabuenaaa!!!! El gato de la suerteee!! dobla su dinero inicial");
            } else if (jugada == 2) {
                cantidadApostada /= 2;
                out.println("Casiii!!! le queda la mitad, siga jugando la suerte puede cambiar!!");
            }
        %><br><%
        out.print("Actualmente tiene: "+cantidadApostada);

        if (jugada == 1 || jugada == 2) {
        %>  <form action="ruletaFortuna.jsp" method="get">
            <input type="hidden" name="apuesta" value="<%=cantidadApostada%>"> <br>
            <input type="submit" value="volver a jugar">            
        </form>
        <form action="terminar.jsp" method="get">
            <input type="hidden" name="dineroGanado" value="<%=cantidadApostada%>"> <br>
            <input type="submit" value="plantarme">            
        </form>
        <%
        } else {
        %>
        <form action="index19.jsp" method="get">
            <input type="submit" value="finalizar">            
        </form>
        <%
            }
        %>
    </body>
</html>
