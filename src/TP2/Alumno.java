package TP2;

public class Alumno {
	
	String nombre;
	String apellido;
	Domicilio casa;
	
	public Domicilio getCasa() {
		return casa;
	}

	public void setCasa(Domicilio casa) {
		this.casa = casa;
	}

	public Alumno() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String saludar() {
		
		return nombre + " " + apellido;
	}

	public String mostrarDomicilio() {
		
		String ksa;
		
		if(casa == null) {
			
			ksa = "Soy ciruja";
			
		}else {
			ksa = casa.toString();
		}
		
		return ksa;
		
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", casa=" + casa + "]";
	}



	
	
	
}
