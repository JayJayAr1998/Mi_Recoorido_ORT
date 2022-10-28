package examenes;

import java.util.Scanner;

public class ExamenFPR1 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		final int TOPE_MINIMO = 1;
		final int TOPE_MAXIMO = 10;
		int numero;
		String j1;
		String j2;
		int rond;
		int p1 = 0;
		int p2 = 0;
		int ronA = 0;
		int nj1;
		int nj2;

		do {
			System.out.println("Ingrese el nombre del primer jugador");

			j1 = in.next();

			if (j1.equals(" ")) {
				System.out.println("Ingrese un valor correcto");
			} else {
				System.out.println("Hola " + j1);
			}
		} while (j1.equals(" "));

		do {
			System.out.println("Ingrese el nombre del segundo jugador");

			j2 = in.next();

			if (j2.equals("")) {
				System.out.println("Ingrese un valor correcto");
			} else {
				System.out.println("Hola " + j2);
			}
		} while (j2.equals(""));

		do {
			System.out.println("Ingrese cantidad de ronda a jugar");

			rond = in.nextInt();

			if (rond < 1) {
				System.out.println("El minimo de rondas es 1");
			}

		} while (rond < 1);

		do {

			System.out.println("Comienza la ronda numero " + (ronA + 1));

			numero = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));

			do {
				System.out.println(j1 + " ingrese un numero del 1 al 10");

				nj1 = in.nextInt();
				
				if(nj1 < TOPE_MINIMO || nj1 > TOPE_MAXIMO) {
					System.err.println("El numero que ingreso esta fuera del rango permitido");
				}

			} while (nj1 < TOPE_MINIMO || nj1 > TOPE_MAXIMO);

			do {
				System.out.println(j2 + " ingrese un numero del 1 al 10");

				nj2 = in.nextInt();
				
				if(nj2 < TOPE_MINIMO || nj2 > TOPE_MAXIMO) {
					System.err.println("El numero que ingreso esta fuera del rango permitido");
				}

			} while (nj2 < TOPE_MINIMO || nj2 > TOPE_MAXIMO);

			if (nj2 == numero && nj1 == numero) {
				p1++;
				p2++;
				ronA++;
			} else if (nj2 != numero && nj1 != numero) {
				ronA++;
			} else if (nj1 == numero) {
				p1++;
			} else{
				p2++;
			}
			System.out.println();
			System.out.println("El numero era: " + numero);
			
		} while (ronA < rond && !(p1 > p2) && !(p2 > p1));

		if (p2 == 0 && p1 == 0) {
			System.out.println("No gana nadie");
		} else if (p2 ==  p1) {
			System.out.println("Empate");
		} else if (p1 > p2) {
			System.out.println("Gana " + j1);
		} else{
			System.out.println("Gana " + j2);
		}

	}

}
