package TP1;

import java.util.Scanner;

public class Ej3 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Ingrese un numero");
		
		n = in.nextInt();
		
		System.out.println("El numero " + n + " multiplicado por 5 es: " + (n*5));
		
		System.out.println("El numero " + n + " dividido por 2 es: " + (n/2));
		
	}

}
