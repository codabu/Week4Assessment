package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class getTempServlet
 */
@WebServlet("/getTempServlet")
public class getTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTempServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double temp = Double.parseDouble(request.getParameter("temperature")); //input temp will be either F or C - depends on the select element
		String selectOption = request.getParameter("isF");
		Boolean isF = null;
		if (selectOption.equals("true")) {
			isF = true;
		}
		if (selectOption.equals("false")) {
			isF = false;
		}
		
		TempConverter userTemp = new TempConverter (temp, isF);
		
		request.setAttribute("userConversion", userTemp);
		getServletContext().getRequestDispatcher("/conversionResult.jsp").forward(request, response);
	}

}
