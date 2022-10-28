package tp1;

import java.util.Scanner;

public class Ej29 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int nota;
		
		do {
			System.out.println("Ingrese nota");
			
			nota = in.nextInt();
			
		}while(!(nota >= 0 && nota <=10));
		
	}

}
