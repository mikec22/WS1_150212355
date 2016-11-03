package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>My Great First Web Page!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p> Here is my first attempt at making a web page!! <br/>\n");
      out.write("            My Student no is 150212355 <br/>\n");
      out.write("            My Name is Chan Tai Man<br/>\n");
      out.write("        </p>\n");
      out.write("        <!-- This is a comment. It is ignored by the browser-->\n");
      out.write("        <h1>Course</h1>\n");
      out.write("        <h2>CSA</h2>\n");
      out.write("        <h3>1A</h3>\n");
      out.write("        <h2>T&N</h2>\n");
      out.write("        <h3>1A</h3>\n");
      out.write("        <h3>1B</h3>\n");
      out.write("        <h3>1C</h3>\n");
      out.write("        <a href=\"http://www.vtc.edu.hk/\">This is a link to VTC home page!</a>\n");
      out.write("        <a href=\"mailto:150212355@stu.vtc.edu.hk\">Chan Xuan</a>\n");
      out.write("        <img src=\"img/chrome.gif\"/>\n");
      out.write("        <img src=\"img/ie.gif\"/>\n");
      out.write("        <b>Bold Text</b><br/>\n");
      out.write("        <b><u>Bold and Underlined</u></b><br/>\n");
      out.write("        <b><u><i>Bold, Underlined and Italic</i></u></b>\n");
      out.write("        \n");
      out.write("        <pre> <code>\n");
      out.write("            public static void main(String [] args){\n");
      out.write("                System.out.println(\"hello World\");\n");
      out.write("            }\n");
      out.write("        </code><pre/>\n");
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
