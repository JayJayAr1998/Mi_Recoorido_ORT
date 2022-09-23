package TP1;

import java.util.Scanner;

public class Ej28 {
	
	static Scanner in = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		int cant = 0;
		int n=0;
		int pos = 0;
		int may = 0;
		
		System.out.println("Ingrese la cantidad de iteraciones");
		
		cant = in.nextInt();
		
		for(int i = 0 ; i<cant ; i++) {
			
			System.out.println("Ingrese un numero.");
			
			n = in.nextInt();
			
			if(n>may) {
				may = n;
				pos=i+1;
			}
			
		}
		
		System.out.println("El mayor numero es el: " + may + " en la posicion " + pos);
		
	}
					
		
}


