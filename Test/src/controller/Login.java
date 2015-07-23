package controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AppUser;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory factory;

	@Override
	public void init(ServletConfig config) throws ServletException {
		factory = (EntityManagerFactory) config.getServletContext().getAttribute(EntityManagerFactory.class.getName());
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
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
		if(request.getParameter("Register") != null){
			response.sendRedirect("Registration.jsp");
		}
		String username = null;
		String password = null;
		username = (String) request.getParameter("username");
		password = (String) request.getParameter("password");
		if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
			response.setStatus(400);
			//da se dobavi suob6tenie
		}
		EntityManager em = factory.createEntityManager();
		if (em == null) {
			System.out.println("Entity not created.");

		}
		
		boolean loggedIn = false;
		try {
			TypedQuery<AppUser> search = em.createQuery("select U from AppUser U where U.username = :name and U.password= :pwd", AppUser.class);
			search.setParameter("name", username);
			String cryptPass = SettingManager.cryptMD5(password);
			password = cryptPass;
			System.out.println("Searching cripted pass: " + password);
			search.setParameter("pwd", password);
			try{
			search.getSingleResult();
			loggedIn = true;
			}
			catch(Exception e){
				//RequestDispatcher rd = null;
				e.printStackTrace();
				response.sendRedirect("Registration.jsp");
				//response.sendError(200, "Wrong username or password");
			}
			
		} finally {
			if (em != null) {
				em.close();
			}
		}
		if (loggedIn) {
			response.sendRedirect("UserInfo.jsp");
		}
	}

}
