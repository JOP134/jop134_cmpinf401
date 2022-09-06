package jop134_Assignment1;
import javax.swing.JOptionPane;
public class dollars {

	public static void main(String[] args) {
		//Prompting and converting
		String money = JOptionPane.showInputDialog("Enter cash amount (1-9999): ");
		int cash = Integer.valueOf(money);
		
		//Calculating
		int grands = cash/1000%10;
		int benjamins = cash/100%10;
		int sawbucks = cash/10%10;
		int bucks = cash%10;

		//Output
		JOptionPane.showMessageDialog(null, "Grands: " + grands + "\nBenjamins: " + 
		benjamins + "\nSawbucks: " + sawbucks + "\nBucks: " + bucks);
	}

}
