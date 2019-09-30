package DBHandlers;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.usersBeans;
import model.blogBeans;

public class DaoMVC
{

    private static Connection connect()
    {
    	String url="jdbc:mysql://localhost:3306/blog_db";
    	String username="root";
    	String password="root";

        Connection con=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        }

        catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }


        public static int register(usersBeans ub)
    {
        int i=0;
        String sql="insert into userdb (username,password,email) values(?,?,?)";
        Connection con=connect();
        try
        {
            PreparedStatement stm =con.prepareStatement(sql);
            stm.setString(1,ub.getName());
            stm.setString(2,ub.getPass());
            stm.setString(3,ub.getEmailid());

            i = stm.executeUpdate();
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }


	public static ResultSet loginUser(usersBeans ub)
	{
		ResultSet rs=null;
                String sql="select * from userdb where email=? and password=?";
		Connection con=connect();
		try
		{
			PreparedStatement stm=con.prepareStatement(sql);
			stm.setString(1, ub.getEmailid());
			stm.setString(2,ub.getPass());

			rs=stm.executeQuery();


		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
	}
    
        
        
    public static int storeBlogPosts(blogBeans cb) 
    {
        int i=0;
        String sql="insert into blog_posts (title,description,body,files) values(?,?,?,?)";
        Connection con=connect();
        try
        {
            PreparedStatement stm =con.prepareStatement(sql);
            stm.setString(1,cb.getTitle());
            stm.setString(2,cb.getDesc());
            stm.setString(3,cb.getBody());
            stm.setString(4,cb.getFiles());
            
            i = stm.executeUpdate();
        }

        catch (SQLException ex) {
            Logger.getLogger(DaoMVC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    

    public static List displayBlogPosts() 
    {
        ResultSet rs=null;
        String sql="select * from circular_staff";
	Connection con=connect();
        ArrayList<blogBeans> clist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){

                        String title = rs.getString(1);
                        String desc = rs.getString(2);
                        String body = rs.getString(3);
                        String files = rs.getString(4);
                        System.out.println("Table Contents in dispCircular method:" +title+" "+body+" "+desc+" ");
                        
                        //set the values in noticeBeans model
                        blogBeans cb=new blogBeans();
                        cb.setTitle(title);
                        cb.setDesc(desc);
                        cb.setBody(body);
                        cb.setFiles(files);
                        System.out.println("Table Contents in dispNotice class to model:" +cb.getTitle()+" "+cb.getBody()+" "+cb.getDesc()+" ");
                        System.out.println("files are set in noticebeans");
                        clist.add(cb);
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clist;
    }
    
    public static String returnFileName(String NoticeID) 
    {
         ResultSet rs=null;
         String sql="select files from notice where title like ?";
	 Connection con=connect();
         ArrayList<blogBeans> vlist = new ArrayList<>();
        
          

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());

                    stm.setString(1,NoticeID);
                    System.out.println("IN returnFileName value of ? is:"+NoticeID);
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){
                        String fileName1 = rs.getString(1);                       
                        return fileName1;

                     }                   
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null; 
    }
    
    public static ArrayList displayBlogs()
    {
        ResultSet rs=null;
        String sql="select * from blog_posts";
	Connection con=connect();
        ArrayList<blogBeans> nlist = new ArrayList<>();

		try
		{
                    PreparedStatement stm=con.prepareStatement(sql);
                    //stm.setString(1, ub.getName());
                    
                    
                    rs=stm.executeQuery();
                          
                    while(rs.next()){

                        String title = rs.getString(1);
                        String description = rs.getString(2);
                        String body = rs.getString(3);
                        String files = rs.getString(4);
                        //System.out.println("Table Contents in dispNotice class:" +title+" "+body+" "+description+" "+files);
                        
                        //set the values in noticeBeans model
                        blogBeans bb=new blogBeans();
                        bb.setTitle(title);
                        bb.setDesc(description);
                        bb.setBody(body);
                        bb.setFiles(files);
                        //System.out.println("Table Contents in dispBlog class to model:" +bb.getTitle()+" "+bb.getBody()+" "+bb.getDesc()+" "+bb.getFiles());
                        
                        nlist.add(bb);
                        System.out.println("added beans to list");
                     }

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                
		return nlist;
                
    }
}