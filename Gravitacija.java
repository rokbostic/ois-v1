import java.util.*;


public class Gravitacija{
	
	public static double izracun(double h){
		return 0;
	}

	public static void izpis(double a, double b){
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		double nadmorska_visina = sc.nextDouble();
		double gravitacijski_pospesek = izracun(nadmorska_visina);
		
		izpis(gravitacijski_pospesek, nadmorska_visina);
		//System.out.println("Pospesek je: " + gravitacijski_pospesek);
	}
}
