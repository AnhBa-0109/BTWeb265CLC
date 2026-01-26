

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BMI
 */
@WebServlet("/BMI")
public class BMI extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");
		String status;
		
		double weightNum = Double.parseDouble(weight);
		double heightNum = Double.parseDouble(height);
		
		double result = weightNum / Math.pow(heightNum,2);

		if(result < 18.5) status = "Gầy";
		else if(result >= 18.5 && result <25) status = "Bình thường";
		else status = "Béo phì";
		
		request.setAttribute("result", String.format("%.2f", result));
		request.setAttribute("status", status);
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
