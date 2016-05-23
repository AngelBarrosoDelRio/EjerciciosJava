<%-- 
    Document   : altanueva
    Created on : May 22, 2016, 4:14:29 AM
    Author     : angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="cssprincipal.css" />
    </head>
    <body>
        <div class="contenedor">
            <div class="tituloviajes">
                <h1>Datos nuevo usuario</h1>
            </div>
            <div class="contenido">
                <form method="get" action="guardardatospersonalesNuevos.jsp">

                   *  Nombre completo: <input type="text" name="nombrecompleto" /> ejem:Fernandez Garcia, Jose</br>
                   *  Numero telefono: <input type="number" name="telefono" /> ejem: 666454545</br>
                   *  Numero DNI user: <input type="text" name="dni" /> ejem: 75442114f</br>
                   *  Nombre usuario : <input type="text" name="nombreacceso" /></br>
                   *  contraseña user: <input type="password" name="contrasena" /></br>
                   <input type="hidden" name="codusuario"/></br>
                    <button type="submit" class="btn btn-primary">Darme de alta</button>
                </form>
            </div>
        </div>
    </body>
</html>
