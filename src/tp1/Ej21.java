package tp1;

import java.util.Scanner;

public class Ej21 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int d = 0;
		String dia = "";
		boolean validacion = false;

		System.out.println("Ingrese un numero del uno al site");

		d = in.nextInt();

		switch (d) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Lunes";
			break;

		case 3:
			dia = "Martes";

		case 4:
			dia = "Miercoles";
			break;

		case 5:
			dia = "Jueves";
			break;

		case 6:
			dia = "Viernes";
			break;

		case 7:
			dia = "Sabado";
			break;

		default:
			validacion = true;
			break;
		}

		if (!validacion) {
			System.out.println("El dia corresponde al " + dia);
		} else {
			System.out.println("No ingreso un numero del 1 al 7.");
		}
	}

}
