/* Programm zum Raten einer übergebenen Zahl
 */

import javax.swing.JOptionPane;

public class Zahlenraten {
	public static void main(String[] args) {
		var hardcoded_ziffer = 6;
		var eingabe_ziffer = JOptionPane.showInputDialog("Gib eine Ziffer von 0 - 9 ein: ");
		var input = Integer.parseInt(eingabe_ziffer);

		switch (input) {
		case 6:
			JOptionPane.showMessageDialog(null, "Treffer!");
			break;
		case 5, 7:
			JOptionPane.showMessageDialog(null, "Knapp daneben!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Daneben!");
			
		}
	}
}
