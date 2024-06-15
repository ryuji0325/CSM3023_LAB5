package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerTraining_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            label {\n");
      out.write("                width: 150px;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Register IT Training</h1>\n");
      out.write("        <h1>Insurance Quotation</h1>\n");
      out.write("        <form action=\"processTraining.jsp\" method=\"post\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Training Registration</legend>\n");
      out.write("                <label for=\"icNo\">ICNo*</label>\n");
      out.write("                <input type=\"text\" id=\"icNo\" name=\"ic\" size=\"15\" placeholder=\"E.g 821201-05-3478\"><br>\n");
      out.write("                <label for=\"name\">Name</label>\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"Name\" placeholder=\"Enter your name\"><br>\n");
      out.write("                <label for=\"trainType\">Type of Training</label>\n");
      out.write("                <select name=\"type\" id=\"trainType\">\n");
      out.write("                    <option value=\"1\">C++ training</option>\n");
      out.write("                    <option value=\"2\">Java</option>\n");
      out.write("                    <option value=\"3\">HTML5</option>\n");
      out.write("                    <option value=\"4\">Java EEE</option>\n");
      out.write("                    <option value=\"5\">Android Programming</option>\n");
      out.write("                </select><br>\n");
      out.write("                <label for=\"noPax\">No of Pax</label>\n");
      out.write("                <input type=\"text\" id=\"noPax\" name=\"noPax\" placeholder=\"No of pax\"><br>\n");
      out.write("\n");
      out.write("                <label for=\"studentYes\">Student</label>\n");
      out.write("                <input type=\"radio\" id=\"studentYes\" name=\"student\" value=\"1\">\n");
      out.write("                <label for=\"studentYes\">Yes</label>\n");
      out.write("                <input type=\"radio\" id=\"studentNo\" name=\"student\" value=\"2\">\n");
      out.write("                <label for=\"studentNo\">No</label><br>\n");
      out.write("                <input type=\"submit\" value=\"Submit\"><!-- comment -->\n");
      out.write("                <input type=\"reset\" value=\"Cancel\">\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        <footer><p>&#169 2016-Mohamad Nor;</p></footer>\n");
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
