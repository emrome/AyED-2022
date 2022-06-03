package enunciado13;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class BuscadorArbol {
	ArbolGeneral<Integer> arbol;
	
	
	public BuscadorArbol(ArbolGeneral<Integer> arbol) {
		this.arbol=arbol;
	}
	
	public Integer buscarMayorEnPostOrden() {
		if (!arbol.esVacio ()) 
			return buscarMaximoRecursivo (arbol); 
		return -1; 
	}
	
	private Integer buscarMaximoRecursivo (ArbolGeneral <Integer> a) { 
		if(a.esHoja()) 
			return a.getDato();
		
		else {
			Integer max= -1;
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos(); 
			hijos.comenzar();
			while (!hijos.fin()){ 
				max = Math.max(max,buscarMaximoRecursivo (hijos.proximo()));
			}

			return Math.max (max, a.getDato()); 
			
		}
		 
		
	}
}
