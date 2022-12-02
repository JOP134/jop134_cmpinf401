package jop134_MenuManager;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Random;

public class MenuManager {

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	// Entree Getter
	public ArrayList<Entree> getEntree() {
		return entrees;
	}

	// Entree Setter
	public void setEntree(ArrayList<Entree> entree) {
		this.entrees = entree;
	}

	// Side Getter
	public ArrayList<Side> getSides() {
		return sides;
	}

	// Side Setter
	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	// Salad Getter
	public ArrayList<Salad> getSalads() {
		return salads;
	}

	// Salad Setter
	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	// Desserts Getter
	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	// Desserts Setter
	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}

	// Constructor
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> items = FileManager.readItems(dishesFile);
		ArrayList<Entree> entrees = new ArrayList<Entree>();
		ArrayList<Side> sides = new ArrayList<Side>();
		ArrayList<Salad> salads = new ArrayList<Salad>();
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		for (MenuItem item : items) {
			if (item instanceof Entree) {
				entrees.add(new Entree(item.getName(), item.getDesc(), item.getCals(), item.getPrice()));
			} else if (item instanceof Side) {
				sides.add(new Side(item.getName(), item.getDesc(), item.getCals(), item.getPrice()));
			} else if (item instanceof Salad) {
				salads.add(new Salad(item.getName(), item.getDesc(), item.getCals(), item.getPrice()));
			} else if (item instanceof Dessert) {
				desserts.add(new Dessert(item.getName(), item.getDesc(), item.getCals(), item.getPrice()));
			}
		}
		this.entrees = entrees;
		this.sides = sides;
		this.desserts = desserts;
		this.salads = salads;
	}

	// Random Menu
	public Menu randomMenu(String name) {
		Random rand = new Random();
		int randEntree = rand.nextInt(entrees.size());
		Entree randomEntree = entrees.get(randEntree);
		int randSide = rand.nextInt(sides.size());
		Side randomSide = sides.get(randSide);
		int randSalad = rand.nextInt(salads.size());
		Salad randomSalad = salads.get(randSalad);
		int randDessert = rand.nextInt(desserts.size());
		Dessert randomDessert = desserts.get(randDessert);
		return new Menu("Menu", randomEntree, randomSide, randomSalad, randomDessert);
	}
}
