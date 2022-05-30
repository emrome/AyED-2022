package ejercicio3;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;


public class RecorridosAG {
	
	public static ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral <Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if(!a.esVacio()) {
			preOrden(a,n,lista);
		}
		return lista;
		
	}
	private static void preOrden(ArbolGeneral<Integer>arbol,Integer n,ListaGenerica<Integer> lista) {
		if(((arbol.getDato() % 2) != 0)&&(arbol.getDato()>n)) {
			lista.agregarFinal(arbol.getDato());
		}
		if(arbol.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = arbol.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				preOrden(hijos.proximo(),n,lista);
			}
		}
	}
	 
	
	public static ListaGenerica<Integer> numerosImparesMayoresQueInOrden (ArbolGeneral <Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if(!a.esVacio()) {
			inOrden(a,n,lista);
		}
		return lista;
	}
	
	private static void inOrden(ArbolGeneral<Integer>arbol,Integer n,ListaGenerica<Integer> lista) {
		ListaGenerica<ArbolGeneral<Integer>> hijos = arbol.getHijos();
		
		if(!hijos.esVacia()) {
			hijos.comenzar();
			inOrden(hijos.proximo(),n,lista);
		}
		if(((arbol.getDato() %2) != 0)&&(arbol.getDato()>n)){
			lista.agregarFinal(arbol.getDato());
		}
		while(!hijos.fin()) {
			inOrden(hijos.proximo(),n,lista);
		}
	}
	

	public static ListaGenerica<Integer> numerosImparesMayoresQuePostOrden (ArbolGeneral <Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if(!a.esVacio()) {
			postOrden(a,n,lista);
		}
		return lista;
	}
	private static void postOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
		if(a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				postOrden(hijos.proximo(),n,lista);
			}
		}
		if(((a.getDato() %2) != 0)&&(a.getDato()>n)){
			lista.agregarFinal(a.getDato());
		}
	}

	
	public static ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer>aux;
		
		cola.encolar(a);
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(((aux.getDato() %2)!= 0)&&(aux.getDato()>n)) {
				lista.agregarFinal(aux.getDato());
			}
			if(aux.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = aux.getHijos();
				while(!hijos.fin()) {
					cola.encolar(hijos.proximo());
				}
			}
			
		}
		return lista;
	}

}
