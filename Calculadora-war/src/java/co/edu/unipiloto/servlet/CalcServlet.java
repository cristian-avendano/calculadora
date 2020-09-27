/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.calculadora.CalcbeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author crist
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcbeanLocal calcbean;

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.print("<style>*{color: white;margin: 0;padding: 0;font-family: Arial, Helvetica, sans-serif;}body{background-color:#18191f;display: flex;flex-direction: row;justify-content: center;line-height: 100vh;}</style>");
            String value = request.getParameter("t1");
            String res = "";
            String op[];   
            String a1 = "",b1 = "",oper = "";
        
            for (int i = 0; i < value.length(); i++) {
                if(comprobar(value.charAt(i))){
                    op = value.split("\\"+value.charAt(i)+"");
                    a1 = op[0];
                    b1 = op[1];
                    oper=value.charAt(i)+"";
                    res= resultado(op[0], op[1], value.charAt(i)+"");
                }
            }
            
            out.println("<h1>"+ a1 + " " + oper + " "+  b1 + " = " + res+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public boolean comprobar(char caracter){
        switch(caracter){
            case '+':
                return true;
            case '-':
                return true;
            case '*':
                return true;
            case '/':
                return true;
            default: 
                return false;
        }       
    }
    
    public String resultado(String a1, String b1, String op   ){
        
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        
        if (op.equals("+")) {
            return calcbean.suma(a, b)+ "";
        }
        
        if (op.equals("-")) {
            return calcbean.resta(a, b)+ "";
        }
        
        
        if (op.equals("*")) {
            return calcbean.multiplicacion(a, b)+ "";
        }
        
        
        if (op.equals("/")) {
            return calcbean.division(a, b)+ "";
        }
        return "0";
        
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