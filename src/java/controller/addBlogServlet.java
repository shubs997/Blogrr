/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBHandlers.DaoMVC;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.blogBeans;
/**
 *
 * @author Shubham
 */
@WebServlet(name = "addBlogServlet", urlPatterns = {"/addBlogServlet"})

public class addBlogServlet extends HttpServlet 
{  
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        HttpSession session=request.getSession();
        System.out.println("In addBlogServlet");
        String title=request.getParameter("title");
        String desc=request.getParameter("desc");
        String body=request.getParameter("body");
        //String[] sltuser=request.getParameterValues("sltUser");
        
        System.out.println("title:" +title);
        System.out.println("body:" +body);
        System.out.println("desc:" +desc);
        
        //System.out.println("Users in Servlet:"+Arrays.toString(sltuser));
        
        blogBeans bb=new blogBeans();
                bb.setTitle(title);
                bb.setDesc(desc);
                bb.setBody(body);
                //nb.setSltUser(sltuser);
                
                
                if(session.getAttribute("filename") == null)
                {
                    bb.setFiles("null");
                }
                else
                {
                    bb.setFiles(session.getAttribute("filename").toString());
                }
       
        int i=DaoMVC.storeBlogPosts(bb);     
        
        if(i!=0)
                {
                     System.out.println("value inserted");  
 //                    session.setAttribute("username",uname);
                     session.setAttribute("sucessmsg", "Blog published Sucessfully!");
                     response.sendRedirect("addblog.jsp"); //redirect user to login.jsp

                }
                else
                {
                    session.setAttribute("sucessmsg", "Notice not published");
                    System.out.println("value not inserted"); //data insertion failed
                    response.sendRedirect("addblog.jsp"); //redirect user to register.jsp
                }    
    }

    
}