package model;

import java.util.List;
import java.util.Date;

public class DiaryEntry {
	private Meal First;
	private Meal Second;
	private Meal Third;
	public static Day Date;
	private Meal snacks;
	public int waterQty;
	
	private List<Day> days;
	
	public static Date getDay(Day date) {
		java.util.Date Day = new java.util.Date();
		return Day;
	}
	public void update() {
		
	}
	public Meal getMeal(int meal) {
		Meal.computeTotals();
		return null;
	}
}
