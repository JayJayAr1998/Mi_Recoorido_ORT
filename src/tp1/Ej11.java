package tp1;

import java.util.Scanner;

public class Ej11 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0;

		System.out.println("Ingrese un numero entero");

		n = in.nextInt();

		if (n % 2 == 0) {
			System.out.println("El numero que ingreso es par.");
		} else {
			System.out.println("El numero que ingreso es impar.");
		}

	}

}
