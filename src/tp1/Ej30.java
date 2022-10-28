package tp1;

import java.util.Scanner;

public class Ej30 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		String s;
		
		do {
			System.out.println("Ingrese operacion a realizar");
			
			s = in.next();
			
			if(!s.equals("f")) {
				
				System.out.println("Ingrese un numero");
				
				a = in.nextInt();
				
				System.out.println("Ingrese otro numero");
				
				b = in.nextInt();
				
				switch(s) {
				
				case "+":
					System.out.println("La suma da: " + (a+b));
					break;
				case "-":
					System.out.println("La resta da: " + (a-b));
					break;
				case "*":
					System.out.println("La multiplicacion da: " + (a*b));
					break;
				case "/":
					if(a != 0 && b !=0) {
						System.out.println("La divicion da: " + (a/b));
					}else {
						System.out.println("No se puede dividir por 0");
					}
					break;
				default:
					System.out.println("Ingrese una operacion correcta");
					break;
					
				
				}
			}else {
				System.out.println("FIN");
			}
		}while(!s.equals("f"));
		
	}

}
