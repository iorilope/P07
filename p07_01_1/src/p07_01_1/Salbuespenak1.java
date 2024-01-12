package p07_01_1;

public class Salbuespenak1
{

	public static int salbuespenak(int z1, int z2)
	{
		int emaitza;
		
		try
		{
			emaitza = z1 / z2;
		} 
		catch (ArithmeticException e)
		{
			emaitza = 0;
		}
		
		return emaitza;
	}

	public static void main(String args[])
	{
		String	a1, a2;
		int		z1, z2, emai;
		
		if (args.length != 2)
		{
			System.out.println("Bi zenbaki behar ditugu.");
		} 
		else
		{
			a1	= args[0];
			a2	= args[1];
			try
			{
				z1		= Integer.parseInt(a1);
				z2		= Integer.parseInt(a2);
				emai	= salbuespenak(z1, z2);
				
				if (z2 == 0 && z1 != 0)
				{
					System.out.println("Emaitza infinito da.");
				} 
				else if (z2 == 0 && z1 == 0)
				{
					System.out.println("indeterminazioa.");
				} 
				else
				{
					System.out.printf("Emaitza %d / %d, %d da.", z1, z2, emai);
				}
			} 
			catch (NumberFormatException e)
			{
				System.out.println("Ezin dituzu letrak sartu!");
			}
		}
	}
}

//Erabiltzaileak 0 sartzen badu ezingo dugu zatiekta egin 0 delako zatitzailea Division by zero salbuespena

//Erabiltzaileak lehengo zenbaki gisa letra bat sartzen badu NumberFormatException salbuespenak saltatuko du