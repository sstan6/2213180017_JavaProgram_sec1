import javax.swing.*;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Input Full Name: ");
		int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Input Birth Year: "));
		while (birthYear < 1980 || birthYear > 2018) {
			birthYear = Integer.parseInt(JOptionPane.showInputDialog("Input Birth Year: "));
		}
		int gender = JOptionPane.showConfirmDialog(null, "Are you Female?", "Gender", JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null,
				"Full name: "+name+
				"\nBirth Year: "+birthYear+
				"\nYou're "+(gender == 0?"Female":"Male"));
	}

}
