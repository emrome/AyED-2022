package enunciado5;


import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;


public class Test5 {
	public static void imprimirArbol(ArbolBinario<Integer> a) {
		System.out.println(a.toString());
		if(a.tieneHijoIzquierdo()) {
			imprimirArbol(a.getHijoIzquierdo());
		}
		if(a.tieneHijoDerecho()) {
			imprimirArbol(a.getHijoDerecho());
		}
	}
	public static void main(String []args) {
		/*
					          2	
						/	        \
					   /             \
					  1		       	  5	
					/  \               \ 
				   /    \               \
				  16     6      	 	8
				  					   /
				  					  /
				  					 22
				 

*/
		ArbolBinario<Integer> arbol2 = new ArbolBinario<Integer>(2);
		
		ArbolBinario<Integer> arbol1 = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> arbol5 = new ArbolBinario<Integer>(5);
		
		ArbolBinario<Integer> arbol16 = new ArbolBinario<Integer>(16);
		ArbolBinario<Integer> arbol6 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> arbol8 = new ArbolBinario<Integer>(8);
		ArbolBinario<Integer> arbol22 = new ArbolBinario<Integer>(22);
		
		arbol2.agregarHijoIzquierdo(arbol1);
		arbol2.agregarHijoDerecho(arbol5);
		
		arbol1.agregarHijoIzquierdo(arbol16);
		arbol1.agregarHijoDerecho(arbol6);
		
		arbol5.agregarHijoDerecho(arbol8);
		
		arbol8.agregarHijoIzquierdo(arbol22);
		
		System.out.println("ARBOL: ");
		imprimirArbol(arbol2);
		
		ListaGenerica<Integer> lista = Parcial5.resolver(arbol2);
		System.out.println("LISTA DE NODOS CON MISMA CANTIDAD DE DESCENDIENTES EN SUS SUBARBOLES: "+lista.toString());
		
		
	}
	
}
