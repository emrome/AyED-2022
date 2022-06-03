package enunciado8;

import tp02.ejercicio2.*;
import tp04.ejercicio1.ArbolGeneral;

/*
 * Sea un arbol general en donde cada nodo tiene un valor numerico. Usted debe devolver el camino determinado por el valor
 * que posee cada nodo. Es decir, el camino comienza en el nodo raiz, luego debe seguir con el hijo que se encuntra en la 
 * posicion indicada por el valor numerico en el nodo raiz. Y asi hasta llegar a una hoja. 
 * Ejemplo:
 * 							  (G,1)	
					/	   	    |         \
				   /            |          \
				 (E,3)	       (F,2)  	  (J,5)	 
			   /  |   \          |         /   \     
			  /   |    \         |        /     \
		 (A,7)  (B,9)  (C,6)   (D,10)   (H,6)  (I,10)
			    
			    
 * Debe retorna el camino GEC
 */

public class Parcial8 {
	public static ListaGenerica<Character> camino (ArbolGeneral<Datos> arbol){
		ListaGenerica<Character> lista = new ListaEnlazadaGenerica<Character>();
		if(!arbol.esVacio()) {
			buscarCamino(arbol,lista);
		}
		return lista;
	}
	
	private static void buscarCamino(ArbolGeneral<Datos> a, ListaGenerica<Character> l) {
		l.agregarFinal(a.getDato().getId());
		if(a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Datos>> hijos = a.getHijos();
			if(hijos.tamanio()>=a.getDato().getValorNumerico()) {
				buscarCamino(hijos.elemento(a.getDato().getValorNumerico()),l);
			}
		}
		
	}
}
