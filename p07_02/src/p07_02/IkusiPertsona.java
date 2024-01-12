package p07_02;

import java.util.*;

public class IkusiPertsona
{
	public static void main(String argumentos[])
	{
		int			adina;
		boolean		error;
		Scanner		teklatua	= new Scanner(System.in);
		Pertsona	p			= new Pertsona();
		do
		{
			error = false;
			System.out.println("Adina sartu: ");
			try
			{
				adina = teklatua.nextInt();
				p.setAdina(adina);
				System.out.println(p.toString());

			} 
			catch (InputMismatchException e)
			{
				System.out.println("\nZenbakiak bakarrik sartu daitezke.");
				teklatua.next();
				error = true;
			} 
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				error = true;
			}
		} while (error);
		
		System.out.println("Programa amaitu da");
	}
}

/** -1 sartzerakoan errorea ematen du adina negatiboa ezin daitekeelako izan
 *  111  sartzerakoan errorea ematen du adina 100 baino handiago baita
 *  a sartzerakoan errorea ematen du sartutako adina ezin daitekeelako letra bat izan
 *  23 sartzerakoan ondo egiten du programak 23 adin egokia baita
 * 
 * 
 */

