/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBHandlers.DaoMVC;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.usersBeans;

/**
 *
 * @author Shubham
 */
@WebServlet(name = "readMoreServlet", urlPatterns = {"/readMoreServlet"})
public class readMoreServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
      //Pass Execution to doPost
      doPost(request, response);
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  {
        HttpSession session=request.getSession();
        
        String blogTitle = request.getParameter("blogTitle");
        
         
        List viewb;
        viewb = DaoMVC.readMoreBlogBody(blogTitle);
        
        System.out.println("data added in viewc");
        
        session.setAttribute("viewb",viewb);
        session.setAttribute("blogTitle",blogTitle);

        String bid = session.getAttribute("blogTitle").toString();
        System.out.println("blogTitle set in session:"+bid);
        response.sendRedirect("blogsingle.jsp");
  }

    
}

