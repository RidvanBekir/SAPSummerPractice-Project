package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//annotation
//foreign key to meal (many to 1 with Meal)
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double calories;
	private double proteins;
	private double fats;
	private double carbohydrates;
	
	public Course() {	
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && !name.isEmpty())
		this.name = name;
	}

	public double getCalories() {
		return calories;
	}

	//this logic shoud be in controller
	public void setCalories(double calories) {
		//get param for current user ?
//		AppUser u = new AppUser();
//		if(u.getIsMale()){
//			this.calories = (66 + 13.7*u.getWeight() + 5*u.getHeight() - 6.8*u.getAge())*u.getActivityLevel();
//		}else{
//			this.calories =(655 + 9.6*u.getWeight() + 1.8*u.getHeight() - 4.7*u.getAge())*u.getActivityLevel();
//		}
		if(calories>0)
			this.calories = calories;
	}

	public double getProteins() {
		return proteins;
	}

	public void setProteins(double proteins) {
		if(proteins>0)
		this.proteins = proteins;
	}

	public double getFats() {
		return fats;
	}

	public void setFats(double fats) {
		if(fats>0)
		this.fats = fats;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates) {
		if(carbohydrates>0)
		this.carbohydrates = carbohydrates;
	}
	
	

	
}
