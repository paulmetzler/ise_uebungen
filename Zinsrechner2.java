package uebung1;

import java.util.Locale;
import java.util.Scanner;

public class Zinsrechner2 {

	public static void main(String[] args) {
		
		double zs;
		int lz = 0;
		double ab;
		double z = 0;
		double eb;
		double zb;
		
		// Datenaufnahme
		Scanner in= new Scanner(System.in).useLocale(Locale.ENGLISH);
		System.out.print("Bitte geben Sie den Zinssatz (in Prozent) ein: ");
		zs = in.nextDouble();
		zs = zs/100;
		
		System.out.print("Bitte geben Sie den Anlagebetrag ein: ");
		ab = in.nextDouble();
		
		System.out.print("Bitte geben Sie den Endbestrag ein: ");
		eb = in.nextDouble();
		zb = ab;
		
		//Ausgabe f�r eine bessere �bersichtlichkeit
		System.out.println();
		System.out.println("Jahr      Anfangsbetrag     Zinsen     Endbetrag");
		System.out.println(lz+"           "+ab+"           "+z+"       "+zb);  
		// Kalkulation und Ausgabe
		while (ab < eb) {
			lz++;
			z = zs * ab;
			zb = ab + z;
			System.out.println(lz+"           "+ab+"           "+z+"       "+zb);
			ab += z;
		}		
	}
}