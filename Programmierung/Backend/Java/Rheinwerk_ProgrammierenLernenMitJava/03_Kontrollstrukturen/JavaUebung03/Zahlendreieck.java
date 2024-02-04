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
