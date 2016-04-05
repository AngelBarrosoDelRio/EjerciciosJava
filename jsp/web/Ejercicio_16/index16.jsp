<%-- 
    Document   : index16
    Created on : Jan 28, 2016, 11:29:03 PM
    Author     : angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background:#fcf6ee url(texturaverde.jpg) ; 
            }
        </style>
    </head>
    <body>
        <div>
            <h1>Esta aplicación muestra la tirada aleatoria de tres dados de póker.</h1>
        <p>
            <%
                String[] cara = {"as.png", "j.png", "q.png", "k.png", "siete.png", "ocho.png"};

                for (int i = 0; i < 3; i++) {
                    out.print("<img src=\"" + cara[(int) (Math.random() * 6)] + "\">");
                }
            %>
        </p>
        </div>
        
    </body>
</html>
