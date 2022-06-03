package enunciado12;

import tp02.ejercicio3.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class NivelArbol {
	private ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();

	
	
	public void setArbol(ArbolBinario<Integer> arbol) {
		this.arbol=arbol;
	}
	
	
	public ArbolBinario<Integer> minEnNivelesAB(int n){
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		ArbolBinario<Integer> aux;
		ArbolBinario<Integer> minHoja=null;
		int nivel=0;
		
		cola.encolar(arbol);
		cola.encolar(null);
		
		while((!cola.esVacia())&&(nivel<=n)){
			aux=cola.desencolar();
			if(aux != null) {
				
				if((nivel == n)&&(aux.esHoja())) {
					
					if((minHoja == null)||(aux.getDato()< minHoja.getDato())) 
						minHoja=aux;
						
				}	
					
				
				
				else {
					if(aux.tieneHijoIzquierdo()) {
						cola.encolar(aux.getHijoIzquierdo());
					}
					if(aux.tieneHijoDerecho()) {
						cola.encolar(aux.getHijoDerecho());
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
		return minHoja;
	}


}
