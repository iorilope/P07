/**
 * 
 */
package p07_04;



import java.util.Scanner;



/**
 * 
 * @author Ioritz Lopetegi
 */
public class ProgramaNagusia {

	
	public static void main(String[] args) {
		
		
		int aldeak;
		double luze;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sartu figurak edukiko dituen alde kopurua");
		aldeak = sc.nextInt();
		if (aldeak <= 2) {
			throw new IllegalArgumentException("Figurak ezin dezake 2 alde edo gutxiago eduki");
			
		}
		else {
			System.out.println("Sartu figurak edukiko duen luzeera");
			luze = sc.nextInt();
			
			if (luze <= 0) {
				
				throw new IllegalArgumentException("Figurak ezin dezake luzeera negatiboa edo luzeera 0 izan");
				
			}
			
			
		}
		Figura f1 = new Figura(aldeak,luze);
		System.out.println("Figuraren perimetroa: ");
		System.out.println(f1.ItzuliPerimetroa());
	
		
		
		Figura f2 = Figura.SortuFigura1();
		Figura f3 = Figura.SortuFigura2();
		String perime2 = f2.ItzuliPerimetroa();
		String perime3 = f3.ItzuliPerimetroa();
		double perime2Int = Double.parseDouble(perime2);
		double perime3Int = Double.parseDouble(perime3);
		
		if (perime2Int < perime3Int) {
			System.out.println("3. figuraren perimetroa handiagoa da," + perime3Int);
		}
		else {
			System.out.println("2. figuraren perimetroa handiagoa da," + perime2Int);
		}
		
		
	}

}
