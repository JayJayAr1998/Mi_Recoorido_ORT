package TP1;

import java.util.Scanner;

public class Ej23 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = 0;
		
		System.out.println("Ingrese un numero");
		
		n = in.nextInt();
		
		for(int i=1 ; i<11 ; i++) {
			System.out.println(n*i);
		}
		
	}

}
