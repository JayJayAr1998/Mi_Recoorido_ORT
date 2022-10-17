package TP2;

import java.util.Scanner;

public class Prueba {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		String nombre = "";
		String apellido = "";
		int num = 1;
		Integer num2 = 2;
		
		
		Alumno agustin = new Alumno();

		System.out.println("Ingrese nombre");

		nombre = in.next();

		System.out.println("Ingrese apellido");

		apellido = in.next();

		agustin.setNombre(nombre);
		agustin.setApellido(apellido);

		System.out.println("Hola " + agustin.saludar());
		
		System.out.println("Tenes casa?");
		
		String respuesta = in.next();
		
		if(respuesta.equals("SI")) {

		System.out.println("Ahora dinos donde vives");

		Domicilio casa = new Domicilio();

		System.out.println("Ingresa tu calle");

		String calle = in.next();

		System.out.println("Ahora ingresa tu altura");

		int altura = in.nextInt();

		System.out.println("Solo falta tu ciudad");

		String ciudad = in.next();

		casa.setCiudad(ciudad);
		casa.setCalle(calle);
		casa.setAltura(altura);

		agustin.setCasa(casa);
		
		

		System.out.println(agustin.mostrarDomicilio());
		
		Alumno alu = new Alumno();
		
		System.out.println("Ingrese nombre");

		nombre = in.next();

		System.out.println("Ingrese apellido");

		apellido = in.next();

		alu.setNombre(nombre);
		alu.setApellido(apellido);

		System.out.println("Hola " + agustin.saludar());
		
		Domicilio casa2 = new Domicilio();
		
		casa2.equals(casa);
		
		alu.setCasa(casa2);
		
		casa2.setCalle("avellaneda");
		
		System.out.println(agustin.toString()); 
		
		System.out.println(alu.toString()); 

		
	}

	}

}
