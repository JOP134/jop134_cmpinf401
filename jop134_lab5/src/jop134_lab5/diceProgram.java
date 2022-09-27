package jop134_lab5;
import java.util.*;
public class diceProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rolls;
		
		// Prompt for rolls and roll
		do {
			System.out.print("How many rolls (0 to quit): ");
			rolls = sc.nextInt();
			RollDice.rollDice(rolls, rand);
		} while (rolls!=0);
	}
}
