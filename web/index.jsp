<%-- 
    Document   : index
    Created on : Sep 30, 2019, 4:02:25 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

	<%@include file="header.jsp" %>	
		
		
        <!--
        Home Slider
        ==================================== -->
		
		<section id="slider">
			<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">		
				
				<!-- Wrapper for slides -->
				<div class="carousel-inner">
					<!-- single slide -->
					<div class="item active" style="background-image: url(img/banner.jpg);">
						<div class="carousel-caption">
							<h2 data-wow-duration="700ms" data-wow-delay="500ms" class="wow bounceInDown animated"><span>Blogerr</span>!</h2>
							<h3 data-wow-duration="1000ms" class="wow slideInLeft animated"><span class="color"></span>Publish your beautiful blogs.</h3>
							<a href="register.jsp">Start Blogging</a>
							<a href="login.jsp">Log in</a>
						</div>
					</div>
					<!-- end single slide -->
				</div>
				<!-- End Wrapper for slides -->
			</div>

		</section>
		
        <!--
        End Home SliderEnd
        ==================================== -->
        <%@include file="features.html" %>	
	    

        <%@include file="footer.jsp" %>	