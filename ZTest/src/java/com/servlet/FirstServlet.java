/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

/**
 *
 * @author Midhin Murali
 */
public  class FirstServlet implements Servlet{
    //lifecycle methods:init,servie,destory
    ServletConfig conf;
    @Override
    public void init(ServletConfig conf){
        this.conf =conf;
        System.out.println("creating object....");
    }
    
    @Override
    public void destroy(){
        System.out.println("destroying servlet object....");
    }
    // non cycle methods
    public ServletConfig getSevletConfig(){
        return this.conf;
    }
    @Override
    public String getServletInfo(){
        return "this servlet is created by Midhin";
    }
    @Override
        public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException            {
          
            System.out.println("servising ....");
            //set content type of responce
            resp.setContentType("text/html");
            PrintWriter out =resp.getWriter();
            out.println("<h1>Heloooo from Service</h1>"); 
            out.println("<h1>Today Date and Time is :"+new Date().toString()+" </h1>");
        }

    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
