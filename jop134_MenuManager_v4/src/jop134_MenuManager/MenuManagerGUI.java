package jop134_MenuManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/*
 * Josh Paulovich
 * 12/15/21
 * 
 */
public class MenuManagerGUI {
	// GUI Properties
	private ArrayList<Menu> menus = new ArrayList<>();
	private JComboBox entreeJCBox, sideJCBox, saladJCBox, dessertJCBox;
	private int entreesI, sidesI, saladsI, dessertsI;
	private String txtAreaAll = "";
	private JTextArea txtArea;
	private JFrame frm2;
	private JTextField priceTxt = new JTextField();
	private JTextArea entreeTxtArea = new JTextArea();
	private JTextArea sideTxtArea = new JTextArea();
	private JTextArea saladTxtArea = new JTextArea();
	private JTextArea dessertTxtArea = new JTextArea();
	private JTextField caloriesTxt = new JTextField();
	private JFrame frame;

	/*
	 * Initializing/Creating the GUI Properties
	 */
	public MenuManagerGUI() {
		// Setup Menu
		MenuManager m1 = new MenuManager("data//dishes.txt");
		frame = new JFrame("Menu Manager");
		frame.setBounds(400, 150, 800, 600);
		frame.getContentPane().setLayout(null);
		JPanel panel1 = new JPanel();
		panel1.setBounds(35, 40, 345, 220);
		panel1.setBorder(BorderFactory.createTitledBorder("Build your own Menu"));
		frame.getContentPane().add(panel1);
		JPanel panel = new JPanel();
		panel.setBounds(35, 300, 345, 220);
		panel1.setLayout(null);

		// Entree label
		JLabel entreeLbl = new JLabel("Entree");
		entreeLbl.setBounds(10, 26, 55, 20);
		panel1.add(entreeLbl);

		// Side label
		JLabel sideLbl = new JLabel("Side");
		sideLbl.setBounds(10, 59, 32, 29);
		panel1.add(sideLbl);

		// Salad label
		JLabel saladLbl = new JLabel("Salad");
		saladLbl.setBounds(10, 93, 32, 23);
		panel1.add(saladLbl);

		// Dessert label
		JLabel dessertLbl = new JLabel("Dessert");
		dessertLbl.setBounds(10, 130, 45, 15);
		panel1.add(dessertLbl);

		// Entree box
		ArrayList<Entree> entrees = new ArrayList<Entree>(m1.getEntree());
		String[] entreeList = new String[entrees.size() + 1];
		entreeList[0] = "None";
		for (int x = 0; x < entrees.size(); x++)
			entreeList[x + 1] = entrees.get(x).getName();
		entreeJCBox = new JComboBox(entreeList);
		entreeJCBox.setBounds(65, 25, 270, 25);
		panel1.add(entreeJCBox);
		entreeTxtArea.setText("None");
		entreeJCBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox jcb = (JComboBox) e.getSource();
				entreesI = jcb.getSelectedIndex();
			}
		});

		// Side box
		ArrayList<Side> sides = new ArrayList<Side>(m1.getSides());
		String[] sidesList = new String[sides.size() + 1];
		sidesList[0] = "None";
		for (int i = 0; i < sides.size(); i++)
			sidesList[i + 1] = sides.get(i).getName();
		sideJCBox = new JComboBox(sidesList);
		sideJCBox.setBounds(65, 61, 270, 25);
		panel1.add(sideJCBox);
		sideTxtArea.setText("None");
		sideJCBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				sidesI = cb.getSelectedIndex();

			}
		});

		// Salad box
		ArrayList<Salad> salads = new ArrayList<Salad>(m1.getSalads());
		String[] saladsList = new String[salads.size() + 1];
		saladsList[0] = "None";
		for (int i = 0; i < salads.size(); i++)
			saladsList[i + 1] = salads.get(i).getName();
		saladJCBox = new JComboBox(saladsList);
		saladJCBox.setBounds(65, 93, 270, 25);
		panel1.add(saladJCBox);
		saladTxtArea.setText("None");
		saladJCBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox jcb = (JComboBox) e.getSource();
				saladsI = jcb.getSelectedIndex();
			}
		});

		// Dessert box
		ArrayList<Dessert> desserts = new ArrayList<Dessert>(m1.getDesserts());
		String[] dessertsList = new String[desserts.size() + 1];
		dessertsList[0] = "None";
		for (int i = 0; i < desserts.size(); i++)
			dessertsList[i + 1] = desserts.get(i).getName();
		dessertJCBox = new JComboBox(dessertsList);
		dessertJCBox.setBounds(65, 126, 270, 25);
		panel1.add(dessertJCBox);
		dessertTxtArea.setText("None");
		dessertJCBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				dessertsI = cb.getSelectedIndex();
			}
		});

		// Create Menu with selected dishes
		JButton createBtn = new JButton("Create Menu with these dishes");
		createBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String menuName = JOptionPane.showInputDialog("Please enter the menu name");
				String txt = menuName + "\n";
				txtAreaAll += txt;
				txtArea.setText(txtAreaAll);
				if (entreesI == 0) {
					entreeTxtArea.setText("Entree: None");
				} else {
					entreeTxtArea
							.setText(entrees.get(entreesI - 1).getName() + "\n" + entrees.get(entreesI - 1).getDesc()
									+ "\n" + "Calories: " + String.valueOf(entrees.get(entreesI - 1).getCals()) + "\n"
									+ "Price: $" + String.valueOf(entrees.get(entreesI - 1).getPrice()));
				}
				if (sidesI == 0) {
					sideTxtArea.setText("Side: None");
				} else {
					sideTxtArea.setText(sides.get(sidesI - 1).getName() + "\n" + sides.get(sidesI - 1).getDesc() + "\n"
							+ "Calories: " + String.valueOf(sides.get(sidesI - 1).getCals()) + "\n" + "Price: $"
							+ String.valueOf(sides.get(sidesI - 1).getPrice()));
				}

				if (saladsI == 0) {
					saladTxtArea.setText("Salad: None");
				} else {
					saladTxtArea.setText(salads.get(saladsI - 1).getName() + "\n" + salads.get(saladsI - 1).getDesc()
							+ "\n" + "Calories: " + String.valueOf(salads.get(saladsI - 1).getCals()) + "\n"
							+ "Price: $" + String.valueOf(salads.get(saladsI - 1).getPrice()));
				}
				if (dessertsI == 0) {
					dessertTxtArea.setText("Dessert: None");
				} else {
					dessertTxtArea.setText(
							desserts.get(dessertsI - 1).getName() + "\n" + desserts.get(dessertsI - 1).getDesc() + "\n"
									+ "Calories: " + String.valueOf(desserts.get(dessertsI - 1).getCals()) + "\n"
									+ "Price: $" + String.valueOf(desserts.get(dessertsI - 1).getPrice()));
				}

				priceTxt.setText(String.valueOf((entreesI == 0 ? 0 : entrees.get(entreesI - 1).getPrice())
						+ (sidesI == 0 ? 0 : sides.get(sidesI - 1).getPrice())
						+ (saladsI == 0 ? 0 : salads.get(saladsI - 1).getPrice())
						+ (dessertsI == 0 ? 0 : desserts.get(dessertsI - 1).getPrice())));

				caloriesTxt.setText(String.valueOf((entreesI == 0 ? 0 : entrees.get(entreesI - 1).getCals())
						+ (sidesI == 0 ? 0 : sides.get(sidesI - 1).getCals())
						+ (saladsI == 0 ? 0 : salads.get(saladsI - 1).getCals())
						+ (dessertsI == 0 ? 0 : desserts.get(dessertsI - 1).getCals())));

				// Save the menu to the file
				if ((entreesI * sidesI * saladsI * dessertsI) != 0) {
					menus.add(new Menu(menuName, entrees.get(entreesI - 1), sides.get(sidesI - 1),
							salads.get(saladsI - 1), desserts.get(dessertsI - 1)));
				}
			}
		});
		createBtn.setBounds(65, 180, 220, 25);
		panel1.add(createBtn);

		// Second Panel
		panel.setBorder(BorderFactory.createTitledBorder("Or generate a Menu"));
		frame.getContentPane().add(panel);

		// Create the Random Menu
		JButton randomButton = new JButton("Generate a Random Menu");
		randomButton.setBounds(58, 55, 245, 24);
		randomButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String menuName = JOptionPane.showInputDialog("Please type the menu name");
				String txt = menuName;
				txtAreaAll += txt + "\n";
				txtArea.setText(txtAreaAll);
				Menu randomMenu = m1.randomMenu(menuName);

				entreeTxtArea.setText(randomMenu.getEntree().getName() + "\n" + randomMenu.getEntree().getDesc() + "\n"
						+ "Calories: " + String.valueOf(randomMenu.getEntree().getCals()) + "\n" + "Price: $"
						+ String.valueOf(randomMenu.getEntree().getPrice()));

				sideTxtArea.setText(randomMenu.getSide().getName() + "\n" + randomMenu.getSide().getDesc() + "\n"
						+ "Calories: " + String.valueOf(randomMenu.getSide().getCals()) + "\n" + "Price: $"
						+ String.valueOf(randomMenu.getSide().getPrice()));

				saladTxtArea.setText(randomMenu.getSalad().getName() + "\n" + randomMenu.getSalad().getDesc() + "\n"
						+ "Calories: " + String.valueOf(randomMenu.getSalad().getCals()) + "\n" + "Price: $"
						+ String.valueOf(randomMenu.getSalad().getPrice()));

				dessertTxtArea.setText(randomMenu.getDessert().getName() + "\n" + randomMenu.getDessert().getDesc()
						+ "\n" + "Calories: " + String.valueOf(randomMenu.getDessert().getCals()) + "\n" + "Price: $"
						+ String.valueOf(randomMenu.getDessert().getPrice()));

				priceTxt.setText(String.valueOf(randomMenu.getEntree().getPrice() + randomMenu.getSide().getPrice()
						+ randomMenu.getSalad().getPrice() + randomMenu.getDessert().getPrice()));

				caloriesTxt.setText(String.valueOf(randomMenu.getEntree().getCals() + randomMenu.getSide().getCals()
						+ randomMenu.getSalad().getCals() + randomMenu.getDessert().getCals()));

				menus.add(new Menu("Random pick menu", randomMenu.getEntree(), randomMenu.getSide(),
						randomMenu.getSalad(), randomMenu.getDessert()));

			}
		});
		panel.add(randomButton);
		JLabel menuLabel = new JLabel("Your Menus:");
		menuLabel.setBounds(425, 40, 90, 15);
		frame.getContentPane().add(menuLabel);

		// Create Text area
		txtArea = new JTextArea();
		txtArea.setBounds(425, 60, 325, 415);
		frame.getContentPane().add(txtArea);

		// Create Details button
		JButton detailsButton = new JButton("Details");
		detailsButton.setBounds(420, 497, 95, 25);
		detailsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frm2.setVisible(true);
			}
		});
		frame.getContentPane().add(detailsButton);

		// Delete all button
		JButton deleteButton = new JButton("Delete All");
		deleteButton.setBounds(532, 497, 98, 25);
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText("");
				menus.clear();
				txtAreaAll = "";
			}
		});
		frame.getContentPane().add(deleteButton);

		// Save to file button
		JButton saveButton = new JButton("Save to File");
		saveButton.setBounds(640, 495, 110, 25);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileManager.writeMenu("data/menus.txt", menus);
			}
		});
		frame.getContentPane().add(saveButton);
		panel.setLayout(null);

		// Details Window
		frm2 = new JFrame("My Menu");
		frm2.setBounds(400, 150, 700, 600);
		frm2.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Entree");
		lblNewLabel.setBounds(50, 72, 74, 42);
		frm2.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Side");
		lblNewLabel_1.setBounds(50, 171, 67, 42);
		frm2.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Salad");
		lblNewLabel_2.setBounds(50, 261, 91, 43);
		frm2.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Dessert");
		lblNewLabel_3.setBounds(50, 340, 82, 43);
		frm2.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Total calories:");
		lblNewLabel_4.setBounds(50, 440, 104, 43);
		frm2.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Total price: $");
		lblNewLabel_5.setBounds(50, 494, 104, 34);
		frm2.getContentPane().add(lblNewLabel_5);

		// Display Entree Details
		JScrollPane entreeScroll = new JScrollPane(entreeTxtArea);
		entreeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		entreeScroll.setBounds(150, 60, 525, 73);
		frm2.getContentPane().add(entreeScroll);

		// Side Details
		JScrollPane sideScroll = new JScrollPane(sideTxtArea);
		sideScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sideScroll.setBounds(150, 150, 525, 73);
		frm2.getContentPane().add(sideScroll);

		// Salad Details
		JScrollPane saladScroll = new JScrollPane(saladTxtArea);
		saladScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		saladScroll.setBounds(150, 248, 525, 73);
		frm2.getContentPane().add(saladScroll);

		// Dessert Details
		JScrollPane dessertScroll = new JScrollPane(dessertTxtArea);
		dessertScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		dessertScroll.setBounds(150, 340, 525, 73);
		frm2.getContentPane().add(dessertScroll);

		priceTxt = new JTextField();
		priceTxt.setBackground(new Color(255, 255, 255));
		priceTxt.setBounds(150, 501, 66, 21);
		frm2.getContentPane().add(priceTxt);
		priceTxt.setColumns(10);

		caloriesTxt = new JTextField();
		caloriesTxt.setBackground(new Color(255, 255, 255));
		caloriesTxt.setBounds(150, 451, 66, 21);
		frm2.getContentPane().add(caloriesTxt);
		caloriesTxt.setColumns(10);

	}

	/*
	 * Running the Menu
	 */
	public static void main(String args[]) {
		// Create and display the form
		new MenuManagerGUI().frame.setVisible(true);

	}
}