/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.servlet;

import br.edu.ifsp.tads.dsw.sisfin.DAO.CardDAO;
import br.edu.ifsp.tads.dsw.sisfin.model.Card;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "FindCard", urlPatterns = {"/FindCard"})
public class FindCard extends HttpServlet {

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
              
        String number = request.getParameter("number");
        /*SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy");*/
        /*Date valid = (Date) formato.parse(request.getParameter("valid"));*/
                       
        Card card = new Card(number,"find","find");
        CardDAO dao = new CardDAO();
        
        Card cardFind = dao.find(card);
              
            if(cardFind != null) {
                request.setAttribute("number", cardFind.getNumber());
                request.setAttribute("brand", cardFind.getBrand());
                request.setAttribute("valid", cardFind.getValid());
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("jsp/findCardView.jsp");
                rd.forward(request, response);
            }else{
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("CardNotFind.html");
                rd.forward(request, response);    
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
