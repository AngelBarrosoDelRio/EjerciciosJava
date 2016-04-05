package org.apache.jsp.Ejercicio_005f10;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index10_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Bienvenidos al cuestionario de conocimientos sobre el desarrollo de aplicaciones web</h1>\n");
      out.write("        <form action=\"cuestionario.jsp\" method=\"get\">\n");
      out.write("            ¿Qué es JAVA?<br>\n");
      out.write("            <input type=\"radio\" name=\"pregunta1\" value=\"a\" checked> Lenguaje de programacion<br>\n");
      out.write("            <input type=\"radio\" name=\"pregunta1\" value=\"b\"> Lenguaje de marca<br>\n");
      out.write("            <input type=\"radio\" name=\"pregunta1\" value=\"c\"> otra<br>\n");
      out.write("            ¿Que es NETBEANS?<br>\n");
      out.write("            <input type=\"radio\" name=\"pregunta2\" value=\"a\" checked> Un IDE <br>\n");
      out.write("            <input type=\"radio\" name=\"pregunta2\" value=\"b\"> Una marca de procesador<br>\n");
      out.write("            <input type=\"radio\" name=\"pregunta2\" value=\"c\"> Un lenguaje de marca<br>\n");
      out.write("            ¿Donde se almacenan las cookie?<br>\n");
      out.write("            <input type=\"radio\" name=\"pregunta3\" value=\"a\" checked> EN la memoria RAM<br>\n");
      out.write("            <input type=\"radio\" name=\"pregunta3\" value=\"b\"> En nuestro disco duro<br>\n");
      out.write("            <input type=\"radio\" name=\"pregunta3\" value=\"c\"> En un servidor ajeno a nosotros\n");
      out.write("            <input type=\"submit\" value=\"enviar respuestas\">\n");
      out.write("        </form>\n");
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
