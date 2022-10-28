package tp1;

import java.util.Scanner;

public class Ej33 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		do {
			System.out.println("Ingrese un numero");
			
			n = in.nextInt();
			
			if(n < min && n != 0) {
				min = n;
			}
			if(n > max) {
				max = n;
			}
			
		}while(n != 0);
		
		System.out.println("El mayor es: " + max);
		
		System.out.println("El menor es: " + min);
	}

}
