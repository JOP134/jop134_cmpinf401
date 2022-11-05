package jop134_MenuManager;

/**
 * Class Dessert
 * 
 * @author Josh Paulovich Created 10/3/22
 */

public class Dessert {
	// Dessert variables
	private String dessertName;
	private String dessertDesc;
	private int dessertCalories;

	// Dessert Constructor
	public Dessert(String name, String desc, int calories) {
		dessertName = name;
		dessertDesc = desc;
		dessertCalories = calories;
	}

	// Constructor if dessert is null
	public Dessert() {
		dessertName = "N/A";
		dessertDesc = "";
		dessertCalories = 0;
	}

	// Dessert name getter
	public String getName() {
		return dessertName;
	}

	// Dessert description getter
	public String getDesc() {
		return dessertDesc;
	}

	// Dessert calories getter
	public int getCalories() {
		return dessertCalories;
	}

	// dessert name setter
	public void setName(String name) {
		dessertName = name;
	}

	// dessert description setter
	public void setDesc(String desc) {
		dessertDesc = desc;
	}

	// dessert calories setter
	public void setCalories(int cals) {
		dessertCalories = cals;
	}
}
