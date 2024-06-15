package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import lab5.com.businnessLogic;

public final class processBusinessLogic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Rahim Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Rahim Share Details</h1>\n");
      out.write("        ");

            businnessLogic rbl=new businnessLogic(Double.parseDouble(request.getParameter("share")),Double.parseDouble(request.getParameter("price")));
            
                    
      out.write("\n");
      out.write("                    <p>Total Shares of Stock : RM");
      out.print(rbl.getShare());
      out.write("</p>\n");
      out.write("                    <p>Price per Share : RM");
      out.print(rbl.getPrice());
      out.write("</p>\n");
      out.write("                    <p>Amount Paid (No commission) :  RM");
      out.print(rbl.getAmountpaid());
      out.write("</p>\n");
      out.write("                    <p>Amount Commision (Only) :  RM");
      out.print(rbl.getCommision());
      out.write("</p>\n");
      out.write("                    <p>Total Amount Paid (Amount paid + commission) :  RM");
      out.print(rbl.getTotal());
      out.write("</p>\n");
      out.write("                    \n");
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
