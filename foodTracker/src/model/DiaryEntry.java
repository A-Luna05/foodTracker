package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiaryEntry {
  	private Meal Breakfast;
	private Meal Lunch;
	private Meal Dinner;
	private Date Day;
	private Meal snack;
	public int waterQty;
	
	public Date getDay(String date) {
		return Day;
	}
	
	public DiaryEntry() {
		List<Food> empty = new ArrayList<Food>();
		this.Breakfast = new Meal(0,empty);
		this.Lunch = new Meal(0,empty);
		this.Dinner = new Meal(0,empty);
		this.snack = new Meal(0,empty);
		this.Day = new java.util.Date();
	}
	//1 = Breakfast, 2 = Lunch, 3 = Dinner, 4 = Snack
	public void update(int meal, Food fooditem) {
		if(meal == 1){
			Breakfast.addFood(fooditem);
			}
		if(meal == 2){
			Lunch.addFood(fooditem);
			}
		if(meal == 3){
			Dinner.addFood(fooditem);
			}
		if(meal == 4){
			snack.addFood(fooditem);
			}
	}
	
	public void updateWater(int water) {
		this.waterQty += water;
	}
	
	public ArrayList<Integer> getMeal(int meal) {
		if(meal == 1){
			return Breakfast.computeTotals();
			}
		if(meal == 2){
			return Lunch.computeTotals();
			}
		if(meal == 3){
			return Dinner.computeTotals();
			}
		if(meal == 4){
			return snack.computeTotals();
			}
		//shouldn't be called
		return null;
	}
}
