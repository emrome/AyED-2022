/*
	Dado un arbol general, encontrar todos los caminos desde la raiz hasta una hoja, tales que
	la cantidad de nodos en el camino sea un numero par.
	Escribir el siguiente metodo dentro de la clase Parcial: 
		"public ?? caminosPares (ArbolGeneral<Character> arbol)"


*/

package enunciado1;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial1 {
	public static ListaGenerica<ListaGenerica<Character>> caminosPares (ArbolGeneral<Character> arbol){
		ListaEnlazadaGenerica<Character> camino = new ListaEnlazadaGenerica<Character>();
		ListaGenerica<ListaGenerica<Character>> caminos = new ListaEnlazadaGenerica<ListaGenerica<Character>>();
		if(!arbol.esVacio()) {
			buscarCaminoPar(arbol,camino,caminos);
		}
		return caminos;
	}

	private static void buscarCaminoPar(ArbolGeneral<Character> a, ListaEnlazadaGenerica<Character> caminoActual,
			ListaGenerica<ListaGenerica<Character>> caminosPares) {
		caminoActual.agregarFinal(a.getDato());
		if(a.esHoja()) {
			if((caminoActual.tamanio()%2) == 0) {
				ListaGenerica<Character> camino = caminoActual.clonar();
				caminosPares.agregarFinal(camino);

			}
		}
		else {
			ListaGenerica<ArbolGeneral<Character>> hijos = a.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				buscarCaminoPar(hijos.proximo(),caminoActual,caminosPares);
				caminoActual.eliminarEn(caminoActual.tamanio());
			}
		}
		
	}
}
