package ui;


import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MenuApplicatie {
	static Scanner inputScanner = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = -1;
		do {
			menu = toonMenuEnGeefKeuze();
			switch (menu) {
			case 1:
				toonResultaat(geefBegroeting());
				break;
			case 2:
				toonResultaat(toonHuidigeDatum());
				break;
			case 3:
				System.out.print("Geef een getal: ");
				toonResultaat(zetOmNaarHexadecimaal(inputScanner.nextInt()));
			default:
				break;
			}
		} while (menu != 0);

	}
	
	public static int toonMenuEnGeefKeuze() {
		System.out.printf("Menu:%n1) Begroeting%n2) Huidige datum%n"
				+ "3) Naar hexadecimaal%n0) Stoppen%nGeef uw keuze: ");
		return inputScanner.nextInt();
	}
	
	public static String geefBegroeting() {
		return String.format("Hallo ... %n%n");
	}
	
	public static String toonHuidigeDatum() {
		final Locale NL = new Locale("nl", "NL");
		Format dateFormat = new SimpleDateFormat("EEEE, dd MMMM, yyyy", NL);
		Date date = new Date();
		String tempString = dateFormat.format(date);
		return String.format("%s%n%n", tempString);
	}
	
	public static String zetOmNaarHexadecimaal(int getal) {
		return String.format("hexadecimaal van %d is %X%n%n", getal, getal);
	}
	
	public static void toonResultaat(String res) {
		System.out.printf("%s", res);
	}

}
