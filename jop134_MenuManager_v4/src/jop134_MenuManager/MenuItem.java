package jop134_MenuManager;

public class MenuItem {
	private String name;
	private int cals;
	private String desc;
	private double price;

	// Menu Item Constructor
	public MenuItem(String n, String d, int c, double p) {
		name = n;
		desc = d;
		cals = c;
		price = p;
	}

	// Name Getter
	public String getName() {
		return name;
	}

	// Calorie Getter
	public int getCals() {
		return cals;
	}

	// Description Getter
	public String getDesc() {
		return desc;
	}

	// Price Getter
	public double getPrice() {
		return price;
	}

	// Name Setter
	public void setName(String n) {
		name = n;
	}

	// Calorie setter
	public void setCals(int c) {
		cals = c;
	}

	// Description Setter
	public void setDesc(String d) {
		desc = d;
	}

	// Price setter
	public void setPrice(double p) {
		price = p;
	}

	@Override
	public String toString() {
		return name;
	}
}
