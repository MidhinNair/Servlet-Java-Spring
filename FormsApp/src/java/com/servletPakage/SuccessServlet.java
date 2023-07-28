/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servletPakage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Midhin Murali
 */
public class SuccessServlet extends HttpServlet {
    //Forward(). RequestDipatcher

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType ("text/html");
        PrintWriter out = resp.getWriter();
        out.println("This is SuccessServlet");
        out.println("<h2> Successfully Registred </h2>");
        
         
    }
    
    
}
