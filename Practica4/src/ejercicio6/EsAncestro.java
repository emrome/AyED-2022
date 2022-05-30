package ejercicio6;

import tp04.ejercicio1.*;
import tp02.ejercicio2.*;

public class EsAncestro<T> {
	ArbolGeneral<T> arbol;
	
	public Boolean esAncestro(T a, T b) {
		ArbolGeneral<T> ArbolA=estaA(a,arbol);
		if(ArbolA.esVacio()) {
			ListaGenerica<T>listaDescendientes = hijosA(ArbolA);
			if(listaDescendientes.incluye(b));
			return true;
		}
		return false;
	}
	
	
	


	private ListaGenerica<T>hijosA (ArbolGeneral<T>aux){
		ListaGenerica<T> listaHijos = new ListaEnlazadaGenerica<T>();
		ListaGenerica<ArbolGeneral<T>> hijos = aux.getHijos();
		hijos.comenzar();
		while(!hijos.fin()) {
			descendientesA(aux,listaHijos);
		}
		return listaHijos;
	}
	
	private void descendientesA (ArbolGeneral<T>arbol,ListaGenerica<T> lista) {
		lista.agregarFinal(arbol.getDato());
		if(arbol.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = arbol.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				descendientesA(hijos.proximo(),lista);
			}
		}
	}
	
	private ArbolGeneral<T> estaA(T a,ArbolGeneral<T>arbol) {

		ArbolGeneral<T> aux=null;
		if(arbol.getDato().equals(a)) 
			aux=arbol;
		
		else {
			if(arbol.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijos = arbol.getHijos();
				hijos.comenzar();
				while((!hijos.fin())&&(aux ==null)) {
					aux=estaA(a,hijos.proximo());
				}
			}
		}
		return aux;
	}
}
