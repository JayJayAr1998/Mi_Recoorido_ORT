package corralitoCorralon;

public class Persona {
	
	private String nombre, apellido;
	
	private Domicilio casa;
	
	private String DNI;
	

	
	public Persona(String nombre, String apellido, Domicilio casa, String dNI) {
		setNombre(nombre);
		setApellido(apellido);
		setCasa(casa);
		setDNI(dNI);
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

	public Domicilio getCasa() {
		return casa;
	}

	public void setCasa(Domicilio casa) {
		this.casa = casa;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI2) {
		DNI = dNI2;
	}
	
	
	

}
