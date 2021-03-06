/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import control.ProjectDTO;
import data.IO;
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
 * @author Jeanette
 */
@WebServlet(name = "UpdateChangeProjectServlet", urlPatterns =
{
    "/UpdateChangeProjectServlet"
})
public class UpdateChangeProjectServlet extends HttpServlet
{
    int projectCost;
    int projectBudget;
    int partnerID;
    int projectID;

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
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        String answer = null;
        try
        {
            String status = request.getParameter("status");
            String startDate = request.getParameter("startDate");   //request.getParameter henter string fra tekst feltet som har navnet indskrevet i stringen
            String endDate = request.getParameter("endDate");
            try
            {
                projectBudget = Integer.valueOf(request.getParameter("budget"));
            } catch (NumberFormatException ex)
            {
                request.setAttribute("validateMsg", "Budget cannot contain letters");
                RequestDispatcher rd = request.getRequestDispatcher("ChangeProject.jsp");
                rd.forward(request, response);
            }
//            String budgetText = request.getParameter("budget");
//            System.out.println("budget: "+budgetText);
//            budget = Integer.valueOf(budgetText);
            String currency = request.getParameter("currency");
            String activityDescription = request.getParameter("activityDescription");
            String comments = request.getParameter("comments");
            String targetAudience = request.getParameter("targetAudience");
            String objectiveResult = request.getParameter("objectiveResult");
            try
            {
                partnerID = Integer.valueOf(request.getParameter("partnerID"));
            } catch (NumberFormatException nfe)
            {
                request.setAttribute("validateMsg", "PartnerID cannot contain letters");
                RequestDispatcher rd = request.getRequestDispatcher("ChangeProject.jsp");
                rd.forward(request, response);
            }
            String requiredPOE = request.getParameter("requiredPOE");
            try
            {
                projectCost = Integer.valueOf(request.getParameter("cost"));
            }
            catch(NumberFormatException nfe)
            {
                
            }
            int employeeID = Integer.valueOf(request.getParameter("employeeID"));
            String quarter = request.getParameter("quarter");
            projectID = Integer.valueOf(request.getParameter("projectID"));

            ProjectDTO p = new ProjectDTO(status, startDate, endDate, currency, activityDescription, comments, targetAudience, objectiveResult, partnerID, projectBudget, projectCost, requiredPOE, employeeID, projectID, quarter);
            IO.UpdateProject(p);
            String confirm = "Project "+projectID+ " have been changed, you can now view the changed project by doing a search";
//            request.setAttribute("validateMsg", answer);
            request.setAttribute("projectHaveBeenChanged", confirm);
            request.getRequestDispatcher("SearchProject.jsp").forward(request, response);
        } catch (Exception e)
        {
            PrintWriter out = response.getWriter();
            out.println("<h2>" + e + "</h2>");
            out.print("<pre>");
            e.printStackTrace(out);
            out.println("</pre>");
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
            throws ServletException, IOException
    {
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
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
