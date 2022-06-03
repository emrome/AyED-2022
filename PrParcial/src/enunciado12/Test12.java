package enunciado12;

import tp03.ejercicio1.ArbolBinario;

/*
 * 						 _____7_____
						/	        \
					   /             \
					 56		       	 25	
					/  \               \ 
				   /    \               \
				  38     31              6
				        /  \            /
			           /    \          /
			          87    94        4 
 */

public class Test12 {
	public static void main (String []args) {
		ArbolBinario<Integer> arbol7 = new ArbolBinario<Integer>(7);
		
		ArbolBinario<Integer> arbol56 = new ArbolBinario<Integer>(56);
		ArbolBinario<Integer> arbol25 = new ArbolBinario<Integer>(25);
		
		ArbolBinario<Integer> arbol38 = new ArbolBinario<Integer>(38);
		ArbolBinario<Integer> arbol31 = new ArbolBinario<Integer>(31);
		ArbolBinario<Integer> arbol6 = new ArbolBinario<Integer>(6);
		
		ArbolBinario<Integer> arbol87 = new ArbolBinario<Integer>(87);
		ArbolBinario<Integer> arbol94 = new ArbolBinario<Integer>(94);
		ArbolBinario<Integer> arbol4 = new ArbolBinario<Integer>(4);
		
		
		arbol7.agregarHijoIzquierdo(arbol56);
		arbol7.agregarHijoDerecho(arbol25);
		
		arbol56.agregarHijoIzquierdo(arbol38);
		arbol56.agregarHijoDerecho(arbol31);
		
		arbol25.agregarHijoIzquierdo(arbol6);
		
		arbol31.agregarHijoIzquierdo(arbol87);
		arbol31.agregarHijoDerecho(arbol94);
		
		
		arbol6.agregarHijoDerecho(arbol4);
		
		NivelArbol parcial = new NivelArbol();
		parcial.setArbol(arbol7);
		ArbolBinario<Integer> minima = parcial.minEnNivelesAB(2);
		
		if (minima!=null) 
			System.out.println(minima.getDato());
		else
			System.out.println("ES NULL");
		
		
	}
}
