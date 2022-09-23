package Practicas;

import java.util.Scanner;

public class SimTHP {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int edades = 0;
		String opcion = "";
		int contS = 0;
		int contN = 0;
		int contB = 0;
		int contV = 0;
		int edad = 0;
		int edadesP;
		int porN;
		int s = 0;

		while (!opcion.equals("f")) {

			do {
				System.out.println("Ingrese su voto.");

				opcion = in.next().toLowerCase();

				switch (opcion) {

				case "s":
					s = 1000;
					break;

				case "n":
					s = 1000;
					break;

				case "b":
					s = 1000;
					break;

				case "f":
					s = 1000;
					break;
				default:
					System.err.println("Ingrese una opcion correcta");

				}

			} while (s < 2);

			if (opcion.equals("b") || opcion.equals("s") || opcion.equals("n")) {

				do {
					System.out.println("Ingrese su edad");

					edad = in.nextInt();

					if (edad < 18) {
						System.err.println("Debes ser mayor de edad para votar");
					}
				} while (edad < 18);

				contV++;

				edades += edad;

				switch (opcion) {

				case "s":
					contS++;
					break;

				case "n":
					contN++;
					break;

				case "b":
					contB++;
					break;
				}

			}

		}

		if (contV > 0) {
			edadesP = edades / contV;

			if (contS > contN && contS > contB) {

				System.out.println("La opcion ganadora es el si con " + contS + " votos.");

			} else if (contN > contS && contN > contB) {

				System.out.println("La opcion ganadora es el NO con " + contN + " votos.");

			}else if ( contB > contS && contB > contN ) {
				
				System.out.println("Gano la incertidumbre con un total de " + contB + " votos en blanco.");
				
			}

			porN = (contN * 100) / contV;

			System.out.println(
					"El porcentaje de personas que no quieren que se poden los arboles es de un " + porN + "%");

			System.out.println("El promedio de edades es de " + edadesP + " años.");
		} else {
			System.out.println("La votacion acabo sin ningun voto.");
		}
	}

}
