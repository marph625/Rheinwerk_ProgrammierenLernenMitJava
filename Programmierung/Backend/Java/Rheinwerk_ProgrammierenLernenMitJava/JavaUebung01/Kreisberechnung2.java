public class Kreisberechnung2 {
	public static void main(String[] args) {
		double pi = 3.1415926;
		double radius = Double.parseDouble(args[0]);
		double umfang = 2.0 * pi * radius;
		double flaeche = pi * radius * radius;
		System.out.print("Umfang:");
		System.out.println(umfang);
		System.out.print("Fläche:");
		System.out.println(flaeche);
	}
}
