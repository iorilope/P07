package p07_06;

/** Datuak baliozkotzeko salbuespen pertsonalizatua nola sortu erakusten du. 
 * ZuzenaDa-rako deian bigarren argudioan mezurik zehazten ez bada, 
 * salbuespenak NireSalbuespena klasean lehenetsita dagoen mezua hartzen du (Oharra: zenbakiak positiboa izan behar du), 
 * baizik eta bigarren argudio gisa zehazten den mezua aterako da
 */
public class Balidatu
{
	public static void zuzenaDa(boolean zuzena) throws NireSalbuespena
	{
		if(!zuzena)
			throw new NireSalbuespena();
	}
	
	public static void zuzenaDa(boolean zuzena, String mezua) throws NireSalbuespena
	{ 
		if(!zuzena)
			throw new NireSalbuespena(mezua);
	}
}