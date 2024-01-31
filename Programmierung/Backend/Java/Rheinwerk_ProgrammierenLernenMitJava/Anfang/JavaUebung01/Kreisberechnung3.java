public class Kreisberechnung3 {
	public static void main(String[] args) {
		String einheit = args[1];
		double pi = 3.1415926;
		double radius = Double.parseDouble(args[0]);
		double umfang = 2.0 * pi * radius;
		double flaeche = pi * radius * radius;
		System.out.print("Umfang: ");
		System.out.print(umfang);
		System.out.println(" " + einheit);
		System.out.print("Fläche: ");
		System.out.print(flaeche);
		System.out.println(" " + einheit + '\u00b2');
	}
}
