package calculin;

public class Test {

	public static void main(String[] args) {
		
		Calculadora calculin = new Calculadora();
		
		System.out.println(calculin.sumar(1, 2));
		
		System.out.println(calculin.restar(1, 2));
		
		System.out.println(calculin.restar(2, 1));
		
		System.out.println(calculin.multiplicar(1, 2));
		
		System.out.println(calculin.dividir(1, 2));
		
		System.out.println(calculin.dividir(2, 1));
		
		System.out.println(calculin.dividir(1, 0));
		
		System.out.println(calculin.dividir(2, 0));
		
		System.out.println(calculin.dividir(0, 1));
		
		System.out.println(calculin.dividir(0, 2));
		
	}

}
