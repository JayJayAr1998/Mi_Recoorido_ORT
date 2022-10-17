package pruebasTecnicas;

import java.util.Scanner;

public class Cuadrado {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n;

		n = in.nextInt();

			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			for(int j = 0; j<n-2; j++) {
				System.out.print("*");
				for(int i = 0; i<n-2; i++) {
					System.out.print(" ");
					
				}
				System.out.print("*");
				System.out.println();
			}

			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}

		}

	}


