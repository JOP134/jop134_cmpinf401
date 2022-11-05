package jop134_MenuManager;

/**
 * Class MenuTester
 * 
 * @author Josh Paulovich
 * @created: 10/4/22
 */

public class MenuTester {

	public static void main(String[] args) {
		MenuRandomizer randomize = new MenuRandomizer("data/entrees.txt", "data/sides.txt", "data/salads.txt",
				"data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description());
	}

}
