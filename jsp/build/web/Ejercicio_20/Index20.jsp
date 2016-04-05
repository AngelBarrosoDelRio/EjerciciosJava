<%-- 
    Document   : Index20
    Created on : Jan 30, 2016, 2:04:48 AM
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
            .verde{
                text-align: center;
                border: solid 2px black;
                background-image: url(img/texturaverde.jpg);
                width: 70px;
                height: 70px;
            }
            .transparente{
                text-align: center;
                border: solid 2px black;
                background-image: url(img/transparente.png);
                width: 70px;
                height: 70px;
            }
        </style>
    </head>
    <body>
        <h1>Ajedrez</h1>
        <table>

            <%
                int posicionAlfilx;
                int posicionAlfili;
                int posicionCaballox;
                int posicionCaballoi;
                int i,x;
                
                // posicion alfil.
                posicionAlfilx = (int) (Math.random() * 8 + 1);
                posicionAlfili = (int) (Math.random() * 8 + 1);
                // posicion caballo
                do {
                    
                    posicionCaballox = (int) (Math.random() * 8 + 1);
                    posicionCaballoi = (int) (Math.random() * 8 + 1);
                    
                } while (posicionAlfili == posicionCaballoi && posicionAlfilx == posicionCaballox);
                
                ////pinta el tablero
                for (i = 1; i <= 8; i++) {
            %><tr><%
                for (x = 1; x <= 8; x++) {
                
                    if (x % 2 == 0 && i % 2 != 0) {
                        
                        %><td class="transparente"><%
                        if(x == posicionAlfilx && i==posicionAlfili){
                           %><img src="img/alfilblanco.png" style="width: 60px;height: 60px;"><% 
                        }else if(x == posicionCaballox && i==posicionCaballoi){
                           %><img src="img/caballonegro.png" style="width: 60px;height: 60px;"><% 
                        }
                    
                    } else if (x % 2 != 0 && i % 2 != 0) {
                        %><td class="verde"><%
                        if(x == posicionAlfilx && i==posicionAlfili){
                           %><img src="img/alfilblanco.png" style="width: 60px;height: 60px;"><% 
                        }else if(x == posicionCaballox && i==posicionCaballoi){
                           %><img src="img/caballonegro.png" style="width: 60px;height: 60px;"><% 
                        }
                    
                    } else if (x % 2 != 0 && i % 2 == 0) {
                        %><td class="transparente"><%
                        if(x == posicionAlfilx && i==posicionAlfili){
                           %><img src="img/alfilblanco.png" style="width: 60px;height: 60px;"><% 
                        }else if(x == posicionCaballox && i==posicionCaballoi){
                           %><img src="img/caballonegro.png" style="width: 60px;height: 60px;"><% 
                        }
                    
                    } else if (x % 2 == 0 && i % 2 == 0) {
                        %><td class="verde"><%
                        if(x == posicionAlfilx && i==posicionAlfili){
                           %><img src="img/alfilblanco.png" style="width: 60px;height: 60px;"><% 
                        }else if(x == posicionCaballox && i==posicionCaballoi){
                           %><img src="img/caballonegro.png" style="width: 60px;height: 60px;"><% 
                        }
                    
                    }
                    %></td><%
                }
                    %></tr><%
            }


                %>
        </table>
    </body>
</html>
