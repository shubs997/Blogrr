<%-- 
    Document   : addblog
    Created on : Sep 30, 2019, 5:30:33 PM
    Author     : Shubham
--%>

<%@include file="blogheader.jsp" %>	

<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
<script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>

<section id="editor">
    
    <!-- Modals -->

    <!-- Add Page -->

    <form action="addBlogServlet" method="post">
      <div class="modal-header">
        <h4 class="modal-title" id="myModalLabel">Add Blog ${sucessmsg}</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Blog Title</label>
          <input type="text" name="title" class="form-control" placeholder="Blog Title">
        </div>
        <div class="form-group">
          <label>Blog Description</label>
          <input type="text" name="desc" maxlength="70" class="form-control" placeholder="Add Blog Description...">
        </div>
        <div class="form-group">
          <label>Blog Body</label>
          <textarea  name="body" maxlength="1000" class="form-control" placeholder="Blog Body"></textarea>
        </div>
        <div class="checkbox">
          <label>
            <input type="checkbox"> Publish
          </label>
        </div>
        <iframe src="fileupload.jsp" height="120" width="400" style="border:none;"></iframe>
      </div>
      <div class="modal-footer">
        <button type="submit" class="btn btn-primary btn-lg">Publish</button>
      </div>
    </form>


  <script>
     CKEDITOR.replace( 'editor1' );
 </script>

</section>
<%@include file="blogfooter.jsp" %>	
