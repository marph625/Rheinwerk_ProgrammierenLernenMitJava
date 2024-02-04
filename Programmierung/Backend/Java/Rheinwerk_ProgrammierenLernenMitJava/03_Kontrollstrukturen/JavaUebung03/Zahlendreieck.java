/* 
 * Die erste Schleife erzeugt solange Zeilen, bis der erste Zähler einen gegebenen Wert erreicht hat
 *
 * Die zweite Schleife beginnt bei jedem Durchlauf der ersten Schleife bei 0 und 
 * gibt solange Ziffern + Leerzeichen aus, bis der innere Zähler den Wert des äußeren
 * Zählers erreicht hat. Der Wert des inneren Zählers erhöht sich um 1 und gibt demzufolge
 * in jedem Durchlauf eine Ziffer + Leerzeichen mehr aus, beginnt jedoch immer wieder bei 0
 * Daraus ergibt sich das gewünschte Zahlendreieck.
 *
 */

public class Zahlendreieck {
	public static void main(String[] args) {
		var counter_outer = 0;

		while (counter_outer < 10) {
			var counter_inner = 0;
			while (counter_inner <= counter_outer) {
				System.out.print(counter_inner + " ");
				counter_inner++;
			}
			System.out.println();
			counter_outer++;
			}
		}
	}
