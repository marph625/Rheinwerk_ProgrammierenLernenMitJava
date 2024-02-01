/* Programm, um zu bestimmen, ob ein Jahr ein Schaltjahr ist oder nicht
 */

import javax.swing.JOptionPane;

public class Schaltjahr {
	public static void main(String[] args) {
		var eingabe_jahr = JOptionPane.showInputDialog("Gib ein Jahr ein und ich sage dir, ob es ein Schaltjahr ist, Bruder!");
		var jahr = Integer.parseInt(eingabe_jahr);
		
		if (jahr % 4) {
			if (jahr % 400) {
				JOptionPane.showMessageDialog(null, jahr + " ist ein Schaltjahr!");
			} else {
				if (jahr % 100) {
					JOptionPane.showMessageDialog(null, jahr + " ist kein Schaltjahr!");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, jahr + " ist kein Schaltjahr!");
		}
	}
}
