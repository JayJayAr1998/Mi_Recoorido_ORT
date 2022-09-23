package TP1;

import java.util.Scanner;

public class Ej2 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// al hacerlo con un for suamando todas las notas en una sola variable ahorro
		// espacio en memoria
		double n;
		double ns = 0;
		double p;

		for (int i = 0; i < 3; i++) {
			System.out.println("ingrese nota " + (i + 1));
			n = in.nextDouble();
			ns += n;

		}

		p = ns / 3;

		System.out.println("El promedio de sus notas es: " + p);

	}

}