package ligaDeLosProgramadores;

public class Test {

	public static void main(String[] args) {
		
		SuperHeroe superman = new SuperHeroe("SuperMan",95,60,70);
		
		SuperHeroe batman = new SuperHeroe("BATMAN", 90,70,0);
		
		SuperHeroe sperman = new SuperHeroe("Hombre que Araña",95,60,70);
		
		batman.competir(superman);
		
		superman.competir(batman);
		
		superman.competir(sperman);
		
		System.out.println(sperman.toString());
		
	}

}
