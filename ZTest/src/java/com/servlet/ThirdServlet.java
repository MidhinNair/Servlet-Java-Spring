/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author Midhin Murali
 */
public class ThirdServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
    System.out.println("This is get() Method.....");
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h1>this is responce from http servlet </h1>");
    out.println("<h1> Date and Time is : "+new Date().toString()+"");
   
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }
    
    
    
    
}
