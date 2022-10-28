package tp1;

import java.util.Scanner;

public class Ej25 {
		
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = 0;
		
		int l = 0;
		
		System.out.println("Ingrese alto");
		
		a = in.nextInt();
		
		System.out.println("Ingrese ancho");
		
		l = in.nextInt();
		
		for(int i = 0 ; i < a ; i++) {
			for(int c = 0 ; c < l ; c++) {
				System.out.print("x");
			}
			System.out.println();
		}
		
	}

}
