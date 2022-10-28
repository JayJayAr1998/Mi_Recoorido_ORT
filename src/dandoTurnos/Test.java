package dandoTurnos;

public class Test {

	public static void main(String[] args) {
		
		
		Turnera tur = new Turnera();
		
		System.out.println(tur.obtenerNumeroOtorgado());
		
		tur.otorgarTurnoNuevo();
		
		tur.otorgarTurnoNuevo();
		
		System.out.println(tur.obtenerNumeroOtorgado());
		
		tur.resetearContador(199);
		
		System.out.println(tur.obtenerNumeroOtorgado());
		
		tur.resetearContador();
		
		System.out.println(tur.obtenerNumeroOtorgado());
		
	}

}
