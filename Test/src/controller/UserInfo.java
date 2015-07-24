package controller;

import java.io.IOException;

import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AppUser;

/**
 * Servlet implementation class UserInfo
 */
@WebServlet("/UserInfo")
public class UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String physic = request.getParameter("physic");
		double weight = Double.parseDouble(request.getParameter("weight"));
		double height = Double.parseDouble(request.getParameter("height"));
		String activityLevel = request.getParameter("ActivityLevel");
		String aim = request.getParameter("Goal");
		if (weight < 0 || height < 0) {
			response.sendError(400, "Wrong data input");
		}
		
		HttpSession hs = request.getSession();
		AppUser u = (AppUser) hs.getAttribute("user");
		u.setWeight(weight);
		u.setHeight(height);
		u.setAim(aim);
		u.setActivityLevel(activityLevel);
		
		if (physic.equalsIgnoreCase("Yes")) {
			u.setWorkOutPlan("AdvancedWorkOutPlan");
			request.setAttribute("physic", "AdvancedWorkOutPlan.jsp");			
		} else {
			u.setWorkOutPlan("BegginerWorkOutPlan");
			request.setAttribute("physic", "BegginerWorkOutPlan.jsp");
		}
		hs.setAttribute("user", u);
		request.getRequestDispatcher("UserInfoMenu.jsp").forward(request, response);
		System.out.println(hs.getAttribute("user").toString());
		response.sendRedirect("Information.jsp");
	}
}
