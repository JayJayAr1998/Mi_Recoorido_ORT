package pruebasTecnicas;

public class StringDados {

	public static void main(String[] args) {
		
		
		int[] A = {1,6,6,6,3,1};
		
		int z = solucion(A);
		
		System.out.println(z);
		
	}
	
	public static int solucion(int[] A) {
		
		int a = 0;
		int cont = 0;
		int may = 0;
		int c;
		
		for(int i = 0 ; a<A.length ; i++) {
			
			a = A[i];
			
			for(int b = 0; b<A.length; b++) {
				
				if(a == A[b]) {
					cont++;
				}
				
			}
			
			if(cont > may) {
				may = cont;
				cont = 0;
			}else {
				cont = 0;
			}
			
		}
		
		c = A.length - may;
		
		return c;
	}

}
