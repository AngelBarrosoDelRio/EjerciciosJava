package org.apache.jsp.blablacompy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>ACCESO</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">       \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssprincipal.css\" />\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"conjunto\">\n");
      out.write("            <div class=\"titulo\">\n");
      out.write("                <h2>Introduzca sus datos de acceso</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cajainiciosesion\">\n");
      out.write("\n");
      out.write("            ");

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/blablacompy","root", "root");
            Statement s = conexion.createStatement();



            
      out.write("\n");
      out.write("            <div class=\"minititulo\">\n");
      out.write("                <h4>Indique su nombre y contraseña</h4>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <form method=\"get\" >\n");
      out.write("                Nombre: <input class=\"cajita\" type=\"text\" name=\"nombreUsuario\" /><br>\n");
      out.write("                Contraseña: <input type=\"password\" name=\"password\" /><br>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">entrar</button>\n");
      out.write("            </form>\n");
      out.write("            ");

            int acceso=1;
            ResultSet existe = s.executeQuery ("SELECT nombre_acceso,password FROM usuario ");
            while (existe.next()) {
                    if(existe.getString("nombre_acceso").equals(request.getParameter("nombreUsuario"))&&
                        existe.getString("password").equals(request.getParameter("password"))){
                        String nombre=request.getParameter("nombreUsuario");
                        
      out.write("<script>document.location = \"principal.jsp?nombreUsuario=");
      out.print(nombre);
      out.write("\"</script>");

                        acceso--;
                    }
            }
            if(acceso==1){
               out.print("Nombre usuario o contraseña incorrectos");
            }

            
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("                \n");
      out.write("            <div class=\"registro\">\n");
      out.write("            <h4>Registrarme</h4>\n");
      out.write("            \n");
      out.write("            <form method=\"get\" action=\"altanueva.jsp\">\n");
      out.write("                \n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Registrarme</button>\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
