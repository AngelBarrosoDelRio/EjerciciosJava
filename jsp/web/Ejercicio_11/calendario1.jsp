<%-- 
    Document   : calendario1
    Created on : Jan 27, 2016, 12:20:18 PM
    Author     : angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{
                border: solid 2px black;
            }
            tr{
                border: solid 2px black; 
            }
            td{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>

        <%

            String mes = request.getParameter("nombreMes");
            String tituloCalendar = request.getParameter("textoCalen");
            String diaSemana = request.getParameter("dia1");
            int año = Integer.valueOf(request.getParameter("año"));
            int diasMes = Integer.valueOf(request.getParameter("numeroDiasMes"));

            int a, i;

            int dia = 1;
            int mesComienza = 0;
            int ceros = -1;

            if (diaSemana.equals("lunes")) {
                mesComienza = 1;
            } else if (diaSemana.equals("martes")) {
                mesComienza = 2;
            } else if (diaSemana.equals("miercoles")) {
                mesComienza = 3;
            } else if (diaSemana.equals("jueves")) {
                mesComienza = 4;
            } else if (diaSemana.equals("viernes")) {
                mesComienza = 5;
            } else if (diaSemana.equals("sabado")) {
                mesComienza = 6;
            } else if (diaSemana.equals("domingo")) {
                mesComienza = 7;
            }
        %>
        <h1><%out.print(tituloCalendar);%>&nbsp;<%out.print(año);%></h1>
        <h3><%out.print(mes);%></h3>
        <table>
            <tr><td>lunes</td><td>martes</td><td>miércoles</td><td>jueves</td><td>viernes</td><td>sábado</td><td>domingo</td></tr>
            <tr>
                <%
                    for (i = 1; i <= 5; i++) {
                %>

            <tr>
                <%
                    ceros = mesComienza - 1;
                    for (a = 1; a <= 7; a++) {

                        if ((i == 1) && (ceros >= 0)) {

                            while (ceros > 0) {
                %><td></td><%
                            ceros--;
                            a++;
                        }

                    }

                    if ((dia <= diasMes) && (ceros <= mesComienza - 1)) {
                %><td><% out.print(dia);%></td><%

                            dia++;
                        } else {

                        }
                    }

                %>
            </tr>
            <%                }// cierre for genral %>
            
        </table>
    </body>
</html>
