package TP1;

import java.util.Scanner;

public class Ej5 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("Ingrese un numero");
		
		n1 = in.nextInt();
		
		System.out.println("ingrese otro numero");
		
		n2 = in.nextInt();
		
		System.out.println("Usted ingreso primero " + n1 + " y despues " + n2);
		
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("Ahora se inviertieron el preimro es " + n1 + " y el segundo es " + n2);
		
	}

}
