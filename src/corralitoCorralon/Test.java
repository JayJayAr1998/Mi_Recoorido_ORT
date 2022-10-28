package corralitoCorralon;

public class Test {

	public static void main(String[] args) {
		
		Domicilio casa = new Domicilio("Yatay", "Almagro", 240);
		
		Persona Fulano = new Persona("Fulano","Gomez",casa,"12345678");
		
		Persona Anga = new Persona("Mengana","Torrez",casa,"9123456");
		
		CuentaBancaria fula = new CuentaBancaria(TipoCuenta.CajaDeAhorro,Fulano);
		
		CuentaBancaria Meng = new CuentaBancaria(TipoCuenta.CuentaCorriente,Anga);
		
		fula.depositar(500D);
		
		fula.extraer(200D);
		
		Meng.extraer(700D);
		
		System.out.println(fula.toString());
		
		
	}

}
