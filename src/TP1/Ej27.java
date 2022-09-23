package TP1;

import java.util.Scanner;

public class Ej27 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int edad = 0;
		int edades = 0;
		int cont = 0;
		
		for(int i = 0; i < 5 ; i++ ) {
			
			System.out.println("ingrese una edad");
			
			edad = in.nextInt();
			
			edades += edad;
			
			if(edad>18 && edad % 2 != 0) {
				cont++;
			}
			
		}
		
		System.out.println("El promedio de edades es de: " + (edades/5) + " años y las edades impares mayores a 18 son : " + cont);
	}

}
