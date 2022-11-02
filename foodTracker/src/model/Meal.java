package model;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private int time;
	private String type;
	private List<Food> foodList; 
	private int mealCalories;
	private int mealFats;
	private int mealCarbs;
	private int mealProtein;
	
	/*It's possible to not have to pass foodList as an argument, but at this stage I'm not sure*/
	
	public Meal(int time, String type, List<Food> foodList) {
		ArrayList<Integer> mealTotals 	= computeTotals(this);
		this.time 						= time;
		this.type 						= type;
		this.foodList 					= foodList;
		this.mealCalories 				= mealTotals.get(0);
		this.mealFats					= mealTotals.get(1);
		this.mealCarbs					= mealTotals.get(2);
		this.mealProtein				= mealTotals.get(3);
	}
	
	/*This method allows us to compute all the totals in one function, but */
	
	private ArrayList<Integer> computeTotals(Meal meal) {
		ArrayList<Integer> mealTotals = new ArrayList<Integer>();
		int mealCalories 	= 0;
		int mealFats 		= 0;
		int mealCarbs 		= 0;
		int mealProtein 	= 0;
		
		for (Food food : meal.foodList) {
			mealCalories = 	mealCalories + food.calories;
			mealFats = 		mealFats + food.fats;
			mealCarbs = 	mealCarbs + food.carbs;
			mealProtein = 	mealProtein + food.protein;
		}
		
		mealTotals.add(0, mealCalories);
		mealTotals.add(1, mealFats);
		mealTotals.add(2, mealCarbs);
		mealTotals.add(3, mealProtein);
		
		return mealTotals;
	}
	
	
	private void addFood(Meal meal, Food food) 
		{meal.foodList.add(food);}
	
	
	private void removeFood(Meal meal, Food food) 
		{meal.foodList.remove(food);}
}
