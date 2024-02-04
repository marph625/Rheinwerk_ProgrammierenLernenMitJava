import javax.swing.JOptionPane;

public class Guthabenentwicklung{
	public static void main(String[] whatever) {
		double m, n, r;
		String eingabe_m = JOptionPane.showInputDialog("Guthaben Euro");
		String eingabe_n = JOptionPane.showInputDialog("Zinssatz in Prozent");

		double vermoegen_0 = Double.parseDouble(eingabe_m);
		double zinssatz = Integer.parseInt(eingabe_n);

		double vermoegen_1 = vermoegen_0 * (1 + (zinssatz / 100));

		JOptionPane.showMessageDialog(null, "Ihr Guthaben von " + vermoegen_0 + " Euro betraegt nach einem Jahr bei einem Zinssatz von " + zinssatz + " Prozent genau " + vermoegen_1 + " Euro");
		
	}
}
