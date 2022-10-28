package tp1;

import java.util.Scanner;

public class Ej24 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("Ingrese un nuemro");
		
		n1 = in.nextInt();
		
		System.out.println("Ingrese un numero mayor o igual al primero");
		
		n2 = in.nextInt();
		
		System.out.println("-------------------------------------");
		
		for(int i = n1 + 1 ; i<n2 ; i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println("-------------------------------------");
		
		for(int i = n1 ; i<=n2 ; i++) {
					
					System.out.println(i);
		}
		
	}

}
