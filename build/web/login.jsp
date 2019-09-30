<%-- 
    Document   : login
    Created on : Sep 30, 2019, 10:28:56 AM
    Author     : Shubham
--%>

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
							<h2><span>Blogerr</span>!</h2>

							<form style="margin-top: 30px;" action="loginServlet" method="post">
							<div class="col-md-6 col-md-offset-3">
							  <div class="form-group">
							    <input type="email" name="email" class="form-control form-control-lg" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
							  </div>
							  <div class="form-group">
							    <input type="password" name="pass" class="form-control" id="exampleInputPassword1" placeholder="Password">
							  </div>
							  <button type="submit" class="btn btn-default btn-lg">Submit</button>
							  </div>
							</form>

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

