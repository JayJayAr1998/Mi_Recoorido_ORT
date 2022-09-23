package TP1;

import java.util.Scanner;

public class Ej20 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 0;
		String d;

		System.out.println("Ingrese primer numero");

		n1 = in.nextInt();

		System.out.println("Ingrese segundo numero");

		n2 = in.nextInt();

		System.out.println("Ingrese operacion");

		d = in.next();

		switch (d) {

		case "+":
			System.out.println("La suma de " + n1 + " + " + n2 + " es: " + (n1 + n2));
			break;

		case "-":
			System.out.println("La resta de " + n1 + " - " + n2 + " es: " + (n1 - n2));
			break;

		case "*":
			System.out.println("La multiplicacion de " + n1 + " * " + n2 + " es: " + (n1 * n2));
			break;

		case "/":
			if (n1 != 0 && n2 != 0) {
				System.out.println("La divicion de " + n1 + " / " + n2 + " es: " + (n1 / n2));
			} else {
				System.err.println("No se puede dividir por 0.");
			}
			break;

		default:
			System.out.println("Operacion no valida.");
			break;
		}
	}

}
