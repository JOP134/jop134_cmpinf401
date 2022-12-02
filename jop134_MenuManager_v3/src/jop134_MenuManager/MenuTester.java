package jop134_MenuManager;

/**
 * Class MenuTester
 * 
 * @author Josh Paulovich
 * @created: 10/4/22
 */

public class MenuTester {

	public static void main(String[] args) {
		MenuManager m1 = new MenuManager("data\\dishes.txt");
		Menu myMenu = m1.randomMenu("Menu");
		System.out.print(myMenu.toString());
	}

}
