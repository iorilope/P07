/**
 * 
 */
package p07_04;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Figura {

	
	public int aldeKop;
	public double luzera;
	public double perimetro;
	
	/**
	 * 
	 */
	public Figura(int aldeak,double luzeera) {
		
		aldeKop = aldeak;
		luzera = luzeera;
		
	}
	
	public String ItzuliPerimetroa(){
		
		perimetro = aldeKop * luzera;
		String perimeterString = Double.toString(perimetro);
		return perimeterString;
		
		
	}
	
	public static Figura SortuFigura1() throws IllegalArgumentException{
		Figura f2 = new Figura(4, 5);
        return f2;
       
	}
	public static Figura SortuFigura2() throws IllegalArgumentException{
		Figura f3 = new Figura(5, 7);
        return f3;
       
	}
	
	
	
	
	

}
