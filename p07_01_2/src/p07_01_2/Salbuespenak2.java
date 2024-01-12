package p07_01_2;


/* Salbuespen bat mota arabera nola harrapa eta trata daitekeen erakusten du.
* Sortutako salbuespena ez bada lehenengo catch-aren klasekoa, honako hau ikertzen da: eta catch blokeak harrapatu arte. 
Blokeak edozein mota harrapatzen du salbuespen klase guztiak Exception klase datozelako
*/

import java.util.Scanner;

public class Salbuespenak2
{
	public static void main(String args[])
	{
		int		zbk1, zbk2, emai;
		String	textu;
		Scanner	teklatu	= new Scanner(System.in);
		boolean	error	= false;
		
		do
		{
			try
			{
				error = false;
				System.out.println("Sartu lehenengo zenbakia:");
				textu	= teklatu.nextLine();
				zbk1	= Integer.parseInt(textu);
				System.out.println("Sartu bigarren zenbakia:");
				textu	= teklatu.nextLine();
				zbk2	= Integer.parseInt(textu);
				emai	= zbk1 / zbk2;
				System.out.printf("%d eta %d arteko zatiketaren emaitza  %d da", zbk1, zbk2, emai);
			} 
			catch (NumberFormatException e)
			{
				System.out.println("Akatsa zenbakira bihurtzeko garaian");
				error = true;
			} 
			catch (ArithmeticException e)
			{
				System.out.println("Zati 0 egin nahi izan da");
				error = true;
			} 
			catch (Exception e)
			{
				System.out.println("Salbuespen ezezaguna");
				error = true;
			}

		} while (error);
	}
}
/** 1 galdera
**	Errore aldagaia kentzen badugu programa hasieratzerakoan errore bat badago,programak jarraitu egingo du beraz ez luke salbuespen kontrolik
**	izango  eta gainera Zenbakiak sartzerakoan errorea badago programak jarraitu egingo du beti. gainera ez liguke zenbakia aldi bat baino gehiago galdetuko
**/

/** 2 galdera 
**	Erabiltzaileak bigarren zenbaki gisa 0 sartzen badu zatiketa ezin daiteke egin,ArithmeticException salbuespena saltatuko da eta 
**	Zati 0 egin nahi izan da esango digu
**/

/** 3 galdera
 *  Erabiltzaileak lehen zenbaki gisa letra bat sartzen badu  NumberFormatException salbuespenak saltatuko du eta Akatsa zenbakira
 *   bihurtzeko garaian mezua irakurriko dugu
 *
**/

/** 4 galdera
**  Azken chatch-a lehengo jartzen badugu exception generala saltatuko dalehenik eta ez dugu jakingo zer salbuespen zehatz den, beste biak lehenik jarriz gero gure 
*exception-a zein den jakingo dugu eta  salbuespen horietako ez bat bada generalak saltatuko dugu
*/