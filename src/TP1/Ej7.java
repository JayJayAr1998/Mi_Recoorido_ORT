package TP1;

import java.util.Scanner;

public class Ej7 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float largo;
		float ancho;
		float m2;
		float valorTotal;
		float alambre;
		
		for(int i = 0; i<3;i++) {
			
			System.out.println("Ingrese ancho");
			
			ancho = in.nextFloat();
			
			System.out.println("Ingrese largo");
			
			largo = in.nextFloat();
			
			System.out.println("Ingrese valor por m2");
			
			m2 = in.nextFloat();
			
			valorTotal= (largo * ancho) * m2;
			
			alambre = (largo+ancho)*2;
			
			System.out.println("El valor del terreno es de: $" + valorTotal + " y se necesitan " + alambre + " metros de alambre para cercarlo");
			
		}
		
	}

}
