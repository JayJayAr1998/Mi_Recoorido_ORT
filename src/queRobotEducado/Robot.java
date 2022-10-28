package queRobotEducado;

public class Robot {
	
	String modelo;
	
	public Robot(String modelo) {
		
		setModelo(modelo);
		
	}
	
	
	public void setModelo(String a) {
		
		this.modelo = a;
	}
	
	public String getModelo() {
		
		return this.modelo;
	}
	
	
	public void saludar() {
		
		System.out.println("Hola, mi nombre es " + this.modelo + ". ¿En qué puedo ayudarte?");
		
	}
	
	
	public void saludar(Persona laureano) {
		
	System.out.println("Hola " + laureano.getNombre() + " , mi nombre es " + this.modelo + ". ¿En qué puedo ayudarte?");
		
	}

}