package main.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"", "/"})
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String principleAmount = request.getParameter("principleAmount");
        String interestPercentage = request.getParameter("interestPercentage");
        String years = request.getParameter("years");
        String compoundingPeriod = request.getParameter("compoundingPeriod");

        String error;
        if(principleAmount == null || interestPercentage == null || years == null || compoundingPeriod == null ||
        principleAmount.isEmpty() || interestPercentage.isEmpty() || years.isEmpty() || compoundingPeriod.isEmpty()) {
            error = "One or more of the input boxes were blank";
            request.setAttribute("error", error);
        } else {
            double result = Utils.calculatorCompoundInterest(Double.parseDouble(principleAmount), (Double.parseDouble(interestPercentage) / 100), Integer.parseInt(years), Integer.parseInt(compoundingPeriod));
            request.setAttribute("result", result);
        }
        request.setAttribute("principle", principleAmount);
        request.setAttribute("interest", interestPercentage);
        request.setAttribute("years", years);
        request.setAttribute("compound", compoundingPeriod);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
