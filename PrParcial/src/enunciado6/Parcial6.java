package enunciado6;

import tp02.ejercicio3.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial6 {
	public static void colorearArbol(ArbolBinario<String> arbol, Integer maxColor) {
		ColaGenerica<ArbolBinario<String>> cola = new ColaGenerica<ArbolBinario<String>>();
		ArbolBinario<String> aux;
		
		int nivel=0;
		int pintados=0;
		
		cola.encolar(arbol);
		cola.encolar(null);
		while(!cola.esVacia()) {
			aux=cola.desencolar();
			if(aux != null) {
				if(pintados>=maxColor) {
					aux.setDato("Verde");
				}
				else {
					if((nivel % 2)==0) {
						aux.setDato("Negro");
					}
					else{
						aux.setDato("Rojo");
					}
				}
				pintados++;
				
				if(aux.tieneHijoIzquierdo()) {
					cola.encolar(aux.getHijoIzquierdo());
				}
				if(aux.tieneHijoDerecho()) {
					cola.encolar(aux.getHijoDerecho());
				}
				
			}
			else {
				if(!cola.esVacia()){
					cola.encolar(null);
					nivel++;
					pintados=0;
				}
			}
		}
	}
	
	public static void imprimirArbol(ArbolBinario<String> arbol) {
		ColaGenerica<ArbolBinario<String>> cola = new ColaGenerica<ArbolBinario<String>>();
		ArbolBinario<String> aux;
		int nivel=0;
		
		cola.encolar(arbol);
		cola.encolar(null);
		while(!cola.esVacia()) {
			aux=cola.desencolar();
			if(aux != null) {
				System.out.println(aux.getDato());
				if(aux.tieneHijoIzquierdo()) {
					cola.encolar(aux.getHijoIzquierdo());
				}
				if(aux.tieneHijoDerecho()) {
					cola.encolar(aux.getHijoDerecho());
				}
			}
			else {
				System.out.println("NIVEL "+nivel);
				if(!cola.esVacia()){
					cola.encolar(null);
					nivel++;
				}
			}
		}
	}
	
}
