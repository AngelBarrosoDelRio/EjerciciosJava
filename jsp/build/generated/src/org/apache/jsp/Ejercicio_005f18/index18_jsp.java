package org.apache.jsp.Ejercicio_005f18;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index18_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Bienvenido al juego del trilero</h2>\n");
      out.write("        <h4>Debera elegir una de las tres posiciones posibles (izquierda,centro o derecha)<br>\n");
      out.write("            segun piense este situada la bolita.</h4>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");
 for (int i = 0; i < 3; i++) {
      out.write("\n");
      out.write("            <img src=\"cubilete_tapando_bolas.png\" style=\"width: 150px;height: 250px;\">\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div>\n");
      out.write("            <form action=\"levataCubiletes.jsp\" method=\"get\">\n");
      out.write("                ¿Elija una posible situacion de la bola?:\n");
      out.write("                <select name=\"trilero\">\n");
      out.write("                    <option value=\"izqu\" selected=\"selected\">Izquierda</option>\n");
      out.write("                    <option value=\"centro\">Centro</option>\n");
      out.write("                    <option value=\"derec\">Derecha</option>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"crear interior\">\n");
      out.write("            </form>    \n");
      out.write("        </div>\n");
      out.write("\n");
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
