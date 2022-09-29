package TP2;

public class Ej1 {

	public static void main(String[] args) {

		
		System.out.println(pedirNumero("El numero es:", 1, 10));
	}
	
	static int sumar(int n1, int n2) {
		
		return n1 + n2;
		
	}
	
	static String pedirNumero(String s, int min, int max) {
		
		int nu = min + (int) (Math.random() * (max - min + 1));
		
		return s + " " + nu;
		
		}

	}
	