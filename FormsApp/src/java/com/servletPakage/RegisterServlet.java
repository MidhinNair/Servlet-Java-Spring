/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servletPakage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Midhin Murali
 */
public class RegisterServlet extends HttpServlet {
    
   
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    //data swbd using fom parameters
    out.println("<h2> Welcome to register servlet</h2>");
    String name = req.getParameter("userName");
    String password = req.getParameter("password");
    String email = req.getParameter("email");
    String gender = req.getParameter("userGender");
    String age = req.getParameter("age");
    String course = req.getParameter("userCourse");
     String condition = req.getParameter("Condition");
     if(condition!=null){
         
     if(condition .equals("true")){
         out.println("<h2>name : "+name+"</h2>");
         out.println("<h2>password : "+password+"</h2>");
         out.println("<h2>email : "+email+"</h2>");
         out.println("<h2>gender : "+gender+"</h2>");
         out.println("<h2>age : "+age+"</h2>");
         out.println("<h2>course : "+course+"</h2>");
         out.println("<h2>conditions : "+condition+"</h2>");
         //jdbc
         
         //saved to db
         //Forward RequestDispatcher
          RequestDispatcher rd = req.getRequestDispatcher("SuccessSer");
          rd.forward(req, res);
         
     }
     else{
         out.println("<h2>you have not accepted condition</h2>");
     }
     }
     else{
         out.println("<h2>you have not accepted treams and condition</h2>");   
         //i want to include output of index.html
        
        // get objectof RequestDispater
        RequestDispatcher rd = req.getRequestDispatcher("index.html");
        //include()
        rd.include(req, res);
     }    
    
    }
    
    
}
