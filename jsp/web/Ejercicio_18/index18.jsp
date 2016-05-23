<%-- 
    Document   : index18
    Created on : Jan 30, 2016, 12:38:52 AM
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
        <h2>Bienvenido al juego del trilero</h2>
        <h4>Debera elegir una de las tres posiciones posibles (izquierda,centro o derecha)<br>
            segun piense este situada la bolita.</h4>

        <div>
            <% for (int i = 0; i < 3; i++) {%>
            <img src="cubilete_tapando_bolas.png" style="width: 150px;height: 250px;">
            <%}%>
        </div>
        <br>
        <div>
            <form action="levantaCubiletes.jsp" method="get">
                ¿Elija una posible situacion de la bola?:
                <select name="trilero">
                    <option value="izqu" selected="selected">Izquierda</option>
                    <option value="centro">Centro</option>
                    <option value="derec">Derecha</option>
                </select>
                <br>

                <input type="submit" value="crear interior">
            </form>    
        </div>

    </body>
</html>
