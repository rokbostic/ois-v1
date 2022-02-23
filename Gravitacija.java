import java.util.*;


public class Gravitacija{
	
	public static double izracun(double h){
		return 0;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		double nadmorska_visina = sc.nextDouble();
		double gravitacijski_pospesek = izracun(nadmorska_visina);
		
		System.out.println("Pospesek je: " + gravitacijski_pospesek);
	}
}
