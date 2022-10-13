package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            #nav {\n");
      out.write("\tmargin: 27px auto 0;\n");
      out.write("\n");
      out.write("\tposition: relative;\n");
      out.write("\twidth: 590px;\n");
      out.write("\theight: 50px;\n");
      out.write("\tbackground-color: #34495e;\n");
      out.write("\tborder-radius: 8px;\n");
      out.write("\tfont-size: 0;\n");
      out.write("}\n");
      out.write("nav a {\n");
      out.write("\tline-height: 50px;\n");
      out.write("\theight: 100%;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tposition: relative;\n");
      out.write("\tz-index: 1;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tcolor: white;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("nav .animation {\n");
      out.write("\tposition: absolute;\n");
      out.write("\theight: 100%;\n");
      out.write("\ttop: 0;\n");
      out.write("\tz-index: 0;\n");
      out.write("\ttransition: all .5s ease 0s;\n");
      out.write("\tborder-radius: 8px;\n");
      out.write("}\n");
      out.write("a:nth-child(1) {\n");
      out.write("\twidth: 100px;\n");
      out.write("}\n");
      out.write("a:nth-child(2) {\n");
      out.write("\twidth: 110px;\n");
      out.write("}\n");
      out.write("a:nth-child(3) {\n");
      out.write("\twidth: 100px;\n");
      out.write("}\n");
      out.write("a:nth-child(4) {\n");
      out.write("\twidth: 160px;\n");
      out.write("}\n");
      out.write("a:nth-child(5) {\n");
      out.write("\twidth: 120px;\n");
      out.write("}\n");
      out.write("nav .start-home, a:nth-child(1):hover~.animation {\n");
      out.write("\twidth: 100px;\n");
      out.write("\tleft: 0;\n");
      out.write("\tbackground-color: #1abc9c;\n");
      out.write("}\n");
      out.write("nav .start-about, a:nth-child(2):hover~.animation {\n");
      out.write("\twidth: 110px;\n");
      out.write("\tleft: 100px;\n");
      out.write("\tbackground-color: #e74c3c;\n");
      out.write("}\n");
      out.write("nav .start-blog, a:nth-child(3):hover~.animation {\n");
      out.write("\twidth: 100px;\n");
      out.write("\tleft: 210px;\n");
      out.write("\tbackground-color: #3498db;\n");
      out.write("}\n");
      out.write("nav .start-portefolio, a:nth-child(4):hover~.animation {\n");
      out.write("\twidth: 160px;\n");
      out.write("\tleft: 310px;\n");
      out.write("\tbackground-color: #9b59b6;\n");
      out.write("}\n");
      out.write("nav .start-contact, a:nth-child(5):hover~.animation {\n");
      out.write("\twidth: 120px;\n");
      out.write("\tleft: 470px;\n");
      out.write("\tbackground-color: #e67e22;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("\tbackground: #2c3e50;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body\n");
      out.write("        <nav>\n");
      out.write("\t<a href=\"#\">Home</a>\n");
      out.write("\t<a href=\"#\">About</a>\n");
      out.write("\t<a href=\"#\">Blog</a>\n");
      out.write("\t<a href=\"#\">Portefolio</a>\n");
      out.write("\t<a href=\"#\">Contact</a>\n");
      out.write("\t<div class=\"animation start-home\"></div>\n");
      out.write("        </nav>\n");
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
