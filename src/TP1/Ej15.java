package TP1;

import java.util.Scanner;

public class Ej15 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		final int EDAD = 6;
		final float ALT = 1.50f;
		int ed = 0;
		float al = 0;

		System.out.println("Ingrese su edad:");

		ed = in.nextInt();

		System.out.println("Ingrese su altura");

		al = in.nextFloat();

		if (ed > EDAD || al > ALT) {
			System.out.println("Puede entrar.");
		} else {
			System.out.println("No puede entrar.");
		}

	}

}
