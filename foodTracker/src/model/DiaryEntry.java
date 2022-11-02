package model;

public class DiaryEntry {
  private Meal First;
	private Meal Second;
	private Meal Third;
	private Day Date;
	private Meal snack;
	public int waterQty;
	
	private List<Day> days;
	
	public Day getDay(String date) {
		return null;
	}
	//1 = First, 2 = Second, 3 = Third, 4 = Snack
	public void update(int meal) {
		
	}
	public Meal getMeal(int meal) {
		Meal.computeTotals();
		return null;
	}
}
