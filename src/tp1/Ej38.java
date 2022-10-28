package tp1;

import java.util.Scanner;

public class Ej38 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		final String PASS = "123456";
		final String USE = "admin";
		int cont = 0;
		
		String user = "";
		
		String passw = "";
		
		do {
			
			System.out.println("Ingrese usuario:");
			
			user = in.nextLine();
			
			System.out.println("Ingrese password:");
			
			passw = in.nextLine();
			
			
			if(!passw.equals(PASS) || !user.equals(USE)) {
				cont++;
			}else {
				System.out.println("Acceso concedido");
				cont=4;
			}
			
		}while(cont < 3);
		
		if(cont == 3) {
			System.out.println("Acceso denegado, se te bloqueo todo");
		}
	}

}
