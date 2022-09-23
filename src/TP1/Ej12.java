package TP1;

import java.util.Scanner;

public class Ej12 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n1 = 0, n2 = 0;

		System.out.println("Ingrese un numero");

		n1 = in.nextInt();

		System.out.println("Ingrese otro numero");

		n2 = in.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " es el mayor");
		} else {
			System.out.println(n2 + " es el mayor");
		}

	}

}
