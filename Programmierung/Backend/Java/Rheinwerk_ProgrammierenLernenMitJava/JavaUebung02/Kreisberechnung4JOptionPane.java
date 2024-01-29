import javax.swing.JOptionPane;

public class Kreisberechnung4JOptionPane {
	public static void main(String[] args) {
		var eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
		var radius = Double.parseDouble(eingabe);
		eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
		var einheit = eingabe;
		var pi = 3.1415926;
		var umfang = 2.0 * pi * radius;
		var flaeche = pi * radius * radius;
		JOptionPane.showMessageDialog(null,"Umfang: " + umfang + " " + einheit + "\nFlaeche: " + flaeche + " " + einheit + "\u00b2");
	}
}

