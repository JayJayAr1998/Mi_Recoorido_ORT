package TP1;

import java.util.Scanner;

public class Ej9 {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		final int TRI = 180;
		float a = 0;
		float b = 0;
		
		System.out.println("Ingrese primer medida: ");
		
		a = in.nextFloat();
		
		System.out.println("Ingrese primer medida: ");

		b = in.nextFloat();
		
		System.out.println("La tercer medida corresponde a: " + (TRI - (a + b)) + "°");
		
	}

}
