import javax.swing.*;
import java.text.*;
import java.util.Random;
import java.util.Scanner.*;

public class Lab303 {
	static final int withdraw = 20000;

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		DecimalFormat comma = new DecimalFormat("###,###");
		int moneytoWithdraw = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : " + comma.format(balance) + "\nInput money to withdraw: "));
int nonwithdraw = moneytoWithdraw%100;
int b1000 = moneytoWithdraw/1000;
int b500 = moneytoWithdraw/500;
int withdraw1000 = moneytoWithdraw-(b1000*b1000);
b500 = withdraw1000/500;
int withdraw500 = withdraw1000-(b500*b500);
int b100 = withdraw500/100;
int withdraw100 = withdraw500-(b100-b100);

		if (moneytoWithdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

		else if (moneytoWithdraw > withdraw) {
			JOptionPane.showMessageDialog(null,
					"Error: Cannot withdraw more than " + comma.format(withdraw) , "ERROR" , JOptionPane.ERROR_MESSAGE);
		}
		else if (moneytoWithdraw != 0) {
			JOptionPane.showMessageDialog(null,
					"Error: Cannot withdraw more than "+nonwithdraw+" bath.", "ERROR" , JOptionPane.ERROR_MESSAGE);
		}
	}
}
