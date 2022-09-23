package Practicas;

import java.util.Scanner;

public class FreddOrt {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		final char MED = 'M', GRA = 'G', CHIC = 'C', COR = 'Z';
		char tam;
		final int MIN = 1, MAX=4;
		int cant;
		String nom, nomD = "";
		int cal, calD = Integer.MAX_VALUE;
		int pre, pt = 0;
		String nombre = "";
		String nombreR = "";
		int contCHIC = 0, contMED= 0, contGRA=0, contT = 0;
		int preM = Integer.MIN_VALUE;
		int promP, promC;
		int pos = 0;
		
		do {
			do {
				
				System.out.println("Ingrese tamaño");
				
				tam = in.next().toUpperCase().charAt(0);
				
				if(!(tam == MED) && !(tam == GRA) && !(tam == CHIC) && !(tam == COR) ) {
					System.err.println("Ingrese un valor correcto");
				}
				
			}while(!(tam == MED) && !(tam == GRA) && !(tam == CHIC) && !(tam == COR));
			
			if(!(tam == COR)) {
			
				switch(tam) {
				
				case GRA:
					contGRA++;
					break;
				
				case CHIC:
					contCHIC++;
					break;
					
				case MED:
					contMED++;
					break;
				}
				
				do {
					
					System.out.println("Ingrese cantidad de gustos(MINIMO 1 - MAXIMO 4)");
					
					cant = in.nextInt();
					
					if(cant<MIN || cant>MAX) {
						System.err.println("Ingrese una cantidad dentro los valores indicados");
					}
					
				}while(cant<MIN || cant>MAX);
				
				do {
					System.out.println("Ingrese importe a cobrar");
				
					pre = in.nextInt();
					
					if(pre<0) {
						System.err.println("Ingrese un precio correcto");
					}
					
				}while(pre<0);
				
				pre += 50;
				
				System.out.println("Ingrese nombre del cliente");
				
				nombre = in.next();
				
				if(pre > preM) {
					
					preM = pre;
					
					nombreR = nombre;
					
				}
				
				for(int i=0; i<cant ; i++) {
					System.out.println("Ingrese sabor numero " + (i+1));
					
					nom = in.next();
					
					do {
						System.out.println("Ingrese las calorias de ese sabor");
					
						cal = in.nextInt();
						
						if(cal<1) {
							System.err.println("Ingrese un valor de calorias valido");
						}
						
					}while(cal<1);
					
					if(cal<calD) {
						calD = cal;
						nomD = nom;
						pos = i+1;
					}
					
				}
				
				System.out.println("El sabor " + pos + " es el que tiene menos calorias es " + nomD +" con un total de " + calD +" calorias");
				
				calD = Integer.MAX_VALUE;
				
				contT++;
				
				pt += pre;
			}
			
		}while(contGRA<20 && !(tam == COR));
		
		if(contT>=1) {
		
			promP = pt/contT;
		
			promC = (contCHIC*100)/contT;
			
			System.out.println("Se finaliza el dia con: ");
			System.out.println("Pedidos Chicos: " + contCHIC);
			System.out.println("Pedidos Medianos: " + contMED);
			System.out.println("Pedidos Grandes: " + contGRA);
			System.out.println("Ingresos totales: $" + pt + " y un promedio de valor por pedido de: $" + promP);
			System.out.println("El pedido mas caro tuvo un valor de: $" + preM + " y fue adquirido por " + nombreR);
			System.out.println("El porcentage de pedidos Chicos fue de un %" + promC);
			
		}else {
			System.out.println("Se finaliza la operacion con cero ventas.");
		}
	}

}
