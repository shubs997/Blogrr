package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blogheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t\t<!-- Meta -->\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"keywords\" content=\"SITE KEYWORDS HERE\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\n");
      out.write("\t\t<meta name='copyright' content=''>\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t\t<!-- Title -->\n");
      out.write("\t\t<title>Blogerr! | Feed</title>\n");
      out.write("\t\t<!-- Favicon -->\n");
      out.write("\t\t<link rel=\"icon\" type=\"image/png\" href=\"images/favicon.png\">\n");
      out.write("\t\t<!-- Web Font -->\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900\" rel=\"stylesheet\">\n");
      out.write("                <link href=\"https://fonts.googleapis.com/css?family=Allura&display=swap\" rel=\"stylesheet\">\n");
      out.write("\t\t<!-- Bootstrap CSS -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t\t<!-- Font Awesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t\t<!-- Slick Nav CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Learedu Stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/color/color1.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

  
  	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");//http 1.1 
  	response.setHeader("pragma","no-cache"); //http 1.0
  	response.setHeader("Expires","0"); //proxy server
  
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
        
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("                \n");
      out.write("\t\t<header class=\"header\">\n");
      out.write("\t\t\t<!-- Topbar -->\n");
      out.write("\t\t\t<div class=\"topbar\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-8 col-12\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Contact -->\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"#body\"><h1 id=\"logo\"><p>Blogerr</p></h1></a>\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"mailto:info@yourdomain.com\"><i class=\"fa fa-envelope-o\"></i>contact@yourdomain.com</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-clock-o\"></i>Opening: 10:00am - 5:00pm</li>-->\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t<!-- End Contact -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-12\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Social -->\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"social\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus \"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-behance\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t<!-- End Social -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- End Topbar -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- Header Menu -->\n");
      out.write("\t\t\t<div class=\"header-menu\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"navbar-collapse\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- Main Menu -->\n");
      out.write("                                                                        <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                                                                          <li><a href=\"#contact\">Blog Feed</a></li>\n");
      out.write("                                                                        </ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul id=\"nav\" class=\"nav menu navbar-nav pull-right\">\n");
      out.write("                                                                                \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"blogs.html\"><i class=\"fa fa-cog\" aria-hidden=\"true\"></i>   &nbsp; &nbsp;Edit Profile</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"blogs-left-sidebar.html\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i>   &nbsp; &nbsp;Following</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"blogs-right-sidebar.html\"><i class=\"fa fa-heart\" aria-hidden=\"true\"></i>   &nbsp; &nbsp;Likes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"logoutServlet\"><i class=\"fa fa-power-off\" aria-hidden=\"true\"></i>   &nbsp; &nbsp;Log out</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"addblog.jsp\">Add a Blog</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- End Main Menu -->\n");
      out.write("\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--/ End Header Menu -->\n");
      out.write("\t\t</header>\n");
      out.write("\t\t<!-- End Header -->\n");
      out.write("\t\t\n");
      out.write("\n");
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
