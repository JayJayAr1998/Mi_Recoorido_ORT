package tirandoElDado;

public class Prueba {

	public static void main(String[] args) {
		
		Double promR=0d , promO =0d;
		
		
		Dado odao = new Dado(6);
		
		Dado raul = new Dado(2);
		
		raul.tirarDado();
		
		odao.tirarDado();
		
		
		System.out.println();
		
		if(raul.getValor() == odao.getValor()) {
			
			System.out.println("Son iguales");
			
		}else if(raul.getValor() > odao.getValor()) {
			
			System.out.println("El dado raul tiene mayor valor");
			
		}else {
			
			System.out.println("El dado odao tiene mayor valor");
			
		}
		
		for(int i=0; i<100 ; i++) {
			
			raul.tirarDado();
			
			odao.tirarDado();
			
			promR += raul.getValor();
			
			promO += odao.getValor();			
		}
		
		promR = promR / 100;
		
		promO = promO / 100;
		
		System.out.println("El promedio de 100 tiradas de raul es de " + promR);
		
		System.out.println("El promedio de 100 tiradas de odao es de " + promO);
		
	}

}
