package tp2_p1_a_p5;

public class Domicilio {
	
	String ciudad;
	String calle;
	int altura;
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Domicilio() {
		
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Domicilio [ciudad=" + ciudad + ", calle=" + calle + ", altura=" + altura + "]";
	}

	

}
