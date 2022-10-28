package tp1;

import java.util.Scanner;

public class Ej26 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int entrada;
		int multiplo = 1;
		int cont = 0;
		
		System.out.println("Ingrese un numero");
		
		entrada = in.nextInt();
		
		
		
		
			while(cont < entrada) {
				if(multiplo % 3 == 0) {
					if(multiplo % 5 != 0) {
						System.out.println(multiplo);
						cont++;
					}else {
						cont++;
					}
					
				
				
			}
				multiplo++;
			}
		
	}

}
