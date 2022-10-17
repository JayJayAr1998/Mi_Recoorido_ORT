package queGrandeEstaTarjeta;

public class Test {

	public static void main(String[] args) {
		
		
		TarjetaDeCredito uala = new TarjetaDeCredito("4145-4141-2222-1111", "Juan Perez", 10000d);
		
		uala.realizarCompra(4000d);
		
		System.out.println(uala.toString());
		
		uala.aumentarLimite(3000d);
		
		uala.realizarCompra(4000d);
		
		System.out.println(uala.toString());
		
	}

}
