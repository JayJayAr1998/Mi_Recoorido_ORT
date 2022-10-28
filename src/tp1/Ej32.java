package tp1;

import java.util.Scanner;

public class Ej32 {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		
		int n = 0;
		
		do {
			System.out.println("Ingrese nota");
			
			n = in.nextInt();
			
		}while(!(n == 0 || (n >= 4 && n <=10)));
		
	}

}
