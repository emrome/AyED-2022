package enunciado7;

import tp02.ejercicio3.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;
/*
 Implemente en la clase Parcia el siguiente método:
 	colorearArbol(ArbolBinario<String> arbol,Integer n, Integer m)
 El método recibe un arbol incoloro y lo colorea segun el siguiente criterio:
 -Todos los nodos comprendidos entre los niveles n y m inclusive se colorean con Rojo.
 -El resto de los nodos se colorean con Negro
 
 El color se representa con un String
 
 Ejemplo:
  n=1 y m=2
 				O                                  "Negro"								
 			/       \                        /                \
 		   O         O				      "Rojo"             "Rojo"
 		  / \       / \        -->        /     \          /        \  
 		 O   O     O   O			   "Rojo"  "Rojo"   "Rojo"     "Rojo"
 	         |     |  / \                         |       |       /     \
 		     O     O O   O                     "Negro"  "Negro" "Negro""Negro"
  
 */
public class Parcial7 {
	public static void colorearArbol(ArbolBinario<String> arbol,Integer n, Integer m) {
		ColaGenerica<ArbolBinario<String>> cola = new ColaGenerica<ArbolBinario<String>>();
		ArbolBinario<String> aux;
		
		int nivel=0;

		
		cola.encolar(arbol);
		cola.encolar(null);
		while(!cola.esVacia()) {
			aux=cola.desencolar();
			if(aux != null) {
				
				if((nivel>=n)&&(nivel<=m)) {
						aux.setDato("Rojo");
				}
				else{
						aux.setDato("Negro");
				}
				
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
