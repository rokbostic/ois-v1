import java.util.*;
import java.util.Math;


public class Gravitacija{
	
	public static double izracun(double h){
		double c = 6.674*Math.pow(10, -11);
		double m = 5.972*Math.pow(10, 24);
		double r = 6.371*Math.pow(10, 6);
		return (c*m/(Math.pow((r+h), 2)));
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		double nadmorska_visina = sc.nextDouble();
		double gravitacijski_pospesek = izracun(nadmorska_visina);
		

		System.out.println("Pospesek je: " + gravitacijski_pospesek);
	}
}
