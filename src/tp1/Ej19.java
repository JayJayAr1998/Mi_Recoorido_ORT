package tp1;

import java.util.Scanner;

public class Ej19 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int a = 0;

		System.out.println("Ingrese un numero");

		a = in.nextInt();

		boolean esDeUnSoloDigito = a >= 0 && a <= 9;
		boolean esImpar = !(a % 2 == 0);
		boolean estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
		boolean noEstaEnNingunGrupo = !esDeUnSoloDigito && !esImpar;

		System.out.println("El numero " + a);

		System.out.println("esDeUnSoloDigito: " + esDeUnSoloDigito);

		System.out.println("esImpar: " + esImpar);

		System.out.println("estaEnAmbosGrupos: " + estaEnAmbosGrupos);

		System.out.println("noEstaEnNingunGrupo: " + noEstaEnNingunGrupo);

	}

}
