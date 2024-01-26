/* Kreisberechnung: Für einen Kreis mit dem Radius 5 cm
 * werden der Umfang und die Fläche berechnet. */

public class Kreisberechnung {
	public static void main(String[] args) {
		double pi = 3.1415926;
		double radius = 5.0;
		double umfang = 2.0 * pi * radius;
		double flaeche = pi * radius * radius;
		System.out.println("Radius: " + radius);
		System.out.println("Umfang: " + umfang);
		System.out.println("Fläche: " + flaeche);
	}
}
