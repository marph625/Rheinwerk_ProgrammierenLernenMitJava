import javax.swing.JOptionPane;

public class Was_Soll_Das {
	public static void main(String[] args) {
		var eingabe1 = JOptionPane.showInputDialog("m = ");
		var eingabe2 = JOptionPane.showInputDialog("n = ");

		var m = Integer.parseInt(eingabe1);
		var n = Integer.parseInt(eingabe2);

		while (m != n) {
			if (m > n) {
				m = m - n;
			} else {
				n = n - m;
			}
		}
		JOptionPane.showMessageDialog(null, "m = " + m);
	}
}
