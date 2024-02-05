/*
 * Programm zur Berechnung einer Collatzfolge
 * Yaser hat eine Frage.
 */


import javax.swing.JOptionPane;

public class Collatzfolge {
        public static void main(String[] args) {
                var eingabe_zahl = JOptionPane.showInputDialog("Gib eine Zahl ein");
                int xn = Integer.parseInt(eingabe_zahl);
		System.out.print(xn + " ");
		do {
			if (xn % 2 == 0) {
				xn = xn / 2;
				System.out.print(xn + " ");
			} else {
				xn = 3 * xn + 1;
				System.out.print(xn + " ");
			}
		} while (xn != 1);
                
        }
}
