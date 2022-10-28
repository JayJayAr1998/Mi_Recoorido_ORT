package contradorAcumuladorPromedio;

public class Contador {
	
	private int num;
	
	
	public Contador() {
		setNum();
	}


	
	public int obtenerValor() {
		
		return this.num;
		
	}
	
	
	
	private void setNum() {
		
		this.num = 0;
		
	}
	
	
	public void incrementar() {
		
		this.num = this.num +1;
		
	}

}
