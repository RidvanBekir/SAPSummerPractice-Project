package controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AppUser;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory factory;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registration() {
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

		String username;
		String password;
		String repassword;
		String email;
		String firstName;
		String lastName;
		int age;
		String sex;
		boolean isMale;
		username = (String) request.getParameter("username");
		password = (String) request.getParameter("password");
		repassword = (String) request.getParameter("repassword");
		firstName = (String) request.getParameter("firstName");
		lastName = (String) request.getParameter("lastName");
		email = (String) request.getParameter("email");
		sex = (String) request.getParameter("gender");
		age = Integer.parseInt((String) request.getParameter("age"));
		
		if (username == null || username.isEmpty() || password == null || password.isEmpty() || repassword == null
				|| repassword.isEmpty() || email == null || email.isEmpty() || firstName == null || firstName.isEmpty()
				|| lastName == null || lastName.isEmpty() || age <= 0 || age < 100 || sex == null || sex.isEmpty()) {
			// wrong data input
			//response.sendError(400, "Wrong data input!");
			System.out.println("Wrong data input");
		}

		if (sex.equalsIgnoreCase("male")) {
			isMale = true;
		} else
			isMale = false;

		/*if (password.equals(repassword) == false) {
			response.sendError(400, "Passwords do not match!");
		}*/

		// MD5
		String cryptPass = SettingManager.cryptMD5(password);
		password = cryptPass;
		System.out.println("Cripted pass: " + password);

		// Email validation
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Boolean validEmail = email.matches(emailreg);
		if (!validEmail) {
			System.out.println("Invalid email");
			//response.sendError(400, "Invalid email!");
		}

		// checked in DB
		AppUser user = new AppUser(username, password, email, firstName, lastName, age, isMale);
		System.out.println("User to string :" + user.toString());
		EntityManager em = null;
		try {
			em = factory.createEntityManager();
			if (em.find(AppUser.class, username) != null) {
				em.persist(user);
			} else {
				response.sendError(400, "Cannot create user!");
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		response.sendRedirect("UserInfo.jsp");

	}
}
