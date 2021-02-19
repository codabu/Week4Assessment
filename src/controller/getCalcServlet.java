package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Calculator;

/**
 * Servlet implementation class getCalcServlet
 */
@WebServlet("/getCalcServlet")
public class getCalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double operand1 = Double.parseDouble(request.getParameter("operand1"));
		double operand2 = Double.parseDouble(request.getParameter("operand2"));
		String operator = request.getParameter("operator");
		
		Calculator userCalc = new Calculator(operand1, operand2, operator);
		
		request.setAttribute("userCalculation", userCalc);
		getServletContext().getRequestDispatcher("/calcResult.jsp").forward(request, response);
	}

}

