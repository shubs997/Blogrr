 package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBHandlers.DaoMVC;
import model.usersBeans;



@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {

		String email=request.getParameter("email");     // get email and pass from user
		String pass=request.getParameter("pass");
		
		usersBeans ub=new usersBeans();
		ub.setEmailid(email);                           // pass it to model
		ub.setPass(pass);
		

        ResultSet rs=DaoMVC.loginUser(ub);                      // fetch data from table
                    
		try 
		{
			if(rs.next())                           // if user available in database 
			{
				System.out.println("login sucessfull");
				
				HttpSession session=request.getSession();
                                session.setAttribute("sid",rs.getString(1));
				session.setAttribute("username",rs.getString(2));
				session.setAttribute("pass",rs.getString(3));
				session.setAttribute("emailid",rs.getString(4));
                               
				response.sendRedirect("dispBlogServlet");     //redirect to blog feed 
				
               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}
			else
			{
				System.out.println("login unsucessfull in loginservlet");
                //getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);            
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
