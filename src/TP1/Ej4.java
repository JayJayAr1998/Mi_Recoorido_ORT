package TP1;

import java.util.Scanner;

public class Ej4 {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int h;
		double g;
		double dia;
		double semana;
		
		System.out.println("Ingrese ganancia por hora");
		
		g = in.nextFloat();
		
		System.out.println("Ingrese horas por dia que trabaja");
		
		h = in.nextInt();
		
		dia = h*g;
		
		semana = dia * 5.5;
		
		System.out.println("Su ganancia semanal es de: $" + semana);
		
	}

}
