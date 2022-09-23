package TP1;

import java.util.Scanner;

public class Ej36 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = 0;
		int cont = 0;
		int prom = 0;
		
		do {
			System.out.println("ingrese un numero");
			
			n = in.nextInt();
			
			cont++;
			
			prom += n;
			
		}while((prom/cont) < 20);
		
		//System.out.println("El promedio termino en: " + (prom/cont) + " con " + cont + " vueltas");
		
		System.out.println("La cantidad de numeros leidos es de: " + cont);
		
	}

}
