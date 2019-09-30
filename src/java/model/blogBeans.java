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
    
    public blogBeans() {
        this.title = "";
        this.desc = "";
        this.body = "";
        this.files = "";
    }
    
    public blogBeans(String title, String desc, String body, String files) {
        this.title = title;
        this.desc = desc;
        this.body = body;
        this.files = files;
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

    @Override
    public String toString() {
        return "blogBeans{" + "title=" + title + ", desc=" + desc + ", body=" + body + ", files=" + files + '}';
    }
    
    
}
