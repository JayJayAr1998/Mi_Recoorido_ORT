package tp1;

import java.util.Scanner;

public class Ej37 {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		final int ANIO = 12;
		
		int cont = 0;
		
		double su = 0;
		
		double tot = 0;
		
		do {
			System.out.println("Ingrese su sueldo");
			
			su = in.nextDouble();
			
			if(su>=0) {
				tot = tot + su;
				
				cont++;
				
				
			}else {
				cont = 12;
			}
			
			
		}while(cont < ANIO);
		
		System.out.println("Su sueldo acumulado es: $" + tot);
		
		
		
		System.err.println();
		
		
	}

}
