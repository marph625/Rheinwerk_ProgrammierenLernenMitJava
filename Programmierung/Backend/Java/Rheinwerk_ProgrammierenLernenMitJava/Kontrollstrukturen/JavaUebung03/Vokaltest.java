/* Programm zum Testen, ob ein Buchstabe ein Vokal ist
 */

import javax.swing.JOptionPane;

public class Vokaltest {
	public static void main(String[] args) {
		// bool'sche Variable wird standardmaessig auf 'false' gesetzt und nur 
		// auf 'true' gesetzt, wenn eine bestimmte Bedingung erfuellt wird
		var istVokal = false;
		var eingabe = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein und wir pruefen fuer Sie, ob es sich um ein Vokal handelt: ");
		var c = eingabe.charAt(0);

		if (c == 'a') {
			istVokal = true;
		} else {
		if (c == 'e') {
			istVokal = true;
		} else {
		if (c == 'i') {
			istVokal = true;
		} else {
		if (c == 'o') {
			istVokal = true;
		} else {
		if (c == 'u') {
			istVokal = true;
		}
		else {
			istVokal = false;
		}
				}
			}
		}
	}
	if (istVokal) {
	JOptionPane.showMessageDialog(null, c + " ist ein Vokal :)");
	} else {
	JOptionPane.showMessageDialog(null, c + " ist kein Vokal -.-");
		}
	}
}
