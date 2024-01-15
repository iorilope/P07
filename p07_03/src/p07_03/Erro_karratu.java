/**
 * 
 */
package p07_03;
import java.util.Scanner;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Erro_karratu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String z1;
		float f1;
		Scanner		teklatua	= new Scanner(System.in);
		
		System.out.println("Sartu zenbaki bat honen erro karratua kalkulatzeko");
		
		z1=	teklatua.next();
		
		f1		= Float.parseFloat(z1);
		
		if (f1 < 0) {
			
			throw new IllegalArgumentException("Sartu behar den zenbakia positiboa izan behar du bestela ezin dezakegu erro karratua kalkulatu");
			
		}
	try {
		
	
	double Erantzuna=Math.sqrt(f1);
	System.out.println(Erantzuna);
	}catch (Exception e) {
		
	}	
	}

}
