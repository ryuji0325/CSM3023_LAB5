package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class processTraining_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Training Registration Acknowledgement</h1>\n");
      out.write("\n");
      out.write("        ");

            //retrieve the parameters from the form
            String icNo = request.getParameter("ic");
            String name = request.getParameter("name");
            double type = Double.parseDouble(request.getParameter("type"));
            double pax = Double.parseDouble(request.getParameter("noPax"));
            int student = Integer.parseInt(request.getParameter("student"));

            double fee = 0;
            double amount;
            double discount = 0.1;

            if (student == 1) {
                if (type == 1) {
                    fee = discount * 3000;
                } else if (type == 2) {
                    fee = discount * 3000;
                } else if (type == 3) {
                    fee = discount * 2800;
                } else if (type == 4) {
                    fee = discount * 5500;
                } else if (type == 5) {
                    fee = discount * 3200;
                }
            } else {
                if (type == 1) {
                    fee = 3000;
                } else if (type == 2) {
                    fee = 3000;
                } else if (type == 3) {
                    fee = 2800;
                } else if (type == 4) {
                    fee = 5500;
                } else if (type == 5) {
                    fee = 3200;
                }
            }

            amount = pax * fee;
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        // Output the results
        out.println("<p>IC No: " + icNo + "</p>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Type of Training: " + type + "</p>");
        out.println("<p>Number of Pax: " + pax + "person/s</p>");
        out.println("<p>Student: " + (student == 1 ? "Yes" : "No") + "</p>");
        out.println("<p>Amount Due :Rm" + String.format("%.2f", amount) + "</p>");
        
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
