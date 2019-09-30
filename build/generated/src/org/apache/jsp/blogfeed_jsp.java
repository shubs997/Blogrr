package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blogfeed_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/blogheader.jsp");
    _jspx_dependants.add("/blogfooter.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html");
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
      out.write("                ");
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
      out.write("\t\t\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"blogheader.jsp\"><h1 id=\"logo\"><p>Blogerr</p></h1></a>\n");
      out.write("<!--\t\t\t\t\t\t\t\t<li><a href=\"mailto:info@yourdomain.com\"><i class=\"fa fa-envelope-o\"></i>contact@yourdomain.com</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-clock-o\"></i>Opening: 10:00am - 5:00pm</li>-->\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t<!-- End Contact -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-12\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Social -->\n");
      out.write("\n");
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
      out.write("                                                                          <li><a href=\"#contact\">your Blog Feed</a></li>\n");
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
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Blogs -->\n");
      out.write("\t\t<section class=\"blog b-archives section\">\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-9 col-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("<!--\t\t\t\t\t\t\t<div class=\"col-lg-4 col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t Single Blog \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-blog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-head overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"date\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>20<span>Mar</span></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/blog/blog2.jpg\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"blog-title\"><a href=\"blog-single.html\">Our teachers egestas erat dignissim</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"blog-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-user\"></i>By: Admin</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-list\"></i>Academic</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-heart-o\"></i>33K</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn\">Read More<i class=\"fa fa-angle-double-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t End Single Blog \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-4 col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t Single Blog \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-blog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-head overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"date\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>10<span>Mar</span></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/blog/blog3.jpg\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"blog-title\"><a href=\"blog-single.html\">We are Proffesional Have velit Landon</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"blog-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-user\"></i>By: Admin</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-list\"></i>Knowledge</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-heart-o\"></i>11K</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn\">Read More<i class=\"fa fa-angle-double-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t End Single Blog \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-4 col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t Single Blog \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-blog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-head overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"date\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>15<span>Feb</span></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/blog/blog4.jpg\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"blog-title\"><a href=\"blog-single.html\">Our Student Have sit amet egestas</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"blog-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-user\"></i>By: Admin</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-list\"></i>Learning</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-heart-o\"></i>53K</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn\">Read More<i class=\"fa fa-angle-double-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t End Single Blog \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-4 col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t Single Blog \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-blog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-head overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"date\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>01<span>Feb</span></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/blog/blog5.jpg\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"blog-title\"><a href=\"blog-single.html\">Our teachers egestas erat dignissim</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"blog-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-user\"></i>By: Admin</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-list\"></i>Academic</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-heart-o\"></i>33K</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn\">Read More<i class=\"fa fa-angle-double-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t End Single Blog \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-4 col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t Single Blog \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-blog\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-head overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"date\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>02<span>Jan</span></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/blog/blog6.jpg\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"blog-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"blog-title\"><a href=\"blog-single.html\">We are Proffesional Have velit Landon</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"blog-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-user\"></i>By: Admin</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-list\"></i>Knowledge</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-heart-o\"></i>11K</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn\">Read More<i class=\"fa fa-angle-double-right\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t End Single Blog \n");
      out.write("\t\t\t\t\t\t\t</div>-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Start Pagination -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pagination-main\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"pagination\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"prev\"><a href=\"#\"><i class=\"fa fa-angle-double-left\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#\">1</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"next\"><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<!--/ End Pagination -->\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"learnedu-sidebar\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"email\" placeholder=\"Search ...\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"button\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-widget tags\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Recent <span>Tags</span></h3>\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Course</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">University</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Scholarship</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Free</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Standard</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Standard</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!-- Categories -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-widget categories\">\n");
      out.write("                                <h3 class=\"title\">Categories</h3>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>Education Tips<span>16</span></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>General Knowledge<span>30</span></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>Tips for success<span>80</span></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>Student Life<span>23</span></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>Courses<span>28</span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t\t\t<!--/ End Categories -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t<!--/ End Blogs -->\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t<footer class=\"footer overlay section\">\n");
      out.write("\t\t\t<!-- Footer -->\n");
      out.write("\t\t\t<div class=\"footer-top\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 col-md-6 col-12\">\n");
      out.write("\t\t\t\t\t\t\t<!-- About -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-widget about\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-phone\"></i>Phone: +123 456-7890 </li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-envelope\"></i>Email: <a href=\"mailto:info@youremail.com\">Info@youremail.com</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-map-o\"></i>Address: 211 Ronad, California, Us</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!--/ End About -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-6 col-12\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Useful Links -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-widget useful-links\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Useful Links</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>Courses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>Events</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>Blogs</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-angle-right\"></i>Contact</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!--/ End Useful Links -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-6 col-12\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Latest News -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-widget latest-news\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Latest Posts</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"news-inner\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single-news\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/blog/blog1.jpg\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4><a href=\"blog-single.html\">Our Teacher the best Link to Savc</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Nunc purus orci, blandit condimentum rhoncus vels</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single-news\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/blog/blog2.jpg\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4><a href=\"blog-single.html\">Student Have the best Link to Ronae</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Nunc purus orci, blandit condimentum rhoncus vels</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single-news\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/blog/blog3.jpg\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4><a href=\"blog-single.html\">Sekker the best Link to build</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Nunc purus orci, blandit condimentum rhoncus vele</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!--/ End Latest News -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-3 col-md-6 col-12\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Newsletter -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"single-widget newsletter\">\n");
      out.write("\t\t\t\t\t\t\t\t<h2>Subscribe Newsletter</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mail\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Don't miss to  subscribe to our news feed, Get the latest updates from us!</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" placeholder=\"Enter your email\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"button\" type=\"submit\"><i class=\"fa fa-envelope\"></i></button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!--/ End Newsletter -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--/ End Footer -->\n");
      out.write("\n");
      out.write("\t\t</footer>\n");
      out.write("\t\t<!--/ End Footer -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Jquery JS-->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-migrate.min.js\"></script>\n");
      out.write("\t\t<!-- Popper JS-->\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("\t\t<!-- Bootstrap JS-->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<!-- Colors JS-->\n");
      out.write("        <script src=\"js/colors.js\"></script>\n");
      out.write("\t\t<!-- Jquery Steller JS -->\n");
      out.write("\t\t<script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("\t\t<!-- Particle JS -->\n");
      out.write("\t\t<script src=\"js/particles.min.js\"></script>\n");
      out.write("\t\t<!-- Fancy Box JS-->\n");
      out.write("\t\t<script src=\"js/facnybox.min.js\"></script>\n");
      out.write("\t\t<!-- Magnific Popup JS-->\n");
      out.write("\t\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\t\t<!-- Masonry JS-->\n");
      out.write("\t\t<script src=\"js/masonry.pkgd.min.js\"></script>\n");
      out.write("\t\t<!-- Circle Progress JS -->\n");
      out.write("\t\t<script src=\"js/circle-progress.min.js\"></script>\n");
      out.write("\t\t<!-- Owl Carousel JS-->\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t\t<!-- Waypoints JS-->\n");
      out.write("        <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("\t\t<!-- Slick Nav JS-->\n");
      out.write("        <script src=\"js/slicknav.min.js\"></script>\n");
      out.write("\t\t<!-- Counter Up JS -->\n");
      out.write("\t\t<script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("\t\t<!-- Easing JS-->\n");
      out.write("        <script src=\"js/easing.min.js\"></script>\n");
      out.write("\t\t<!-- Wow Min JS-->\n");
      out.write("\t\t<script src=\"js/wow.min.js\"></script>\n");
      out.write("\t\t<!-- Scroll Up JS-->\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("\t\t<!-- Google Maps JS -->\n");
      out.write("\t\t<script src=\"http://maps.google.com/maps/api/js?key=AIzaSyC0RqLa90WDfoJedoE3Z_Gy7a7o8PCL2jw\"></script>\n");
      out.write("        <script src=\"js/gmaps.min.js\"></script>\n");
      out.write("\t\t<!-- Main JS-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t    $('[data-toggle=\"popover\"]').popover();   \n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("<!-- Mirrored from themelamp.com/html/learnedu/blogs-right-sidebar.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 25 Aug 2019 08:00:59 GMT -->\n");
      out.write("</html>");
      out.write("\t\n");
      out.write("                  \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("s");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bloglist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                <div class=\"col-lg-4 col-12\">\n");
          out.write("                                                                        <!-- Single Blog -->\n");
          out.write("                                                                        <div class=\"single-blog\">\n");
          out.write("                                                                                <div class=\"blog-head overlay\">\n");
          out.write("                                                                                        <div class=\"date\">\n");
          out.write("                                                                                                <h4>05<span>May</span></h4>\n");
          out.write("                                                                                        </div>\n");
          out.write("                                                                                        <img src=\"images/blog/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.files}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\n");
          out.write("                                                                                </div>\n");
          out.write("                                                                                <div class=\"blog-content\">\n");
          out.write("                                                                                        <h4 class=\"blog-title\"><a href=\"blog-single.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                                                                        <div class=\"blog-info\">\n");
          out.write("                                                                                                <a href=\"#\"><i class=\"fa fa-user\"></i>By: Admin</a>\n");
          out.write("                                                                                                <a href=\"#\"><i class=\"fa fa-list\"></i>Learning</a>\n");
          out.write("                                                                                                <a href=\"#\"><i class=\"fa fa-heart-o\"></i>53K</a>\n");
          out.write("                                                                                        </div>\n");
          out.write("                                                                                        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.desc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                                                        <div class=\"button\">\n");
          out.write("                                                                                                <a href=\"#\" class=\"btn\">Read More<i class=\"fa fa-angle-double-right\"></i></a>\n");
          out.write("                                                                                        </div>\n");
          out.write("                                                                                </div>\n");
          out.write("                                                                        </div>\n");
          out.write("                                                                        <!-- End Single Blog -->\n");
          out.write("                                                                </div>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
