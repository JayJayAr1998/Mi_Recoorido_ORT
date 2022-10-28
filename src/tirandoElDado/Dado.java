package tirandoElDado;

public class Dado {
	
	int cara;
	
	
	
	public Dado(int cara) {
		setCara(cara);
	}
	
	
	public void setCara(int cara) {
		
		if(cara >= 1 && cara <= 6) {
		
		this.cara = cara;
		
		}else {
			
			cara =  (int)(Math.random() * 6) + 1;
			
			System.err.println("Numero no valido para un dado, se te asignara " + cara);
			
			this.cara = cara;
			
		}
		
	}
	
	public int getValor() {
		
		return cara;
		
	}
	
	public void tirarDado() {
		
		cara =  (int)(Math.random() * 6) + 1;
		
	}
}
