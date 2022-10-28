package tp1;

import java.util.Scanner;

public class Ej13 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n1 = 0, n2 = 0, n3 = 0;

		System.out.println("Ingrese un numero.");

		n1 = in.nextInt();

		System.out.println("Ingrese otro numero.");

		n2 = in.nextInt();

		System.out.println("Ingrese un numero mas.");

		n3 = in.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("El mayor es " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("El mayor es " + n2);
		} else {
			System.out.println("El mator es " + n3);
		}

	}

}
