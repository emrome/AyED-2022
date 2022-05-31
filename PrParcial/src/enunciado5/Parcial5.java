package enunciado5;
import tp03.ejercicio1.*;
import tp02.ejercicio2.*;

/*
	Implemente en la clase Parcial,  el método con la siguiente firma: 
	  "resolver(ArbolBinario<Integer> arbol)"
	  
	Que devuelva una lista con los valores de los nodos que tengan el mismo número de 
	descendientes tanto por su subárbol izquierdo como por su subárbol derecho.

	Para el sig ejemplo:
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
 
	Debería devolver una lista con 2, 1,16 , 6, 22 
	2 tiene 3 descendientes tanto del lado izquierdo como derecho
	1 tiene 1 descendientes tanto del lado izquierdo como derecho
	16, 6 y 22 tienen 0 descendientes tanto del lado izquierdo como derecho
	
	- Debe respetar la clase y el método indicado. 
	- Puede definir todos métodos y variables que considere 
	- Todo aquel método que no esté definido en las prácticas debe ser implementado 
 */

public class Parcial5 {

	
	public static ListaGenerica<Integer> resolver (ArbolBinario<Integer> arbol){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if(!arbol.esVacio()) {
			descendientes(arbol,lista);
		}

		return lista;
	}
	
	private static void descendientes(ArbolBinario<Integer> arbol, ListaGenerica<Integer> lista) {
		int desIzq=0;
		int desDer=0;
		
		if(arbol.tieneHijoIzquierdo()) {
			desIzq = calcularDescendientes(arbol.getHijoIzquierdo(),lista);
		}
		if(arbol.tieneHijoDerecho()) {
			desDer = calcularDescendientes(arbol.getHijoDerecho(),lista);
		}
		if(desIzq == desDer) {
			lista.agregarInicio(arbol.getDato());
		}
		
	}
	
	private static int calcularDescendientes(ArbolBinario<Integer> a, ListaGenerica<Integer> lista) {
		lista.agregarFinal(a.getDato());
		if(a.esHoja()) {
			return 1;
		}
		else {
			int desIzq=0;
			int desDer=0;
			
			if(a.tieneHijoIzquierdo()) {
				desIzq = calcularDescendientes(a.getHijoIzquierdo(),lista);
			}
			if(a.tieneHijoDerecho()) {
				desDer = calcularDescendientes(a.getHijoDerecho(),lista);
			}
			if(desIzq != desDer) {
				lista.eliminar(a.getDato());
			}
			return 1 + desIzq + desDer;
		}
		
		
	}
	
	
}
