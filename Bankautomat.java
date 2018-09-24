package uebung1;
import java.util.*;
public class Bankautomat {
	
	//Variablendeklaration
	static Scanner blubbi;
	static double ein;
	static double summe = 0;
	static double schnitt;
	static int schritt = 0;
	
	//Main-Methode mit Ausgabe
	public static void main(String[] args) {
		Scanner blubbi = new Scanner(System.in);
		System.out.println("Bitte Einzahlen: ");
		ein = blubbi.nextDouble();
		//Abbruchbedingung
		if(ein>0 && schritt <= 10) {
			einzahlung(ein);
			main(args);
		}
		//Ende der Funktion
		else {
			System.out.println("Einzahlungen: " + schritt + " -- Summe: " + summe + " -- Durchschnitt: " + schnitt);
		}
	}
	//Einzahlungsvorgang
	public static void einzahlung(double a) {
		schritt += 1;
		summe += a;
		schnitt = summe/schritt;
		System.out.println();
	}
	
}
