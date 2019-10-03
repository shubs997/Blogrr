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
import static controller.passwordHash.getSHA;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.usersBeans;



@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                HttpSession session=request.getSession();
		String email=request.getParameter("email");     // get email and pass from user
		String pass=request.getParameter("pass");
                String hashpass = "";
                
                                                                //code to hash the password using SHA-256
		try {
                    hashpass = passwordHash.toHexString(getSHA(pass));
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
		usersBeans ub=new usersBeans();
		ub.setEmailid(email);                           // pass it to model
		ub.setPass(hashpass);
		

        ResultSet rs=DaoMVC.loginUser(ub);                      // fetch data from table(Ctrl+click on loginUser to view SQL query)
                    
		try 
		{
			if(rs.next())                           // if user available in database 
			{
				System.out.println("login sucessfull");
				
                                session.setAttribute("sid",rs.getString(1));
				session.setAttribute("username",rs.getString(2));
				session.setAttribute("pass",rs.getString(3));
				session.setAttribute("emailid",rs.getString(4));
                                System.out.println("username set in session:" +rs.getString(2) );
				response.sendRedirect("dispBlogServlet");     //redirect to blog feed 
				
               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}
			else
			{
				System.out.println("login unsucessfull in loginservlet");
                                session.setAttribute("loginmsg", "incorrect email or password");   //send feedback msg is validation fails.
                getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);            
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
