package enunciado3;

import tp04.ejercicio1.*;
import tp02.ejercicio2.*;

/*
 * Implemente en la clase Parcial, que tiene como variable de instancia un ArbolGeneral<Integer>, el  método:
   "ListaGenerica<Integer> resolver()" 
   que devuelve en la lista la suma de los datos contenidos en los nodos del árbol que tienen un número impar de hijos. 
   Realice un recorrido en postorden.

   Ejemplo para el siguiente árbol:
   
  							   2	
					/	   	   |        \
				   /           |         \
				  1		       12		 14	
				/  \         / | \        
			   /    \       /  |  \       
			  5     4      8   4   7	 
				  / | \    |       | 
			     /  |  \   |       | 
			    9  10   5  3      13 
			    

   La lista contendrá los valores 24, 3, 13, 19, 27(Es postorden)
 */
public class Parcial3 {
	
	public Parcial3(ArbolGeneral<Integer> arbol) {
		this.arbol=arbol;
	}
	ArbolGeneral<Integer> arbol;
	
	public ListaGenerica<Integer> resolver(){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if(!arbol.esVacio()) {
			sumadorElementos(arbol,lista);
		}
		return lista;
	}
	
	private void sumadorElementos(ArbolGeneral<Integer> a, ListaGenerica<Integer> lista) {
		if(a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			int suma=0;
			ArbolGeneral<Integer> aux;
			hijos.comenzar();
			while(!hijos.fin()) {
				aux=hijos.proximo();
				sumadorElementos(aux,lista);
				suma = suma + aux.getDato();
			}
			if((hijos.tamanio()%2) !=0 ) {
				lista.agregarFinal(suma);
			}
		
		}
		
	}
}
