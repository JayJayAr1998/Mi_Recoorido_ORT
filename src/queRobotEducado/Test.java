package queRobotEducado;

public class Test {

	public static void main(String[] args) {
		
		Persona paul = new Persona("Paul","Benitez");
		
		Robot bender = new Robot("Bender");
		
		bender.saludar();
		
		bender.saludar(paul);
		
	}

}
