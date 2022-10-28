package tp1;

import java.util.Scanner;

public class Ej31_bis {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		String n;
		String c = "";

		do {
			System.out.println("Ingrese nombre");

			n = in.next();

			System.out.println("Hola " + n);

			System.out.println("¿Deseas continuar? [S/N]");

			c = (in.next()).toLowerCase();

		} while (!c.equals("n"));

		System.out.println("FIN");

	}

}
