package corralitoCorralon;

public class CuentaBancaria {
	
	private String CBU;
	private TipoCuenta tipo;
	private Persona titular;
	private Double saldo;
	
	
	public CuentaBancaria(TipoCuenta cuenta, Persona titular) {
		setTipo(cuenta);
		setTitular(titular);
		setCBU();
		setSaldo(0D);
		
	}
	
	
	
	@Override
	public String toString() {
		
		String tipe;
		
		if(tipo.equals(TipoCuenta.CajaDeAhorro)) {
			
			tipe = "Caja de ahorro";
			
		}else {
			
			tipe = "Cuenta Corriente";
			
		}
		
		String titu = titular.getApellido() + " " + titular.getNombre();
		
		return "CuentaBancaria \nCBU= " + CBU + "\ntipo= " + tipe + "\ntitular= " + titu + "\nsaldo= $" + saldo;
	}



	public String getCBU() {
		return CBU;
	}


	private void setCBU() {
		String cBU = cbu();
		CBU = cBU;
	}


	public TipoCuenta getTipo() {
		return tipo;
	}


	private void setTipo(TipoCuenta tipo) {
		this.tipo = tipo;
	}


	public Persona getTitular() {
		return titular;
	}


	private void setTitular(Persona titular) {
		this.titular = titular;
	}


	public Double obtenerSaldo() {
		return saldo;
	}


	private void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Double monto) {
		
		Double total = obtenerSaldo() + monto;
		
		setSaldo(total);
		
	}
	
	public void extraer(Double monto) {
		
	Double total = obtenerSaldo() - monto;
	
	if(total<0) {
		
		System.out.println("Saldos insuficientes su monto excede los $" + obtenerSaldo() + " que hay en su cuenta");
		
	}else {
	
	setSaldo(total);	
		
	}
	}


	private String cbu() {
		
		String cebeu;
		String valorNominal;
		
		if(this.tipo.equals(TipoCuenta.CajaDeAhorro)) {
			
			cebeu = "cajadeahorro";
			
			valorNominal = String.valueOf(cebeu.length()+10);
			
		}else {
			
			cebeu = "cuentacorriente";
			
			valorNominal = String.valueOf(cebeu.length()+10);
			
		}
		
		String cbu = valorNominal + "-" + this.titular.getDNI() + "-" + this.titular.getDNI().charAt(this.titular.getDNI().length()-1);
		
		return cbu;
	}
	
	

	
	
}
