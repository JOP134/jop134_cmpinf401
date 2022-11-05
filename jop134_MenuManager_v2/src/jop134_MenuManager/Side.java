package jop134_MenuManager;

/**
 * Class Side
 * 
 * @author Josh Paulovich Created 10/3/22
 */

public class Side {
	// Side variables
	private String sideName;
	private String sideDesc;
	private int sideCalories;

	// Side constructor
	Side(String name, String desc, int calories) {
		sideName = name;
		sideDesc = desc;
		sideCalories = calories;
	}

	// Constructor if side is null
	public Side() {
		sideName = "N/A";
		sideDesc = "";
		sideCalories = 0;
	}

	// Side name getter
	public String getName() {
		return sideName;
	}

	// Side description getter
	public String getDesc() {
		return sideDesc;
	}

	// Side calories getter
	public int getCalories() {
		return sideCalories;
	}

	// side name setter
	public void setName(String name) {
		sideName = name;
	}

	// side description setter
	public void setDesc(String desc) {
		sideDesc = desc;
	}

	// side calories setter
	public void setCalories(int cals) {
		sideCalories = cals;
	}
}
