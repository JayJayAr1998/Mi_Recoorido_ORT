package tp1;

import java.util.Scanner;

public class Ej8 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		System.out.println("Ingrese un numero");
		
		a = in.nextInt();
		
		System.out.println("Ingrese otro numero");
		
		b = in.nextInt();
		
		System.out.println("La suma de los dos numeros es: " + (a + b));
		
		System.out.println("La resta de los dos numeros es: " + (a - b));
		
		System.out.println("La multiplicacion de los dos numeros es: " + (a * b));
		
		if(a != 0 && b!= 0 ) {
			System.out.println("La divicion de los dos numeros es: " + (a / b));
		}else {
			System.out.println("No se puede dividir por 0");
		}
		
	}

}
