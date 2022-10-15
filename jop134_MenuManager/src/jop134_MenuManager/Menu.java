package jop134_MenuManager;

/**
 * Class Menu
 * 
 * @author Josh Paulovich Created 10/3/22
 */

public class Menu {
	// Parts of menu
	private String menuName;
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;

	// Menu Constructor (menu name only)
	public Menu(String name) {
		menuName = name;
		entree = null;
		side = null;
		salad = null;
		dessert = null;
	}

	// Menu Constructor(menu name, entree, and side)
	public Menu(String name, Entree e, Side s) {
		menuName = name;
		if (e != null)
			entree = e;
		else
			entree = new Entree();
		if (side != null)
			side = s;
		else
			side = new Side();
	}

	// Menu Constructor (menu name, entree, side, salad, and dessert
	public Menu(String name, Entree e, Side s, Salad sa, Dessert d) {
		menuName = name;
		if (e != null)
			entree = e;
		else
			entree = new Entree();
		if (s != null)
			side = s;
		else
			side = new Side();
		if (sa != null)
			salad = sa;
		else
			salad = new Salad();
		if (d != null)
			dessert = d;
		else
			dessert = new Dessert();
	}

	// Return the total calories of menu
	public int totalCalories() {
		int cals = 0;
		cals += entree.getCalories();
		cals += side.getCalories();
		cals += salad.getCalories();
		cals += dessert.getCalories();
		return cals;
	}

	// Returns the descriptions of the menu parts
	public String description() {
		String eDesc = "";
		String siDesc = "";
		String saDesc = "";
		String dDesc = "";
		eDesc = "Entree) " + entree.getName() + ": " + entree.getDesc() + "\n";
		siDesc = "Side) " + side.getName() + ": " + side.getDesc() + "\n";
		saDesc = "Salad) " + salad.getName() + ": " + salad.getDesc() + "\n";
		dDesc = "Dessert) " + dessert.getName() + ": " + dessert.getDesc() + "\n";
		return menuName + "\n" + eDesc + siDesc + saDesc + dDesc + "Calories: " + totalCalories() + "\n\n";
	}
}
