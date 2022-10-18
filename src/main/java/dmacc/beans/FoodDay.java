package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
@Entity
public class FoodDay {
	@Id
	@GeneratedValue
	private long id;
	private String dayName;
	private String breakfast;
	private String lunch;
	private String dinner;
	private int dayCalories;

	public FoodDay() {
		// TODO Auto-generated constructor stub
	}
	public FoodDay(String dayName, String breakfast, String lunch, String dinner, int dayCalories) {
		setDayName(dayName);
		setBreakfast(breakfast);
		setLunch(lunch);
		setDinner(dinner);
		setDayCalories(dayCalories);
	}

	
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	public int getDayCalories() {
		return dayCalories;
	}
	public void setDayCalories(int dayCalories) {
		this.dayCalories = dayCalories;
	}
	
	@Override
	public String toString() {
		return "FoodDay [id=" + id + ", dayName=" + dayName + ", breakfast=" + breakfast + ", lunch=" + lunch
				+ ", dinner=" + dinner + ", dayCalories=" + dayCalories + "]";
	}
 
	
	
}
