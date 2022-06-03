package otro2;

import tp02.ejercicio2.*;
import tp04.ejercicio1.ArbolGeneral;

public class ParcialOtro2 {
	public ListaGenerica<ListaEnlazadaGenerica<Integer>> resolver (ArbolGeneral<Integer> arbol){
		ListaEnlazadaGenerica<Integer> camino = new ListaEnlazadaGenerica<Integer>();
		ListaGenerica<ListaEnlazadaGenerica<Integer>> caminos = new ListaEnlazadaGenerica<ListaEnlazadaGenerica<Integer>>();
		if(!arbol.esVacio()) {
			resolverRec(arbol,camino,caminos);
		}
		return caminos;
	}
	
	private void resolverRec(ArbolGeneral<Integer> a,ListaEnlazadaGenerica<Integer> camino,ListaGenerica<ListaEnlazadaGenerica<Integer>> caminos ) {

		camino.agregarFinal(a.getDato());
		if(a.getDato()<0) {
			if(a.esHoja()) {
				caminos.agregarFinal((ListaEnlazadaGenerica<Integer>) camino.clonar());
				
			}
			else {
				ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
				hijos.comenzar();
				while(!hijos.fin()) {
					resolverRec(hijos.proximo(),camino,caminos);
					camino.eliminarEn(camino.tamanio());
				}
			}
		}
	}
}
