import javax.swing.JOptionPane;

public class ggtEuklid{
	public static void main(String[] whatever) {
		int m, n, r;
		var eingabe_m = JOptionPane.showInputDialog("m = ");
		var eingabe_n = JOptionPane.showInputDialog("n = ");

		m = Integer.parseInt(eingabe_m);
		n = Integer.parseInt(eingabe_n);
		r = m % n;

		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		JOptionPane.showMessageDialog(null, "n = " + n);
	}
}
