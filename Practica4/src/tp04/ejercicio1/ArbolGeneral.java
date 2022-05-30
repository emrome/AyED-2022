package tp04.ejercicio1;


import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	public Integer altura() {
		int altura=-1;
		
		if(this.esHoja()) {
			return 0;
		}
		else {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				altura = Math.max(altura, hijos.proximo().altura());
			}
		}
		return altura + 1;
	}

	public Integer nivel(T dato) {
	
		ColaGenerica<ArbolGeneral<T>>cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> aux;
		Integer nivel=0;
		
		cola.encolar(this);
		cola.encolar(null);
		
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux != null) {
				if(aux.getDato().equals(dato)) {
					return nivel;
				}
				else {
					if(aux.tieneHijos()) {
						ListaGenerica<ArbolGeneral<T>> hijos = aux.getHijos();
						hijos.comenzar();
						while(!hijos.fin()) {
							cola.encolar(hijos.proximo());
						}
					}
				}
					
			}
			else {
				if(!cola.esVacia()) {
					cola.encolar(null);
					nivel++;
				}
			}	
		}
		
		return -1;
	}

	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> aux;
		int nodosMax=-1;
		
		cola.encolar(this);
		cola.encolar(null);
		int nodos=0;
		
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux != null) {
				nodos++;
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos = aux.getHijos();
					hijos.comenzar();
					while(!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			}
			else {
				if (nodos>nodosMax) 
					nodosMax=nodos;
					
				nodos=0;
				if (!cola.esVacia()) 
					cola.encolar(null);
					
			}
		}
		return nodosMax;
	}
	
	//metodos de la practica 4

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	private void preOrden(Integer n, ListaGenerica<T> lista) {
		//proceso raiz
		if(this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				hijos.proximo().preOrden(n,lista);
			}
		}
	}
	
	private void inOrden(Integer n, ListaGenerica<T> lista) {
		if(this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			hijos.comenzar();
			hijos.proximo().inOrden(n,lista);
		}
		//proceso raiz	
		if(this.tieneHijos()) {	
			while(!hijos.fin()) {
				hijos.proximo().inOrden(n,lista);
			}
		}
		
	}
	
	private void postOrden(Integer n, ListaGenerica<T> lista) {
		if(this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				hijos.proximo().postOrden(n,lista);
			}
		}
		//proceso raiz
	}
	
	public void porNiveles(){

		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T>aux;
		
		cola.encolar(this);
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			System.out.println(aux.getDato().toString());
			if(aux.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijos = aux.getHijos();
				while(!hijos.fin()) {
					cola.encolar(hijos.proximo());
				}
			}
			
		}
		
	}
	
	public ListaGenerica<T> numerosImparesMayoresQuePreOrden (Integer n){
		ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
		if(!this.esVacio()) {
			this.preOrden(n,lista);
		}
		return lista;
		
	}
	
	public ListaGenerica<T> numerosImparesMayoresQueInOrden (Integer n){
		ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
		if(!this.esVacio()) {
			this.inOrden(n,lista);
		}
		return lista;
	}
	
	public ListaGenerica<T> numerosImparesMayoresQuePostOrden ( Integer n){
		ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
		if(!this.esVacio()) {
			this.postOrden(n,lista);
		}
		return lista;
	}
	
	
	//ejercicio 6
	public Boolean esAncestro(T a, T b) {

		ArbolGeneral<T> arbolA = this.estaA(a);
		
		if(!arbolA.esVacio()) {
			ListaGenerica<T>listaDescendientes = listaDescendientesA(arbolA);
			if(listaDescendientes.incluye(b))
				return true;
		}
		return false;
	}
	
	private ArbolGeneral<T> estaA(T a) {

		ArbolGeneral<T> aux=null;
		if(this.getDato().equals(a)) 
			aux=this;
		
		else {
			if(this.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
				hijos.comenzar();
				while((!hijos.fin())&&(aux ==null)) {
					aux=hijos.proximo().estaA(a);
				}
			}
		}
		return aux;
	}
	
	private ListaGenerica<T>listaDescendientesA(ArbolGeneral<T>arbol){
		ListaGenerica<T> listaHijos = new ListaEnlazadaGenerica<T>();
		if(arbol.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = arbol.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				descendientesA(hijos.proximo(),listaHijos);
			}
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
	
	
}


	
