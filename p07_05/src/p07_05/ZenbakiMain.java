/**
 * 
 */
package p07_05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class ZenbakiMain {



	public static void main(String[] args) {

		int sartuzenbakia;
		boolean aukera = true;
		String izenaString ;
		int karaktereKop;
		char letralehen;
		char letraazken;
		String izenahaundizString;
		String izenatxikizString;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Sartu zenbaki bat (Zenbakiak 10-30 tartean egon behar du");

			sartuzenbakia = sc.nextInt();

			if (sartuzenbakia < 10 || sartuzenbakia > 30) {

				System.out.println("Sartu zenbakia berriro");
			}
			else {
				System.out.println("Zenbakia ondo sartu duzu");
				aukera= false;
			}

		} while (aukera);

		try {
			
	
		if (sartuzenbakia  % 5 == 0) {

			System.out.println("Sartu duzun zenbakia 5ekin zatigarria da");
		}

		else {
			System.out.println("Zenbakia ez da 5ekin zatigarria");
		}
		
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Sartu ezazu zure izena");

		izenaString = sc.next();

		if (!izenaString.matches("[a-zA-Z-ñÑ]+")) {
			throw new NumberFormatException("Izenak ezin ditzazke zenbakiak eduki.");
		}
		if (izenaString.isEmpty()) {
			throw new IllegalArgumentException("Izenak ezin dezake hutsik joan");
		}

		karaktereKop = izenaString.length();
		System.out.println("Sartu duzun izenaren karaktere kopurua hau da : " + karaktereKop);
		
		letralehen = izenaString.charAt(0);
		System.out.println("Sartutako izenaren lehen letra hau da : " + letralehen);

		letraazken = izenaString.charAt(izenaString.length() -1);

		System.out.println("Sartutako izenaren azken letra hau da : " + letraazken);

		izenahaundizString =izenaString.toUpperCase();

		System.out.println("Sartutako izena letra haundiz hau da : " + izenahaundizString);

		izenatxikizString =izenaString.toLowerCase();

		System.out.println("Sartutako izena letra haundiz hau da : " + izenatxikizString);

		if (izenaString.contains("ñ") || izenaString.contains("Ñ")) {
			
			System.out.println("Zure izenak Ñ letra du");
			
		}
		else {
			System.out.println("Zure izenak ez du Ñ");
		}

	}

}
