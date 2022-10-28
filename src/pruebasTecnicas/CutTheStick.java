package pruebasTecnicas;

import java.util.ArrayList;
import java.util.List;

public class CutTheStick {

	public static void main(String[] args) {
		
		int[] a = {5, 4, 4, 2, 2, 8};
		
		int[] b = cutTheStick(a);
		
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
	
	public static int[] cutTheStick(int[] a) {
		
	/*	int min;
		int pos;
		int[] ra;
		
		List<Integer> ae = new ArrayList<Integer>();
		List<Integer> ai = new ArrayList<Integer>();
		List<Integer> ao = new ArrayList<Integer>();
		
		for(int i = 0; i<a.length; i++) {
			
			ai.add(a[i]);
			
		}
		
		ae.add(a.length);
		
		for(int i = 0; i<a.length; i++) {
			
			min = Integer.MAX_VALUE;
			
			
			
			
			
			for(int b = 0; b<ai.size(); b++) {
				
				if(ai.get(b)<min) {
					min = ai.get(b);
				}
				
			}
			
			for(int j = 0; j<ai.size(); j++) {
				
				if	( ai.size()>1 ) {
					if(ai.get(j) == min) {
					
						ai.remove(j);
					
					}else {
					
					
						ao.add(ai.get(j) - min);
					
						
					}
			 }
			}
			
			ae.add(ao.size());
			
			ai = ao;
			ao.clear();
		}
		
		ra = new int[ae.size()];
		
		for(int i = 0; i<ae.size(); i++) {
			
			ra[i] = ae.get(i);
			
		}
		
		return ra;
		
		
		*/
		
		int min;
		List<Integer> cantidades = new ArrayList<Integer>();
		cantidades.add(a.length);
		List<Integer>nuevoArray = new ArrayList<Integer>();
		int[] b;
		
		for(int i = 0; i<a.length; i++) {
			
			nuevoArray.add(a[i]);
			
		}
		
		
		do {
			min = Integer.MAX_VALUE;
			
			
			for(int i = 0; i<nuevoArray.size(); i++) {

				if(nuevoArray.get(i)<min) {
					min = nuevoArray.get(i);
				}
			}
			
			for(int i = 0; i<=nuevoArray.size(); i++) {
				
				if(nuevoArray.get(0) <= min) {
					
					nuevoArray.remove(0);
					
				}else {
					
					nuevoArray.add(nuevoArray.get(0)-min);
					nuevoArray.remove(0);
					
				}
				
			}
			
			cantidades.add(nuevoArray.size());
			
		}while(nuevoArray.size()>1);
		
		b = new int[cantidades.size()];
		
		for(int i = 0; i<b.length; i++) {
			
			b[i] = cantidades.get(i);
			
		}
		
		
		return b;
	}

}
