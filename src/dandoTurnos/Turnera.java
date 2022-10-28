package dandoTurnos;

public class Turnera {
	
	private int turno;
	
	public Turnera() {
		
		setTurno(0);
		
	}
	
	
	private void setTurno(int t) {
		
		this.turno = t;
	}
	
	public int obtenerNumeroOtorgado() {
		
		return turno;
	}
	
	public void resetearContador() {
		
		setTurno(0);
		
	}
	
	public void resetearContador(int a) {
		
		setTurno(a);
		
	}
	
	public void otorgarTurnoNuevo(){
		
		setTurno(obtenerNumeroOtorgado()+1);
		
	}

}
