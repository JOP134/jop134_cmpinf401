package jop134_MenuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomizer {
	private ArrayList<Entree> entree;
	private ArrayList<Side> side;
	private ArrayList<Salad> salad;
	private ArrayList<Dessert> dessert;

	/**
	 * 
	 * @param entreeFile  entree file name String
	 * @param sideFile    side file name String
	 * @param saladFile   salad file name String
	 * @param dessertFile dessert file name String
	 */
	public MenuRandomizer(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		entree = FileManager.readEntrees(entreeFile);
		side = FileManager.readSides(sideFile);
		salad = FileManager.readSalads(saladFile);
		dessert = FileManager.readDesserts(dessertFile);
	}

	/**
	 * Sets random parts in a menu
	 * @return a random Menu
	 */
	public Menu randomMenu() {
		Menu randMenu = new Menu("Menu");
		randMenu.setEntree(entree.get((int) (entree.size() * Math.random())));
		randMenu.setSide(side.get((int) (side.size() * Math.random())));
		randMenu.setSalad(salad.get((int) (salad.size() * Math.random())));
		randMenu.setDessert(dessert.get((int) (dessert.size() * Math.random())));
		return randMenu;
	}

}
