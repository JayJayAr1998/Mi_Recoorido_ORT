package tp1;

import java.util.Scanner;

public class Ej18 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		System.out.println("Ingrese un numero a");

		a = in.nextInt();

		System.out.println("ingrese numero b");

		b = in.nextInt();

		if (a % b == 0) {
			System.out.println("El numero a es divisible por b.");
		} else {
			System.out.println("El numero a no es divisible por b.");
		}

	}
}
