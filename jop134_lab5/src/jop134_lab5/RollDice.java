package jop134_lab5;

import java.util.Random;

public class RollDice {
	public static void rollDice(int roll, Random r) {
		int upper = 7, lower = 1;
		int two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0,
				twelve = 0;

		// Generate value
		for (int x = roll; x > 0; x--) {
			int value = r.nextInt(upper - lower) + lower;
			value += r.nextInt(upper - lower) + lower;

			// Count each number
			switch (value) {
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			case 7:
				seven++;
				break;
			case 8:
				eight++;
				break;
			case 9:
				nine++;
				break;
			case 10:
				ten++;
				break;
			case 11:
				eleven++;
				break;
			case 12:
				twelve++;
				break;
			}
		}
		//Output fraction out of all rolls
		System.out.println("Twos: " + two + "/" + roll);
		System.out.println("Threes: " + three + "/" + roll);
		System.out.println("Fours: " + four + "/" + roll);
		System.out.println("Fives: " + five + "/" + roll);
		System.out.println("Sixes: " + six + "/" + roll);
		System.out.println("Sevens: " + seven + "/" + roll);
		System.out.println("Eights: " + eight + "/" + roll);
		System.out.println("Nines: " + nine + "/" + roll);
		System.out.println("Tens: " + ten + "/" + roll);
		System.out.println("Elevens: " + eleven + "/" + roll);
		System.out.println("Twelves: " + twelve + "/" + roll);
		
	}

}
