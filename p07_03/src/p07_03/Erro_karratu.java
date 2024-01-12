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
		
	double Erantzuna=Math.sqrt(f1);
	System.out.println(Erantzuna);

	}

}
