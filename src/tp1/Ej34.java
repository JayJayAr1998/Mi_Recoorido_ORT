package tp1;

import java.util.Scanner;

public class Ej34 {
	
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		float altura;
		float promedio = 0;
		int conteo= 0;
		float promedioT;
		
		do {
			System.out.println("ingrese la altura del jugador");
			
			altura = entrada.nextFloat();
			
			conteo++;
			
			promedio += altura;
			
		}
			while(altura != 0 );
		
		promedioT = promedio / (conteo-1);
		
		System.out.println("El promedio de altura es de: " + promedioT);
		
		
	}

}
