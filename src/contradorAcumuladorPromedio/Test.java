package contradorAcumuladorPromedio;

import java.util.Scanner;

public class Test {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Promedio prom = new Promedio();
		
		int i = 0;
		
		do {
			
			do {
			System.out.println("ingrese nota del 0 al 10 o -1 para finalizar");
			
			i = in.nextInt();
			
			if(i<-1 || i>10) {
				System.err.println("Ingrese un numero dentro del rango indicado");
			}
			
			}while(i<-1 || i>10);
			
			if(i>-1) {
				
				prom.incrementar(i);
				
				System.out.println("El promedio hasta ahora es de " + prom.obtenerValor());
				
			}else if(prom.cont.obtenerValor() == 0) {
				
				System.out.println("Se termina el programa con cero notas cargadas");
			}else {
				
				System.out.println("Finaliza el programa con un promedio de " + prom.obtenerValor());
				
			}
			
			
		}while(i>-1);
			
		
		
	}

}
