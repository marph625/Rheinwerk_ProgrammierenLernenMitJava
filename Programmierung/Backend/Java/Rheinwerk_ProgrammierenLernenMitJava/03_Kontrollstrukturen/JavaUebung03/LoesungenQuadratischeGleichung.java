/* Aufgabe: Für eine quadratische Gleichung ax^2 + bx + c = 0 soll bestimmt werden,
 * ob die Gleichung eine, zwei oder keine Lösung besitzt.
 *
 * Diskriminante D = b * b - 4 * a * c
 */

import javax.swing.JOptionPane;

public class LoesungenQuadratischeGleichung {
	public static void main(String[] args) {

		//Eingabe
		var eingabe_a = JOptionPane.showInputDialog("a = ");
		var eingabe_b = JOptionPane.showInputDialog("b = ");
		var eingabe_c = JOptionPane.showInputDialog("c = ");

		var a = Double.parseDouble(eingabe_a);
		var b = Double.parseDouble(eingabe_b);
		var c = Double.parseDouble(eingabe_c);

		var D = (b * b) - (4 * a * c);

		//Verarbeitung und Ausgabe
		if (D > 0) {
			JOptionPane.showMessageDialog(null, "Es gibt 2 Loesungen");
		} else {
			if (D < 0) {
				JOptionPane.showMessageDialog(null, "Es gibt keine Loesung");	
			} else {
				JOptionPane.showMessageDialog(null, "Es gibt 1 Loesung");
			}
		}

	}
}
