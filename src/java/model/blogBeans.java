/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Shubham
 */
public class blogBeans {
    private String title;
    private String desc;
    private String body;
    private String files;
    private String author;
    private String likes;
    private String date;
    
    public blogBeans() {
        this.title = "";
        this.desc = "";
        this.body = "";
        this.files = "";
        this.author = "";
        this.likes = "";
        this.date = "";
    }

    public blogBeans(String title, String desc, String body, String files, String author, String likes, String date) {
        this.title = title;
        this.desc = desc;
        this.body = body;
        this.files = files;
        this.author = author;
        this.likes = likes;
        this.date = date;
    }
    
    

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getBody() {
        return body;
    }

    public String getFiles() {
        return files;
    }

    public String getAuthor() {
        return author;
    }

    public String getLikes() {
        return likes;
    }

    public String getDate() {
        return date;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "blogBeans{" + "title=" + title + ", desc=" + desc + ", body=" + body + ", files=" + files + ", author=" + author + ", likes=" + likes + ", date=" + date + '}';
    }
    
    
    
    
}
