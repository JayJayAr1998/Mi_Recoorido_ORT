package pruebasTecnicas;

import java.util.Scanner;

public class Palindromo {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Escribe un palindromo");
		
		String ag = in.next();
		
		if(palindromo(ag)) {
			
			System.out.println("Es palindromo");
			
		}else {
			System.out.println("No es palindromo");
		}
		
	}
	
	public static boolean palindromo(String ag) {
		
		char[] palabra = new char[ag.length()];
		
		char[] palindromo = new char[ag.length()];
		
		int a = 0;
		
		int b = 0;
		
		for(int i = 0; i< palabra.length ; i++) {
			
			palabra[i] = ag.charAt(i);
			
		}
		
		for(int i = palindromo.length - 1; i >= 0 ; i-- ) {
			
			palindromo[a] = palabra[i];
			
			a++;
			
		}
		
		for(int i = 0; i<palabra.length; i++) {
			
			if(palindromo[i] == palabra[i]) {
				
				b++;
				
			}
		}
		
		
		return b == palindromo.length;
	}

}
