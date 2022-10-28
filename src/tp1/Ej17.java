package tp1;

import java.util.Scanner;

public class Ej17 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int edad = 0;
		String gen = "";
		boolean e = edad > 0 && edad < 121;
		boolean g = gen.equals("f") || gen.equals("m") || gen.equals("F") || gen.equals("M");

		System.out.println("Ingrese edad.");

		edad = in.nextInt();

		System.out.println("Ingrese genero.");

		gen = in.next();

		if (!e) {
			if (!g) {
				if (edad >= 65 && (gen.equals("m") || gen.equals("M"))) {
					System.out.println("Se puede jubilar.");
				}
				if (edad >= 60 && (gen.equals("f") || gen.equals("F"))) {
					System.out.println("Se puede jubilar.");
				} else {
					System.out.println("Todavia no puede jubilarse.");
				}
			} else {
				System.out.println("Genero mal ingresado.");
			}
		} else {
			System.out.println("Edad mal ingresada.");
		}

	}

}
