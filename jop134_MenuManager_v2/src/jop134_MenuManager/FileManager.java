package jop134_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
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
	 * @param fileName entree file name String
	 * @return Entree
	 */
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entrees = new ArrayList<Entree>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				String[] theLine = line.split("@@");
				int calories = Integer.parseInt(theLine[2]);
				Entree e1 = new Entree(theLine[0], theLine[1], calories);
				entrees.add(e1);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return entrees;
	}

	/**
	 * 
	 * @param fileName Side file name
	 * @return Side
	 */
	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sides = new ArrayList<Side>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				String[] theLine = line.split("@@");
				int calories = Integer.parseInt(theLine[2]);
				Side s1 = new Side(theLine[0], theLine[1], calories);
				sides.add(s1);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sides;
	}

	/**
	 * 
	 * @param fileName Salad file name
	 * @return Salad
	 */
	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> salads = new ArrayList<Salad>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				String[] theLine = line.split("@@");
				int calories = Integer.parseInt(theLine[2]);
				Salad s1 = new Salad(theLine[0], theLine[1], calories);
				salads.add(s1);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return salads;
	}

	/**
	 * 
	 * @param fileName Dessert file name
	 * @return Dessert
	 */
	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				String[] theLine = line.split("@@");
				int calories = Integer.parseInt(theLine[2]);
				Dessert d1 = new Dessert(theLine[0], theLine[1], calories);
				desserts.add(d1);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return desserts;
	}
}
