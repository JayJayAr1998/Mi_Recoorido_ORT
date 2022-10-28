package corralitoCorralon;

public class Domicilio {
	
	private String calle, barrio;
	private int altura;
	
	
	public Domicilio(String calle, String barrio, int altura) {
		setCalle(calle);
		setBarrio(barrio);
		setAltura(altura);
	}
	
	
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	
	
	
}
