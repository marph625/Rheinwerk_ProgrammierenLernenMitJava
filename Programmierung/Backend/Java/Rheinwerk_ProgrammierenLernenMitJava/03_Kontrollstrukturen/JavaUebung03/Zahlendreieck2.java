/* 
 * Die erste Schleife erzeugt solange Zeilen, bis der erste Zähler einen gegebenen Wert erreicht hat
 *
 * Die zweite Schleife beginnt bei jedem Durchlauf der ersten Schleife bei 0 und 
 * gibt solange Ziffern + Leerzeichen aus, bis der innere Zähler den Wert des äußeren
 * Zählers erreicht hat. Der Wert des inneren Zählers erhöht sich um 1 und gibt demzufolge
 * in jedem Durchlauf eine Ziffer + Leerzeichen mehr aus, beginnt jedoch immer wieder bei 0
 * Daraus ergibt sich das gewünschte Zahlendreieck.
 * 
 * In der zweiten Version soll dieselbe Ausgabe mittels do-while-Schleife erreicht werden.
 *
 */

public class Zahlendreieck2 {
	public static void main(String[] args) {
		var counter_outer = 0;

		do { 
			var counter_inner = 0;

			do {
				System.out.print(counter_inner + " ");
				counter_inner++;

			} while (counter_inner <= counter_outer);

			System.out.println();
			counter_outer++;

		} while (counter_outer < 10);
	}
}
