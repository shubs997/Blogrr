<%-- 
    Document   : blogheader
    Created on : Sep 30, 2019, 5:26:29 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
		<!-- Meta -->
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="keywords" content="SITE KEYWORDS HERE" />
		<meta name="description" content="">
		<meta name='copyright' content=''>
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Title -->
		<title>Blogerr! | Feed</title>
		<!-- Favicon -->
		<link rel="icon" type="image/png" href="images/favicon.png">
		<!-- Web Font -->
		<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900" rel="stylesheet">
                <link href="https://fonts.googleapis.com/css?family=Allura&display=swap" rel="stylesheet">
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<!-- Font Awesome CSS -->
        <link rel="stylesheet" href="css/font-awesome.min.css">
		<!-- Slick Nav CSS -->
        <link rel="stylesheet" href="css/slicknav.min.css">
		
		<!-- Learedu Stylesheet -->
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/responsive.css">
		<link rel="stylesheet" href="css/color/color1.css">

    </head>


    <body>
        <%
  
  	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");//http 1.1 
  	response.setHeader("pragma","no-cache"); //http 1.0
  	response.setHeader("Expires","0"); //proxy server
  
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
        %>
		<!-- Header -->
                
		<header class="header">
			<!-- Topbar -->
			<div class="topbar">
				<div class="container">
					<div class="row">
						<div class="col-lg-8 col-12">
							<!-- Contact -->
							<ul class="content">
								<a class="navbar-brand" href="blogheader.jsp"><h1 id="logo"><p>Blogerr</p></h1></a>
<!--								<li><a href="mailto:info@yourdomain.com"><i class="fa fa-envelope-o"></i>contact@yourdomain.com</a></li>
								<li><i class="fa fa-clock-o"></i>Opening: 10:00am - 5:00pm</li>-->
							</ul>
							<!-- End Contact -->
						</div>
						<div class="col-lg-4 col-12">
							<!-- Social -->

							<!-- End Social -->
						</div>
					</div>
				</div>
			</div>
			<!-- End Topbar -->

			<!-- Header Menu -->
			<div class="header-menu">
				<div class="container">
					<div class="row">
						<div class="col-12">
							<nav class="navbar navbar-default">
								<div class="navbar-collapse">
									<!-- Main Menu -->
                                                                        <ul class="nav navbar-nav navbar-left">
                                                                          <li><a href="#contact">your Blog Feed</a></li>
                                                                        </ul>
									<ul id="nav" class="nav menu navbar-nav pull-right">
                                                                                
										<li><a href="#">${username}<i class="fa fa-angle-down"></i></a>
											<ul class="dropdown">
												<li><a href="blogs.html"><i class="fa fa-cog" aria-hidden="true"></i>   &nbsp; &nbsp;Edit Profile</a></li>
												<li><a href="blogs-left-sidebar.html"><i class="fa fa-users" aria-hidden="true"></i>   &nbsp; &nbsp;Following</a></li>
												<li><a href="blogs-right-sidebar.html"><i class="fa fa-heart" aria-hidden="true"></i>   &nbsp; &nbsp;Likes</a></li>
												<li><a href="logoutServlet"><i class="fa fa-power-off" aria-hidden="true"></i>   &nbsp; &nbsp;Log out</a></li>
											</ul>
										</li>
										<li><a href="addblog.jsp">Add a Blog</a></li>
									</ul>
									<!-- End Main Menu -->
								</div> 
							</nav>
						</div>
					</div>
				</div>
			</div>
			<!--/ End Header Menu -->
		</header>
		<!-- End Header -->
		

