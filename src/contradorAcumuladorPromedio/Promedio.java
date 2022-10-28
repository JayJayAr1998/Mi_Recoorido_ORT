package contradorAcumuladorPromedio;

public class Promedio {
	
	int prom;
	
	public Promedio() {
		
		setProm();
		
	}
	
	Acumulador acum = new Acumulador();
	Contador cont = new Contador();
	
	
	private void setProm() {
		
		this.prom=0;
		
	}
	
	public int obtenerValor() {
		
		return this.prom;
		
	}
	
	
	public void incrementar(int a) {
		cont.incrementar();
		acum.incrementar(a);
		
		int b = acum.obtenerValor() / cont.obtenerValor();
		
		this.prom = b;
		
	}

}
