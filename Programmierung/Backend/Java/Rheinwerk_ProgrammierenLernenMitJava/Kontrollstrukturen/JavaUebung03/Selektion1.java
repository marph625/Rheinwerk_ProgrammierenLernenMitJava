/* Java Programm mit if-Anweisung 
 */

import javax.swing.JOptionPane;

public class Selektion1 {
	public static void main(String[] args) {
		var eingabe = JOptionPane.showInputDialog("Geben Sie Ihr Alter ein: ");
		var alter = Integer.parseInt(eingabe);
		if (alter < 18) {
			JOptionPane.showMessageDialog(null, "Nicht volljaehrig, kein Zutritt!");}
		else {
			JOptionPane.showMessageDialog(null, "Glueckwunsch! Sie sind volljaehrig und daher wird Ihnen Zutritt gewaehrt.");
			}
		}
	}

