package contradorAcumuladorPromedio;

public class Acumulador {

	int valor;
	
	public Acumulador() {
		setValor();
	}
	
	private void setValor() {
		
		this.valor = 0;
		
	}
	
	
	public void incrementar(int a) {
		
		this.valor = this.valor + a;
		
	}
	
	public int obtenerValor() {
	
	return this.valor;
	
	
	}
	
	
	
}
