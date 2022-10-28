package pruebasTecnicas;

public class ArrayMayor {

	public static void main(String[] args) {
		
		
		int[] A = {12, 1 , 13, 4, 105};
		
		System.out.println(solucion(A));
		
		
		
	}
	
	public static int solucion(int[] A) {
		
		int m = -10;
		
		for(int i = 0 ; i<A.length; i++) {
			
			if(A[i] > -10 && A[i] < 10) {
				
				m = A[i];
			}
 			
		}
		
		
	    for(int j = 0 ;j<A.length; j++){

	        if(A[j] > m && (A[j] > -10 && A[j] < 10)){
	            m=A[j];
	        }


	    }
		
		
		
		
		return m;
	}

}
