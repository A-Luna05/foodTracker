package model;

public class Water {
	public int water;
	
	public void addWater(int oz) {
		water += oz;
		DiaryEntry.updateWater(water);
	}	
}
