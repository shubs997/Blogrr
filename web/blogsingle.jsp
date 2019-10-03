<%-- 
    Document   : blogfeed
    Created on : Sep 30, 2019, 11:17:05 AM
    Author     : Shubham
--%>
                <%@include file="blogheader.jsp" %>	
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<!-- Blogs -->
		<section class="blog b-archives section">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-9 col-12">
						<div class="row">
                                                        <div class="col-lg-8 col-12">
                                                            <div class="blog-detail" style="margin-left: 100px;">
                                                                <c:forEach var="v" items="${viewb}">
                                                                        <div class="detail-content">
                                                                                <h2 class="blog-title"><a href="#">${v.title}</a></h2>
                                                                                <div class="blog-info">
                                                                                        <a href="#"><i class="fa fa-user"></i>${v.author}</a>
                                                                                        <a href="#"><i class="fa fa-calendar"></i>${v.date}</a>
                                                                                        <a href="#"><i class="fa fa-bolt"></i>Learning</a>
                                                                                </div><br>
                                                                                <img src="images/blog/${v.files}" alt="#"><br><br>
                                                                                <p>${v.body}</p>
                                                                        </div>
                                                                </c:forEach><br><br><br><br>
                                                                        <div class="comment-main">
                                                                                <div id="disqus_thread"></div>
                                                                                <script>

                                                                                /**
                                                                                *  RECOMMENDED CONFIGURATION VARIABLES: EDIT AND UNCOMMENT THE SECTION BELOW TO INSERT DYNAMIC VALUES FROM YOUR PLATFORM OR CMS.
                                                                                *  LEARN WHY DEFINING THESE VARIABLES IS IMPORTANT: https://disqus.com/admin/universalcode/#configuration-variables*/
                                                                                /*
                                                                                var disqus_config = function () {
                                                                                this.page.url = PAGE_URL;  // Replace PAGE_URL with your page's canonical URL variable
                                                                                this.page.identifier = PAGE_IDENTIFIER; // Replace PAGE_IDENTIFIER with your page's unique identifier variable
                                                                                };
                                                                                */
                                                                                (function() { // DON'T EDIT BELOW THIS LINE
                                                                                var d = document, s = d.createElement('script');
                                                                                s.src = 'https://https-shubhamjblog-netlify-com.disqus.com/embed.js';
                                                                                s.setAttribute('data-timestamp', +new Date());
                                                                                (d.head || d.body).appendChild(s);
                                                                                })();
                                                                                </script>
                                                                                <noscript>Please enable JavaScript to view the <a href="https://disqus.com/?ref_noscript">comments powered by Disqus.</a></noscript>
                                                                        </div>
                                                                </div>
                                                        </div>
<!--							<div class="col-lg-4 col-12">
								 Single Blog 
								<div class="single-blog">
									<div class="blog-head overlay">
										<div class="date">
											<h4>20<span>Mar</span></h4>
										</div>
										<img src="images/blog/blog2.jpg" alt="#">
									</div>
									<div class="blog-content">
										<h4 class="blog-title"><a href="blog-single.html">Our teachers egestas erat dignissim</a></h4>
										<div class="blog-info">
											<a href="#"><i class="fa fa-user"></i>By: Admin</a>
											<a href="#"><i class="fa fa-list"></i>Academic</a>
											<a href="#"><i class="fa fa-heart-o"></i>33K</a>
										</div>
										<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>
										<div class="button">
											<a href="#" class="btn">Read More<i class="fa fa-angle-double-right"></i></a>
										</div>
									</div>
								</div>
								 End Single Blog 
							</div>
							<div class="col-lg-4 col-12">
								 Single Blog 
								<div class="single-blog">
									<div class="blog-head overlay">
										<div class="date">
											<h4>10<span>Mar</span></h4>
										</div>
										<img src="images/blog/blog3.jpg" alt="#">
									</div>
									<div class="blog-content">
										<h4 class="blog-title"><a href="blog-single.html">We are Proffesional Have velit Landon</a></h4>
										<div class="blog-info">
											<a href="#"><i class="fa fa-user"></i>By: Admin</a>
											<a href="#"><i class="fa fa-list"></i>Knowledge</a>
											<a href="#"><i class="fa fa-heart-o"></i>11K</a>
										</div>
										<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>
										<div class="button">
											<a href="#" class="btn">Read More<i class="fa fa-angle-double-right"></i></a>
										</div>
									</div>
								</div>
								 End Single Blog 
							</div>
							<div class="col-lg-4 col-12">
								 Single Blog 
								<div class="single-blog">
									<div class="blog-head overlay">
										<div class="date">
											<h4>15<span>Feb</span></h4>
										</div>
										<img src="images/blog/blog4.jpg" alt="#">
									</div>
									<div class="blog-content">
										<h4 class="blog-title"><a href="blog-single.html">Our Student Have sit amet egestas</a></h4>
										<div class="blog-info">
											<a href="#"><i class="fa fa-user"></i>By: Admin</a>
											<a href="#"><i class="fa fa-list"></i>Learning</a>
											<a href="#"><i class="fa fa-heart-o"></i>53K</a>
										</div>
										<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>
										<div class="button">
											<a href="#" class="btn">Read More<i class="fa fa-angle-double-right"></i></a>
										</div>
									</div>
								</div>
								 End Single Blog 
							</div>
							<div class="col-lg-4 col-12">
								 Single Blog 
								<div class="single-blog">
									<div class="blog-head overlay">
										<div class="date">
											<h4>01<span>Feb</span></h4>
										</div>
										<img src="images/blog/blog5.jpg" alt="#">
									</div>
									<div class="blog-content">
										<h4 class="blog-title"><a href="blog-single.html">Our teachers egestas erat dignissim</a></h4>
										<div class="blog-info">
											<a href="#"><i class="fa fa-user"></i>By: Admin</a>
											<a href="#"><i class="fa fa-list"></i>Academic</a>
											<a href="#"><i class="fa fa-heart-o"></i>33K</a>
										</div>
										<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>
										<div class="button">
											<a href="#" class="btn">Read More<i class="fa fa-angle-double-right"></i></a>
										</div>
									</div>
								</div>
								 End Single Blog 
							</div>
							<div class="col-lg-4 col-12">
								 Single Blog 
								<div class="single-blog">
									<div class="blog-head overlay">
										<div class="date">
											<h4>02<span>Jan</span></h4>
										</div>
										<img src="images/blog/blog6.jpg" alt="#">
									</div>
									<div class="blog-content">
										<h4 class="blog-title"><a href="blog-single.html">We are Proffesional Have velit Landon</a></h4>
										<div class="blog-info">
											<a href="#"><i class="fa fa-user"></i>By: Admin</a>
											<a href="#"><i class="fa fa-list"></i>Knowledge</a>
											<a href="#"><i class="fa fa-heart-o"></i>11K</a>
										</div>
										<p>Vivamus volutpat eros pulvinar velit laoreet, sit amet egestas erat dignissim. Et harum quidem rerum facilis est et expedita distinctio</p>
										<div class="button">
											<a href="#" class="btn">Read More<i class="fa fa-angle-double-right"></i></a>
										</div>
									</div>
								</div>
								 End Single Blog 
							</div>-->
						</div>

					</div>
					<div class="col-lg-3 col-12">
						<div class="learnedu-sidebar">
							<div class="search">
								<div class="form">
									<input type="email" placeholder="Search ...">
									<button class="button"><i class="fa fa-search"></i></button>
								</div>
							</div>
							<div class="single-widget tags">
								<h3>Recent <span>Tags</span></h3>
								<ul>
									<li><a href="#">Course</a></li>
									<li><a href="#">University</a></li>
									<li><a href="#">Scholarship</a></li>
									<li><a href="#">Free</a></li>
									<li><a href="#">Standard</a></li>
									<li><a href="#">Standard</a></li>
								</ul>
							</div>
							<!-- Categories -->
							<div class="single-widget categories">
                                <h3 class="title">Categories</h3>
                                <ul>
                                    <li><a href="#"><i class="fa fa-angle-right"></i>Education Tips<span>16</span></a></li>
                                    <li><a href="#"><i class="fa fa-angle-right"></i>General Knowledge<span>30</span></a></li>
                                    <li><a href="#"><i class="fa fa-angle-right"></i>Tips for success<span>80</span></a></li>
                                    <li><a href="#"><i class="fa fa-angle-right"></i>Student Life<span>23</span></a></li>
                                    <li><a href="#"><i class="fa fa-angle-right"></i>Courses<span>28</span></a></li>
                                </ul>
                            </div>
							<!--/ End Categories -->
						</div>
					</div>
				</div>
			</div>
		</section>
		<!--/ End Blogs -->
                
                <%@include file="blogfooter.jsp" %>	
                  
