package ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;


public class ArbolGeneralAux <T>{
	private T dato;

	private ListaGenerica<ArbolGeneralAux<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneralAux<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneralAux<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneralAux<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneralAux(T dato) {
		this.dato = dato;
	}

	public ArbolGeneralAux(T dato, ListaGenerica<ArbolGeneralAux<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneralAux<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneralAux<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneralAux<T> unHijo) {
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
	
	private void preOrden() {
		//proceso raiz
		if(this.tieneHijos()) {
			ListaGenerica<ArbolGeneralAux<T>> hijos = this.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				hijos.proximo().preOrden();
			}
		}
	}
	
	private void inOrden() {
		if(this.tieneHijos()) {
			ListaGenerica<ArbolGeneralAux<T>> hijos = this.getHijos();
			hijos.comenzar();
			hijos.proximo().inOrden();
		}
		//proceso raiz	
		if(this.tieneHijos()) {	
			while(!hijos.fin()) {
				hijos.proximo().inOrden();
			}
		}
		
	}
	
	private void postOrden() {
		if(this.tieneHijos()) {
			ListaGenerica<ArbolGeneralAux<T>> hijos = this.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				hijos.proximo().postOrden();
			}
		}
		//proceso raiz
	}
	
	private void porNiveles( Integer n){
		ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
		ColaGenerica<ArbolGeneralAux<T>> cola = new ColaGenerica<ArbolGeneralAux<T>>();
		ArbolGeneralAux<T>aux;
		
		cola.encolar(this);
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			lista.agregarFinal(aux.getDato());
			
			if(aux.tieneHijos()) {
				ListaGenerica<ArbolGeneralAux<T>> hijos = aux.getHijos();
				while(!hijos.fin()) {
					cola.encolar(hijos.proximo());
				}
			}
			
		}
	}
}
