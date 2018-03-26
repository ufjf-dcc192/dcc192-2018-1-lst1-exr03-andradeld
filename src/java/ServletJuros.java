/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Andrade
 */
@WebServlet(urlPatterns = {"/juros.html"})
public class ServletJuros extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private double taxa = 0.001;
    private double montante;
    private double capital = 1000.00;
    private int tempo = 12;

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
        montante = capital * (1 + tempo * taxa);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JurosServlet</title>");
            out.println("</head>");
            out.println("<body>");
            /*EXERCICIO A*/
            out.println("<p>Montante final com taxa de Juros para 12 meses: R$" + montante + "</p>");
            /* ESPAÇAMENTO*/
            out.println("<br/>");
            out.println("<br/>");
            out.println("<hr>");
            
            
            /* EXERCICIO B*/
            out.println("<table>");

            out.println("<tr>");
            out.println("<th> Taxa 0.5</th>");
            out.println("<th> Taxa 1.0</th>");
            out.println("<th> Taxa 1.5 </th>");
            out.println("</tr>");

            for (int i = 1; i <= tempo; i++) {
                out.println("<tr>");
                out.println("<td>" + capital * (1 + i * 0.5) + "</td>");
                out.println("<td>" + capital * (1 + i * 1.0) + "</td>");
                out.println("<td>" + capital * (1 + i * 1.5) + "</td>");
                out.println("</tr>");

            }
            
            out.println("</table>");
            
            
            /* EXERCICIO C*/
            
            
            
            out.println("</body>");
            out.println("</html>");
        }

    }
}
