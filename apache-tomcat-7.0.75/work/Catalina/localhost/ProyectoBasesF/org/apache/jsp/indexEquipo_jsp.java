/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.75
 * Generated at: 2017-11-22 18:36:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexEquipo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html5>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Equipos</title>\r\n");
      out.write("<link href=\"styleEquipo.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t<h1><a href=\"#\">BallonBases</a></h1>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"search\">\r\n");
      out.write("\t\t\t<form method=\"get\" action=\"\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" id=\"search-submit\" value=\"GO\" />\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end #header -->\r\n");
      out.write("\t<div id=\"menu\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"index.jsp\">Inicio</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"indexTorneo.jsp\">Torneos</a></li>\r\n");
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"#\">Equipos</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">Jugadores</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end #menu -->\r\n");
      out.write("\t<div id=\"page\">\r\n");
      out.write("\t\t<div id=\"page-bgtop\">\r\n");
      out.write("\t\t\t<div id=\"page-bgbtm\">\r\n");
      out.write("\t\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title\"><a href=\"#\">Creador de equipos</a></h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"entry\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<p>En esta pestaña podrás observar a los equipos participantes en todos los torneos registrados, además tendrás la oportunidad de observar a los mejores equipos teniendo en cuenta los partidos ganados y menor cantidad de faltas. Tambien podrás crear un equipo, al cual posteriormente podrás agregar los jugadores correspondientes.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\tDisfruta, juega y crece...</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title\"><a href=\"#\"> Crear un equipo nuevo </a></h2>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"entry\">\r\n");
      out.write("\t\t\t\t\t\t<p><class=\"alignleft border\" />             \r\n");
      out.write("\t\t\t\t\t\t\t<form action=Hola>\r\n");
      out.write(" \t\t\t\t\t\tNombre del equipo:<br>\r\n");
      out.write("  \t\t\t\t\t\t<input type=\"text\" id=\"enombre\" name=\"equiponombre\" placeholder=\"Ingresar nombre equipo\">\r\n");
      out.write("  \t\t\t\t\t\t<br><br>\r\n");
      out.write("  \t\t\t\t\t\tEntrenador:<br>\r\n");
      out.write("  \t\t\t\t\t\t<input type=\"text\" id=\"ennombre\" name=\"entrenadornombre\" placeholder=\"Ingrese nombre entrenador\">\r\n");
      out.write("  \t\t\t\t\t\t<br><br>\r\n");
      out.write("  \t\t\t\t\t\tColor:<br>\r\n");
      out.write("  \t\t\t\t\t\t<input type=\"text\" id=\"cequipo\" name=\"colorequipo\" placeholder=\"Ingrese color representa. Ejem: Rojo\">\r\n");
      out.write("  \t\t\t\t\t\t<br><br>\r\n");
      out.write("  \t\t\t\t\t\tTorneo:<br>\r\n");
      out.write("  \t\t\t\t\t\t<select name=\"Torneo\">\r\n");
      out.write("    \t\t\t\t\t\t<option value=\"volvo\">Sudamericano</option>\r\n");
      out.write("   \t\t\t\t\t\t\t<option value=\"saab\">Copa Promaster</option>\r\n");
      out.write("    \t\t\t\t\t\t<option value=\"fiat\">Liga BBA</option>\r\n");
      out.write("    \t\t\t\t\t\t<option value=\"audi\">Liga Warrior</option>\r\n");
      out.write("  \t\t\t\t\t\t</select><br><br>\r\n");
      out.write("  \t\t\t\t\t\t<button class=\"button\">Crear equipo</button>\r\n");
      out.write("  \t\t\t\t\t\t</form> \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title\"><a href=\"#\">Equipos inscritos</a></h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"entry\">\r\n");
      out.write("\t\t\t\t\t\t\t<p><class=\" alignleft border\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<table style=\"width:170%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>Nombre Equipo</th>\r\n");
      out.write("    <th>Nombre Entrenador</th> \r\n");
      out.write("    <th>Color</th>\r\n");
      out.write("    <th>Torneo</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Lakers</td>\r\n");
      out.write("    <td>John Smith</td>\r\n");
      out.write("    <td>Verde</td>\r\n");
      out.write("    <td>Liga BBA</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Wolfes</td>\r\n");
      out.write("    <td>Jackson Marinez</td>\r\n");
      out.write("    <td>Rojo</td>\r\n");
      out.write("    <td>Liga BBA</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>Real Bañil</td>\r\n");
      out.write("    <td>Doe Miths</td>\r\n");
      out.write("    <td>Azul</td>\r\n");
      out.write("    <td>Liga Warrior</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table> </p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"clear: both;\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- end #content -->\r\n");
      out.write("\t\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"title\">Mejores equipos</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>Equipo #1</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>Equipo #2</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>Equipo #3</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>Equipo #4</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>Equipo #5</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- end #sidebar -->\r\n");
      out.write("\t\t\t\t<div style=\"clear: both;\">&nbsp;</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end #page -->\r\n");
      out.write("</div>\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("<!-- end #footer -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}