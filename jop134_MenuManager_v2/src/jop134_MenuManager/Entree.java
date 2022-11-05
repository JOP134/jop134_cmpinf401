package jop134_MenuManager;

/**
 * Class Entree
 * 
 * @author Josh Paulovich Created 11/4/22
 */

public class Entree {
	// Entree Variables
	private String entreeName;
	private String entreeDesc;
	private int entreeCalories;

	// Entree constructor
	public Entree(String name, String desc, int calories) {
		entreeName = name;
		entreeDesc = desc;
		entreeCalories = calories;
	}

	public Entree() {
		entreeName = "N/A";
		entreeDesc = "";
		entreeCalories = 0;
	}

	// Entree name getter
	public String getName() {
		return entreeName;
	}

	// Entree description getter
	public String getDesc() {
		return entreeDesc;
	}

	// Entree calories getter
	public int getCalories() {
		return entreeCalories;
	}

	// Entree name setter
	public void setName(String name) {
		entreeName = name;
	}

	// Entree description setter
	public void setDesc(String desc) {
		entreeDesc = desc;
	}

	// Entree calories setter
	public void setCalories(int cals) {
		entreeCalories = cals;
	}
}
