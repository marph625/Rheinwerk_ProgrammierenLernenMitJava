/* Programm zum Testen, ob eine Zahl negativ oder positiv ist
 */

import javax.swing.JOptionPane;

public class Zahlentest {
	public static void main(String[] args) {
		var eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
		var c = Double.parseDouble(eingabe);

		if (c > 0) {
			JOptionPane.showMessageDialog(null, "Die Zahl ist positiv + ");
		} else {
			if (c < 0) {
				JOptionPane.showMessageDialog(null, "Diese Zahl ist negativ - ");
			} else {
				JOptionPane.showMessageDialog(null, "Die Zahl 0 ist weder positiv noch negativ");
			}
		}
	}
}
