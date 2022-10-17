package queGrandeEstaTarjeta;

public class TarjetaDeCredito {
	
	private String numero;
	private String titular;
	private Double limiteDeCompra;
	private Double acumuladoActual;
	
	
	public TarjetaDeCredito(String numero, String titular, Double limiteDeCompra) {
		setNumero(numero);
		setTitular(titular);
		setLimiteDeCompra(limiteDeCompra);
		this.acumuladoActual = 0d;
	}
	
	public Boolean realizarCompra(Double com) {
		
		Boolean ojt;
		
		if(compraPosible(com)) {
			ojt = true;
			
			acumularGastoActual(com);
			
		}else {
			ojt = false;
		}
		
		return ojt;
	}
	
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + ", montoDisponible=" + montoDisponible() + "]";
	}

	public void acumularGastoActual(Double jiji) {
		
		acumuladoActual += jiji;
		
	}
	
	public void aumentarLimite(Double jaja) {
		
		this.limiteDeCompra = jaja;
		
	}
	
	public Double montoDisponible() {
		Double monto = limiteDeCompra - acumuladoActual;
		if(monto < 0) {
			monto = 0d;
		}
		
		return monto;
	}
	
	private Boolean compraPosible(Double num) {
		Boolean sePuede;
		
		if(num < montoDisponible()) {
			sePuede = true;
		}else {
			sePuede = false;
		}
		
		return sePuede;
	}
	
	
	public String getNumero() {
		return numero;
	}





	private void setNumero(String numero) {
		this.numero = numero;
	}





	public String getTitular() {
		return titular;
	}





	private void setTitular(String titular) {
		this.titular = titular;
	}





	public Double getLimiteDeCompra() {
		return limiteDeCompra;
	}





	private void setLimiteDeCompra(Double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}





	public Double getAcumuladoActual() {
		return acumuladoActual;
	}






}
