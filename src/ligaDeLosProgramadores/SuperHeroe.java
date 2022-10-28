package ligaDeLosProgramadores;

public class SuperHeroe {
	
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	public SuperHeroe(String nombre, int fuerza, int resistencia,int superpoderes ) {
		
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
		
	}
	
	
	private void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	private void setFuerza(int f) {
		
		if(f<0) {
			f = 0;
		}else if(f>100) {
			f=0;
		}
		
		
		this.fuerza = f;
		
	}
	
	private void setResistencia(int r) {
		
		if(r<0) {
			r = 0;
		}else if(r>100) {
			r=0;
		}
		
		
		this.resistencia = r;
		
	}
	
	private void setSuperpoderes(int s) {
		
		if(s<0) {
			s = 0;
		}else if(s>100) {
			s=0;
		}
		
		
		this.superpoderes = s;
		
	}


	@Override
	public String toString() {
		return "SuperHeroe \nnombre=" + nombre + " \nfuerza=" + fuerza + " \nresistencia=" + resistencia
				+ " \nsuperpoderes=" + superpoderes;
	}
	
	public int getFuerza() {
		
		return this.fuerza;
	}
	
	public void competir(SuperHeroe sup) {
		
		int s1 = 0;
		
		int s2 = 0;
		
		if(this.fuerza < sup.getFuerza()) {
			
			s2++;
			
		}else if(this.fuerza > sup.getFuerza()) {
			
			s1++;
			
		}
		
		if(this.resistencia < sup.getResistencia()) {
			
			s2++;
			
		}else if(this.resistencia > sup.getResistencia()) {
			
			s1++;
			
		}
		
		if(this.superpoderes < sup.getSuperpoderes()) {
			
			s2++;
			
		}else if(this.superpoderes > sup.getSuperpoderes()) {
			
			s1++;
			
		}
		
		if(s1>s2) {
			
			System.out.println("TRIUNFO");
			
		}else if(s1<s2) {
			
			System.out.println("DERROTA");
			
		}else {
			
			System.out.println("EMPATE");
			
		}
		
	}


	private int getSuperpoderes() {
		return this.superpoderes;
	}


	private int getResistencia() {
		return this.resistencia;
	}
	
}
