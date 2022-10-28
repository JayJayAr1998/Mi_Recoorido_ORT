package tp1;

import java.util.Scanner;

public class Ej35 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int ed = 0;
		int edM = 0;
		String nom = "";
		String nomM = "";
		
		do {
			System.out.println("Ingrese el nombre");
			
			nom = in.next();
			
			if(!nom.equals("*")) {
				
				System.out.println("Ingrede la de edad de " + nom);
				
				ed = in.nextInt();
				
				if(ed > edM) {
					edM = ed;
					nomM = nom;
				}
			}
			
		}while(!nom.equals("*"));
		
		System.out.println("El mayor de todos es " + nomM + " con " + edM + " años.");
		
	}

}
