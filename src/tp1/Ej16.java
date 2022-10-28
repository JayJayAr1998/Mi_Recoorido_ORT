package tp1;

import java.util.Scanner;

public class Ej16 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int part = 0;
		int sill = 0;

		System.out.println("Ingrese la cantidad de inscriptos.");

		part = in.nextInt();

		System.out.println("Ingrese cantidad de sillas.");

		sill = in.nextInt();

		if (part <= sill) {
			System.out.println("Las sillas alcanzan.");
		} else {
			System.out.println("Faltan " + (part - sill) + " sillas");
		}

	}

}
