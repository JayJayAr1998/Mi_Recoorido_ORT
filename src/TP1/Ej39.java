package TP1;

import java.util.Scanner;

public class Ej39 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int can;
		int dist;
		int pm = 0;
		int cen = 0;
		int canG = 0;
		String n = "";
		String ng = "";

		do {
			System.out.println("Ingrese cantidad de jugadores(minimo 2)");

			can = in.nextInt();

			if (can < 2) {
				System.err.println("Ingrece una cantidad correcta.");
			}

		} while (can < 2);

		for (int i = 0; i < can; i++) {

			System.out.println("Ingrese el nombre del jugar numero " + (i + 1));

			n = in.next();

			for (int j = 0; j < 3; j++) {

				do {
					System.out.println("ingrese distancia de la tirada numero " + (j + 1));

					dist = in.nextInt();
					if (dist < 0) {
						System.err.println("Ingrese una distancia correcta");
					}
				} while (dist < 0);

				if (dist == 0) {
					pm += 500;
					cen++;
				} else if (dist >= 1 && dist <= 10) {
					pm += 250;
				} else if (dist > 10 && dist <= 50) {
					pm += 100;
				}
			}

			if (pm > canG) {

				ng = n;
				canG = pm;

			}

			pm = 0;
		}

		System.out.println("El ganador es " + ng + " con una puntuacion de " + canG);
		System.out.println("Se han realizado en total " + cen +" tiros al centro.");

	}

}
