/* Kreisberechnung: Der Radius für einen Kreis und die 
 * Einheit werden über die Tastatur eingegeben. Anschließend
 * werden Umfang und Flächeninhalt berechnet.
 */

import javax.swing.*;

public class Kreisberechnung4 {
	public static void main(String[] args) {
		var eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
		var radius = Double.parseDouble(eingabe);
		eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
		var einheit = eingabe;
		var pi = 3.1415926;
		var umfang = 2.0 * pi * radius;
		var flaeche = pi * radius * radius;
		System.out.print("Umfang: ");
		System.out.print(umfang);
		System.out.println(" " + einheit);
		System.out.print("Fläche: ");
		System.out.print(flaeche);
		System.out.print(" " + einheit + '\u00b2');
	}
}
