package p07_06;

/* RuntimeException NireSalbuespena salbuespen klase berriaren gainklasea da. 
 * String motako parametroa getMessage itzultzen duen mezua da (). 
 * Horretarako, NireSalbuespena () eraikitzaileak superklasearen eraikitzaileari deitu behar dio eta kate hori argudio gisa pasatu. 
 * Hau superrekin egiten da. Super metodoaren deiak superklasearen eraikitzaile bati deitzen ari garela adierazten du. 
 * Kontuan izan behar da eraikitzaileak ez direla heredatzen.
 *
 */
public class NireSalbuespena extends RuntimeException

{
	public NireSalbuespena()
	{
		super("Zenbakia positiboa izan behar du.");
	}
	
	public NireSalbuespena(String mezua)
	{
		super(mezua);
	}
}