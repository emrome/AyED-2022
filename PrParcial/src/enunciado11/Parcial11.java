package enunciado11;

import tp02.ejercicio3.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class Parcial11 {
	public boolean esArbolCreciente(ArbolBinario<Integer>arbol) {
		boolean ok=true;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		ArbolBinario<Integer> aux;
		int nodos=0;
		int nivel=0;
		
		cola.encolar(arbol);
		cola.encolar(null);
		while(!cola.esVacia() && ok) {
			aux = cola.desencolar();
			if(aux != null) {
				nodos++;
				if(aux.tieneHijoIzquierdo())
					cola.encolar(aux.getHijoIzquierdo());
				if(aux.tieneHijoDerecho())
					cola.encolar(aux.getHijoDerecho());
				
			}
			else {
				if(nodos != (nivel+1)) {
					ok = false;
				}
				else {
					if(!cola.esVacia()) {
						nodos=0;
						nivel++;
						cola.encolar(null);
					}
				}
			}
			
		}
		
		return ok;
	}
}
