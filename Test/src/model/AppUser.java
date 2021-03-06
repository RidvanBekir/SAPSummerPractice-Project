package model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AppUser {
	private static final int MAX_ACHIEVEMENT_POINTS = 1000;
	@Id
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private int age;
	private boolean isMale;
	// kg
	private double weight;
	// cm
	private double height;
	// 1.2 Desk job with little exercise
	// 1.375 1-3 hrs/wk of light exercise
	// 1.55 3-5 hrs/wk of moderate exercise
	// 1.725 5-6 hrs/wk of strenuous exercise
	// 1.9 7-21 hrs/wk of strenuous exercise/work Very heavy exercise (twice per
	// day, extra heavy workouts)
	private double activityLevel;
	// String koito se zima ot padashtoto menu na stranica User Info.
	private int achievementPoints;
	private String workOutPlan;
	private String aim;


	@ManyToMany(cascade = { CascadeType.ALL })
	private Set<Day> days;

	public AppUser() {
		super();
	}

	public AppUser(String username, String password, String email, String firstName, String lastName, int age,
			boolean isMale) {
		this();
		setUsername(username);
		setPassword(password);
		setEmail(email);
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setIsMale(isMale);

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (username != null || username != "")
			this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password != null || password != "")
			this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null || email != "")
			this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName != null || firstName != "")
			this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName != null || lastName != "")
			this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}

	public boolean getIsMale() {
		return isMale;
	}

	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 0)
			this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 0)
			this.height = height;
	}

	public double getActivityLevel() {
		return activityLevel;
	}

	public void setActivityLevel(String activityLevelStirng) {
		switch (activityLevelStirng) {
		case "Rarely exercise":
			activityLevel = 1.2;
			break;
		case "Light exercise (1-3 hours)":
			activityLevel = 1.375;
			break;
		case "Moderate exercise (3-5 hours)":
			activityLevel = 1.55;
			break;
		case "Strenuous esercise  (5-6 hours)":
			activityLevel = 1.725;
			break;
		case "Strenuous esercise  (7-21 hours)":
			activityLevel = 1.9;
			break;
		default:
			activityLevel = 1.2;
			break;
		}

	}

	public int getAchievementPoints() {
		return achievementPoints;
	}

	public void setAchievementPoints(int achievementPoints) {
		if (achievementPoints >= 0 && achievementPoints <= MAX_ACHIEVEMENT_POINTS)
			this.achievementPoints = achievementPoints;
	}

	public String getWorkOutPlan() {
		return workOutPlan;
	}

	public void setWorkOutPlan(String workOutPlan) {
		if (workOutPlan != null && !workOutPlan.isEmpty())
			this.workOutPlan = workOutPlan;
	}

	public String getAim() {
		return aim;
	}

	public void setAim(String aim) {
		if (aim != null && !aim.isEmpty())
			this.aim = aim;
	}

	//dont know where to set this !
	
//	public void setMacros() {
//		setCallories();
//		setProtein(weight * 2.2);
//		if (aim == "Clean bulk") {
//			callories += 250;
//		} else if (aim == "Lose fat - 5%") {
//			callories *= 0.95;
//		} else if (aim == "Lose fat - 10%") {
//			callories *= 0.90;
//		} else if (aim == "Lose fat - 15%") {
//			callories *= 0.85;
//		} else if (aim == "Lose fat - 20%") {
//			callories *= 0.80;
//		} else if (aim == "Lose fat - 25%") {
//			callories *= 0.75;
//		}
//		setCarbohydrates(Math.round(((callories - protein * 4) / 3) / 2));
//		setFats(Math.round(((callories - protein * 4) / 3) / 9));
//	}

	@Override
	public String toString() {
		return "[username=" + username + ", password=" + password + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", isMale=" + isMale + ", weight=" + weight + ", height="
				+ height + ", activityLevel=" + activityLevel + ", achievementPoints=" + achievementPoints
				+ ", workOutPlan=" + workOutPlan + ", aim=" + aim + ", days=" + days + "]";
	}

}
