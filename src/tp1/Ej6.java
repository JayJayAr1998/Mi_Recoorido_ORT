package tp1;

import java.util.Scanner;

public class Ej6 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		final double SUELDO = 44000;
		double ventas;
		double plusVariable;
		double importe;
		
		System.out.println("Ingresar monto total de ventas: \n");
		
		ventas = in.nextDouble();
		
		plusVariable = ventas * 0.16;
		
		importe = SUELDO + plusVariable;
		
		System.out.println("Su sueldo total sera de: $" + importe);
		
	}

}
