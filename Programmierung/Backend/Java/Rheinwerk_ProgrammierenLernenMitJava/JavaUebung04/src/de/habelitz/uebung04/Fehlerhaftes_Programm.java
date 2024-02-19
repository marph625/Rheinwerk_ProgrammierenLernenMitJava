package de.habelitz.uebung04;

//Bei Ausführung wird eine Endlosschleife erzeugt
public class Fehlerhaftes_Programm {
	public static void main(String[] args) {
		byte zahl = 30;
		String zeichensatz = "";
		
		while (zahl < 128) {
			zeichensatz = zeichensatz + (char) zahl;
			zahl++;
		}
		System.out.println(zeichensatz);
	}
}
