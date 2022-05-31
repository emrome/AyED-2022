package enunciado4;
import tp02.ejercicio2.*;
import tp04.ejercicio1.ArbolGeneral;

/*
 	Devolver el camino a la hoja más lejana. Si hubiese más de un camino de igual longitud máxima, 
	devolver el primero que encontremos 

 */

public class Parcial4 {
	public ListaGenerica<Integer> caminoMasLargo(ArbolGeneral<Integer> arbol){
		ListaGenerica<Integer> caminoMasLargo = new ListaEnlazadaGenerica<Integer>();
		ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<Integer>();
		if(!arbol.esVacio()) {
			buscarCamino(arbol,camino,caminoMasLargo);
		}
		
		return caminoMasLargo;
	}
	
	private void buscarCamino(ArbolGeneral<Integer> a,ListaGenerica<Integer> caminoAct,ListaGenerica<Integer> caminoMasLargo) {
		caminoAct.agregarFinal(a.getDato());
		
		if(a.esHoja()) {
			if(caminoAct.tamanio()>caminoMasLargo.tamanio()) {
				caminoMasLargo.comenzar();
				while(!caminoMasLargo.fin()) {
					caminoMasLargo.eliminar(caminoMasLargo.proximo());
				}
				caminoAct.comenzar();
				while(!caminoAct.fin()) {
					caminoMasLargo.agregarFinal(caminoAct.proximo());
				}
				
			}
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				buscarCamino(hijos.proximo(),caminoAct,caminoMasLargo);
				caminoAct.eliminarEn(caminoAct.tamanio());
			}
		}
		
	}
	
}
