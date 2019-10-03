package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import DBHandlers.DaoMVC;
import com.mysql.cj.Session;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.blogBeans;
import model.usersBeans;


@WebServlet(urlPatterns = {"/dispBlogServlet"})
public class dispBlogServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        System.out.println("hello");
        doPost(request,response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        HttpSession session=request.getSession();
        
        //String uname=session.getAttribute("username").toString();
        
        usersBeans ub=new usersBeans();
        //ub.setName(uname);
        System.out.println("in dispBlogServlet ");
        
//        List <noticeBeans> nlist;
//        nlist = DaoMVC.displayNotice(ub);
      
        
        List blogs;
        blogs = DaoMVC.displayBlogs();
        System.out.println("set list ");
        //session.setAttribute("nname",uname);
        session.setAttribute("bloglist",blogs); 
        System.out.println("set session to list ");
                
                
                
        response.sendRedirect("blogfeed.jsp");
//		try 
//		{                                                
//                     
//			if()
//			{
//				System.out.println("notice found sucessfully");
//				
//				response.sendRedirect("Welcome.jsp");
//				
//               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
//			}
//			else
//			{
//				System.out.println("notice not found");
//                //getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);            
//			}
//		} 
//                
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
                
          

    }

    
}
