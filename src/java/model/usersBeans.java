package model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham
 */
public class usersBeans 
{   
       private int uid;
       private String uname;
       private String pass;
       private String emailid;
        public usersBeans()
        {
            this.uid=0;
            this.uname="";
            this.emailid="";
        }
        
        public usersBeans(int sid,String uname,String emailid,String gend,String dept)
        {
            this.uid=sid;
            this.uname=uname;
            this.pass=pass;
            this.emailid=emailid;

        }


    public String getName() {
        return uname;
    }

    public void setName(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "usersBeans{" + "uid=" + uid + ", uname=" + uname + ", pass=" + pass + ", emailid=" + emailid + '}';
    }

 

 

 
    
        
        



   

}