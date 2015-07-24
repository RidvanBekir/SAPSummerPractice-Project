package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import model.AppUser;
import model.Course;

/**
 * Servlet implementation class FitnessCalculator
 */
@WebServlet("/FitnessCalculator")
public class FitnessCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
	//comment
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FitnessCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		if(request.getParameter("MealPlan") != null){
			response.sendRedirect("Registration.jsp");
		}
		HttpSession session = request.getSession();
		AppUser user = (AppUser) session.getAttribute("user");
		if(user != null){
		double[] macros = calculate(user);
		session.setAttribute("callories", macros[0]);
		session.setAttribute("protein", macros[1]);
		session.setAttribute("carbohydrates", macros[2]);
		session.setAttribute("fats", macros[3]);
		session.setAttribute("proteinGramms", macros[4]);
		session.setAttribute("carbohydratesGramms", macros[5]);
		session.setAttribute("fatsGramms", macros[6]);
		}
		
	}
	public double[] calculate( AppUser user){
		double[] arrToReturn=new double[7];
		
		int age = user.getAge();
		double callories;
		double protein;
		double carbohydrates;
		double fats;
		boolean isMale = user.getIsMale();
		double weight =user.getWeight();
		double height = user.getHeight();
		double activityLevel = user.getActivityLevel();
		String aim = user.getAim();
		double carbohydratesSource;
		double proteinSource;
		double fatsSource;
		
		if(isMale){
			callories = (66 + 13.7*weight + 5*height - 6.8*age)*activityLevel;
		}else{
			callories =(655 + 9.6*weight + 1.8*height - 4.7*age)*activityLevel;
		}
		 protein=weight*2.2;
		 if(aim=="Clean bulk"){
			 callories+=250;
		 }else if(aim=="Lose fat - 5%"){
			 callories*=0.95;
		 }else if(aim=="Lose fat - 10%"){
			 callories*=0.90;
		 }else if(aim=="Lose fat - 15%"){
			 callories*=0.85;
		 }else if(aim=="Lose fat - 20%"){
			 callories*=0.80;
		 }else if(aim=="Lose fat - 25%"){
			 callories*=0.75;
		 }
		 carbohydrates=Math.round((callories - protein*4)/3)/2;
		 fats=Math.round((callories - protein*4)/3)/9;
		
		 Course chickenBreast = new Course();
		 chickenBreast.setCalories(1.73);
		 chickenBreast.setProteins(0.31);
		 chickenBreast.setCarbohydrates(0);
		 chickenBreast.setFats(0.045);
		 Course rice = new Course();
		 rice.setCalories(1.12);
		 rice.setProteins(0.023);
		 rice.setCarbohydrates(0.235);
		 rice.setFats(0.008);	 
		 
		 Course oliveOil = new Course();
		 oliveOil.setCalories(8.24);
		 oliveOil.setProteins(0);
		 oliveOil.setCarbohydrates(0);
		 oliveOil.setFats(0.92);	 
		 
		 carbohydratesSource=Math.round((carbohydrates/rice.getCarbohydrates())/3);
			proteinSource=Math.round(((protein-rice.getProteins())/(chickenBreast.getProteins()))/3);
			fatsSource=Math.round(((fats-(rice.getFats()-chickenBreast.getFats())/+oliveOil.getFats()))/3);
			arrToReturn[0]=callories;
			arrToReturn[1]=protein;
			arrToReturn[2]=carbohydrates;
			arrToReturn[3]=fats;
			arrToReturn[4]=carbohydratesSource;
			arrToReturn[5]=proteinSource;
			arrToReturn[6]=fatsSource;
			return arrToReturn;
			
	}
	
}
