<%-- 
    Document   : index10
    Created on : Jan 27, 2016, 11:48:23 AM
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
        <h1>Bienvenidos al cuestionario de conocimientos sobre el desarrollo de aplicaciones web</h1>
        <form action="cuestionario.jsp" method="get">
            ¿Qué es JAVA?<br>
            <input type="radio" name="pregunta1" value="a" checked> Lenguaje de programacion<br>
            <input type="radio" name="pregunta1" value="b"> Lenguaje de marca<br>
            <input type="radio" name="pregunta1" value="c"> otra<br>
            ¿Que es NETBEANS?<br>
            <input type="radio" name="pregunta2" value="a" checked> Un IDE <br>
            <input type="radio" name="pregunta2" value="b"> Una marca de procesador<br>
            <input type="radio" name="pregunta2" value="c"> Un lenguaje de marca<br>
            ¿Donde se almacenan las cookie?<br>
            <input type="radio" name="pregunta3" value="a" checked> EN la memoria RAM<br>
            <input type="radio" name="pregunta3" value="b"> En nuestro disco duro<br>
            <input type="radio" name="pregunta3" value="c"> En un servidor ajeno a nosotros
            <input type="submit" value="enviar respuestas">
        </form>
    </body>
</html>
