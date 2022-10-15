package jop134_MenuManager;

/**
 * Class Menu
 * 
 * @author Josh Paulovich Created 10/3/22
 */

public class MenuTest {
	public static void main(String[] args) {
		// Creating menus and foods
		// entrees
		Entree steak = new Entree("Steak", "A delicious piece of 1/2 a pound meat grilled and seasoned. ", 700);
		Entree burger = new Entree("Burger", "A tasty hamburger topped with cheese, ketchup, and pickle.", 650);

		// sides
		Side fries = new Side("Fries", "Declicious steak-cut fries, seasoned and served with house sauce.", 350);

		// salads
		Salad chickenSalad = new Salad("Chicken Salad",
				"Romaine lettuce topped with our house-made chicken," + " peppers, egg, and mayo.", 110);
		Salad caesarSalad = new Salad("Caesar Salad",
				"Romaine lettuce topped with vinegar, croutons, lemon" + " juice, cheese, and egg.", 95);

		// desserts
		Dessert cake = new Dessert("Chocolate Cake", "A wonderful cake baked with cocoa powder, covered in "
				+ "chocolate syrup, topped with a scoop of vanilla ice cream.", 800);

		// menus
		Menu menu1 = new Menu("Fridays Menu", steak, fries, caesarSalad, cake);
		Menu menu2 = new Menu("Mondays Menu", burger, null, chickenSalad, null);

		// Outputting menus
		System.out.print(menu1.description());
		System.out.print(menu2.description());

	}

}
