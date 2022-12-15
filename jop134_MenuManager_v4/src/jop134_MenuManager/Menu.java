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
			entree = null;
		if (side != null)
			side = s;
		else
			side = null;
	}

	// Menu Constructor (menu name, entree, side, salad, and dessert
	public Menu(String name, Entree e, Side s, Salad sa, Dessert d) {
		menuName = name;
		if (e != null)
			entree = e;
		else
			entree = null;
		if (s != null)
			side = s;
		else
			side = null;
		if (sa != null)
			salad = sa;
		else
			salad = null;
		if (d != null)
			dessert = d;
		else
			dessert = null;
	}

	// Return the total calories of menu
	public int totalCalories() {
		int cals = 0;
		if (entree != null)
			cals += entree.getCals();
		if (side != null)
			cals += side.getCals();
		if (salad != null)
			cals += salad.getCals();
		if (dessert != null)
			cals += dessert.getCals();
		return cals;
	}

	// Return the total calories of menu
	public double totalPrice() {
		double price = 0;
		if (entree != null)
			price += entree.getPrice();
		if (side != null)
			price += side.getPrice();
		if (salad != null)
			price += salad.getPrice();
		if (dessert != null)
			price += dessert.getPrice();
		return price;
	}

	// Returns the descriptions of the menu parts
	@Override
	public String toString() {
		String eDesc = "";
		String siDesc = "";
		String saDesc = "";
		String dDesc = "";
		if (entree != null)
			eDesc = "Entree) " + entree.getName() + ": " + entree.getDesc() + "\n";
		if (side != null)
			siDesc = "Side) " + side.getName() + ": " + side.getDesc() + "\n";
		if (salad != null)
			saDesc = "Salad) " + salad.getName() + ": " + salad.getDesc() + "\n";
		if (dessert != null)
			dDesc = "Dessert) " + dessert.getName() + ": " + dessert.getDesc() + "\n";
		return menuName + "\n" + eDesc + siDesc + saDesc + dDesc + "Calories: " + totalCalories() + "\nPrice: $"
				+ totalPrice() + "\n\n";
	}

	// Dessert getter
	public Dessert getDessert() {
		return dessert;
	}

	// Entree Getter
	public Entree getEntree() {
		return entree;
	}

	// Side Getter
	public Side getSide() {
		return side;
	}

	// Salad Getter
	public Salad getSalad() {
		return salad;
	}

	// Dessert getter
	public Dessert setDessert(Dessert d) {
		return dessert = d;
	}

	// Entree Setter
	public Entree setEntree(Entree e) {
		return entree = e;
	}

	// Side Getter
	public Side setSide(Side s) {
		return side = s;
	}

	// Salad Getter
	public Salad setSalad(Salad s) {
		return salad = s;
	}
}
