package examenes;

import java.util.Scanner;

public class ExamenTHP1 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		final int TOPE_MAXIMO = 1000;
		final int TOPE_MINIMO = 1;
		int numero1;
		int numero2;
		final String MAYOR = "MA", MENOR = "ME", IGUAL = "IG";
		String correcto = "";
		String respuesta;
		int pun = 0;
		int rond = 0;

		numero1 = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));

		System.out.println("Mi primer numero fue el " + numero1);

		do {

			numero2 = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));

			do {
				System.out.println("Como sera el proximo numero respecto a este? ([MA]yor, [ME]nor o [IG]ual)");

				respuesta = in.next().toUpperCase();

				if (!respuesta.equals(MAYOR) && !respuesta.equals(MENOR) && !respuesta.equals(IGUAL)) {
					System.err.println("Ingrese una respuesta valida");
				}

			} while (!respuesta.equals(MAYOR) && !respuesta.equals(MENOR) && !respuesta.equals(IGUAL));

			if (numero2 < numero1) {
				correcto = MENOR;
			} else if (numero2 > numero1) {
				correcto = MAYOR;
			} else if (numero2 == numero1) {
				correcto = IGUAL;
			}

			System.out.println("Mi numero actual es " + numero2 + "(" + correcto + " respecto al anterior)");

			if (respuesta.equals(correcto)) {
				pun++;
				System.out.println("Acertaste!");
			} else {
				System.out.println("perdiste. Acertaste durante " + pun + " rondas!");
			}

			rond++;

			numero1 = numero2;

		} while (pun == rond);

	}

}
