package TP1;

import java.util.Scanner;

public class Ej10 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		float capitalT = 0;
		float cap1 = 0, cap2 = 0, cap3 = 0;
		String n1 = "", n2, n3 = "";

		System.out.println("Ingrese el nombre del primer socio:");

		n1 = in.next();

		System.out.println("Ingrese capital aportado por " + n1);

		cap1 = in.nextFloat();

		System.out.println("Ingrese el nombre del segundo socio:");

		n2 = in.next();

		System.out.println("Ingrese capital aportado por " + n2);

		cap2 = in.nextFloat();

		System.out.println("Ingrese el nombre del tercer  socio:");

		n3 = in.next();

		System.out.println("Ingrese capital aportado por " + n3);

		cap3 = in.nextFloat();

		capitalT = cap1 + cap2 + cap3;

		System.out.println("El capital total es de: $" + capitalT);

		System.out.println("El porcentaje de " + n1 + " es del " + ((cap1 * 100) / capitalT) + "%");

		System.out.println("El porcentaje de " + n2 + " es del " + ((cap2 * 100) / capitalT) + "%");

		System.out.println("El porcentaje de " + n3 + " es del " + ((cap3 * 100) / capitalT) + "%");

	}

}
