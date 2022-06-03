package enunciado6;

import tp02.ejercicio3.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

/*
Implemente en la clase Parcia el siguiente método:
	colorearArbol(ArbolBinario<String> arbol,Integer maxColor)
El método recibe un arbol incoloro y lo colorea segun el siguiente criterio:
- La raiz se colorea con "Negro" 
- En los siguientes niveles se van intercalando entre el "Rojo" y el "Negro"
- No puede haber un nivel con mas que "maxColor" cantidad de nodos pintados con Rojo o Negro, 
  con lo cual si se supera esa cantidad, los nodos restantes se deben pintar de "Verde"


El color se representa con un String

Ejemplo:
 maxColor=3
				O                                  "Negro"								
			/       \                        /                 \
		   O         O				       "Rojo"              "Rojo"
		  / \       / \        -->        /      \           /        \  
		 O   O     O   O			   "Negro"  "Negro"  "Negro"   "Verde"
	         |     |  / \                          |        |       /     \
		     O     O O   O                      "Rojo"    "Rojo" "Rojo"  "Verde"
 
*/

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
				System.out.println(aux.getDato());
				pintados++;
				
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
					pintados=0;
				}
			}
		}
	}
	
	
}
