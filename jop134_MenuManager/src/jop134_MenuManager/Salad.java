package jop134_MenuManager;

/**
 * Class Salad
 * 
 * @author Josh Paulovich Created 10/3/22
 */

public class Salad {
	// Salad variables
	private String saladName;
	private String saladDesc;
	private int saladCalories;

	// Salad constructor
	public Salad(String name, String desc, int calories) {
		saladName = name;
		saladDesc = desc;
		saladCalories = calories;
	}

	// Constructor if salad is null
	public Salad() {
		saladName = "N/A";
		saladDesc = "";
		saladCalories = 0;
	}

	// Salad name getter
	public String getName() {
		return saladName;
	}

	// Salad description getter
	public String getDesc() {
		return saladDesc;
	}

	// Salad calories getter
	public int getCalories() {
		return saladCalories;
	}

	// salad name setter
	public void setName(String name) {
		saladName = name;
	}

	// salad description setter
	public void setDesc(String desc) {
		saladDesc = desc;
	}

	// salad calories setter
	public void setCalories(int cals) {
		saladCalories = cals;
	}
}
