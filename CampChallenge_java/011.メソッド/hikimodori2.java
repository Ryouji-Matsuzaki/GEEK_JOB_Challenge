/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class hikimodori2 extends HttpServlet {
 String[] hikimodori(String id){
        String a[]={"0000","1994/12/15.","tokyo"};
        String b[]={"0001","1995/04/04.","gunma"};
        String c[]={"0002","1989/11/11.",null};
        String[] stringArray;
        stringArray = new String[3];
                
        switch(id){
            
                case "0000":
                stringArray=a;
                    break;
                case "0001":
                stringArray=b;
                    break;
                case "0002":
                stringArray=c;
                    break;
                default:
                   break;
        }return stringArray;
 }
 
 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String[] prof;
            for(int i=0;i<3;i++){
                
                switch(i){
                    case 1:
                    prof=hikimodori("0000");    
                    for(int j=0;j<3;j++){    
                    if(prof[j]==null){
                      continue;
                    }out.print(prof[j]);
                    }break;
                    
                    case 2:
                    prof=hikimodori("0001");
                    for(int d=0;d<3;d++){
                    if(prof[d]==null){
                      continue;
                    }out.print(prof[d]);
                    }break;
                    
                    case 3:
                    prof=hikimodori("0002");
                    for(int g=0;g<3;g++){
                    if(prof[g]==null){
                      continue;
                    }out.print(prof[g]);
                    }break;
                
            
                }}              
         
             
         
    
             
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikimodori</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hikimodori at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
                }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
