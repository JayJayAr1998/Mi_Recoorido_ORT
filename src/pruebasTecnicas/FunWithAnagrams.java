package pruebasTecnicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunWithAnagrams {

	public static void main(String[] args) {
		
		String[] hola = {"noba", "butaquera", "bano","anob","chapon"};
		
		List<String> laura = new ArrayList<String>();
		
		laura = solucion(hola);
		
		for(String holas: laura) {
			System.out.println(holas);
		}

	}
	
	public static List<String> solucion(String[] a) {
		
		List<String> g = new ArrayList<String>();
		
		for(int i = 0; i<a.length; i++) {
			
			g.add(a[i]);
			
		}
		
		for(int i = 0; i<g.size(); i++) {
			
			for(int b = 1; b<g.size();b++) {
				
				if(ana(g.get(i),g.get(b))) {
					
					g.remove(b);
					
				}
				
			}
			
		}
		
		
		
		return g;
		
	}
	
	public static Boolean ana(String a,String b) {
		
		char[] ai = new char[a.length()];
		char[] bi = new char[b.length()];
		Boolean ana;
		int cont = 0;
		Arrays.sort(ai);
		Arrays.sort(bi);
		
		for(int i = 0; i<ai.length; i++) {
			
			ai[i] = a.charAt(i);
			
		}
		
		for(int i = 0; i<bi.length; i++) {
			
			bi[i] = b.charAt(i);
			
		}
		
		if(bi.length==ai.length) {
			
			for(int i = 0; i<bi.length; i++) {
				if(ai[i] == bi[i]) {
					
					cont++;
					
				}
			}
			
			if(cont==bi.length) {
				
				ana = true;
				
			}else {
				ana = false;
			}
			
		}else {
			
			ana = false;
			
		}
		
		
		return ana;
	}

}
