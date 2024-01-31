import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kreisberechnung4Konsole {
	public static void main(String[] args) throws IOException {
		var eingabepuffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Geben Sie den Kreisradius ein: ");
		var eingabe = eingabepuffer.readLine();
		var radius = Double.parseDouble(eingabe);
		System.out.print("Geben Sie die Einheit ein: ");
		eingabe = eingabepuffer.readLine();
		var einheit = eingabe;
		var pi = 3.1415926;
		var umfang = 2.0 * pi * radius;
		var flaeche = pi * radius * radius;
		System.out.print("Umfang: ");
		System.out.print(umfang);
		System.out.println(" " + einheit);
		System.out.print("Fläche: ");
		System.out.print(flaeche);
		System.out.print(" " + einheit + '\u00b2');
	}
}
