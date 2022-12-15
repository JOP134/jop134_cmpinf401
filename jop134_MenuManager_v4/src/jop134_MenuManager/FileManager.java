package jop134_MenuManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 * Class File Manager
 * 
 * @author Josh Paulovich Created 10/3/22
 */

public class FileManager {

	/**
	 * 
	 * @param fileName dish file name String
	 * @return Dish
	 */
	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			Entree entree = null;
			Side side = null;
			Salad salad = null;
			Dessert dessert = null;
			String str;
			while ((str = br.readLine()) != null) {
				String[] name = str.split("@@");
				if (name[1].equalsIgnoreCase("Entree")) {
					entree = new Entree(name[0], name[2], Integer.parseInt(name[3]), Double.parseDouble(name[4]));
					menuItems.add(entree);
				} else if (name[1].equalsIgnoreCase("Side")) {
					side = new Side(name[0], name[2], Integer.parseInt(name[3]), Double.parseDouble(name[4]));
					menuItems.add(side);
				} else if (name[1].equalsIgnoreCase("Salad")) {
					salad = new Salad(name[0], name[2], Integer.parseInt(name[3]), Double.parseDouble(name[4]));
					menuItems.add(salad);
				} else if (name[1].equalsIgnoreCase("Dessert")) {
					dessert = new Dessert(name[0], name[2], Integer.parseInt(name[3]), Double.parseDouble(name[4]));
					menuItems.add(dessert);
				}
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return menuItems;
	}

	/**
	 * 
	 * @param fileName
	 * @param menus
	 */
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < menus.size(); i++) {
				Menu menu1 = menus.get(i);
				bw.write(menu1.toString());
				bw.newLine();
			}
			System.out.println(bw);
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
