package model;

public class DiaryEntry {
  	private Meal Breakfast;
	private Meal Lunch;
	private Meal Dinner;
	private Day Date;
	private Meal snack;
	public int waterQty;
	
	private List<Day> days;
	
	public Day getDay(String date) {
		return null;
	}
	//1 = Breakfast, 2 = Lunch, 3 = Dinner, 4 = Snack
	public void update(int meal, Food fooditem) {
		if(meal == 1){
			Lunch.add(fooditem)
			}
		if(meal == 2){
			Lunch.add(fooditem)
			}
		if(meal == 3){
			Dinner.add(fooditem)
			}
		if(meal == 4){
			snack.add(fooditem)
			}
	}
	
	public void updateWater(int water) {
		Water.add(waterQty);
	}
	
	public Meal getMeal(int meal) {
		Meal.computeTotals();
		return null;
	}
}
