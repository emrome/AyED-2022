package otro1;


import tp02.ejercicio2.*;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class ParcialOtro {
	
	public Datos resolver(ArbolGeneral<Integer> arbol) {
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		Datos datos = new Datos();
		ArbolGeneral<Integer> aux;
		
		int nivel=0;
		int nivelMin=-1;
		int suma=0;
		int sumaMin=9999;
		
		ListaGenerica<Integer> listaAct = new ListaEnlazadaGenerica<Integer>();
		
		
		cola.encolar(arbol);
		cola.encolar(null);
		
		while(!cola.esVacia()) {
			
			aux = cola.desencolar();
			if(aux != null) {

				listaAct.agregarFinal(aux.getDato());
				suma=suma+aux.getDato();
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<Integer>> hijos = aux.getHijos();
					hijos.comenzar();
					while(!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			}
			
			else {
				if(suma<sumaMin) {
					sumaMin=suma;
					nivelMin=nivel;
					datos.setListaSuma(listaAct.clonar());
					
				}
				if(!cola.esVacia()) {
					cola.encolar(null);
					nivel++;
					suma=0;
					
					listaAct.comenzar();
					while(!listaAct.fin()) {
						listaAct.eliminar(listaAct.proximo());
				   }
				
				}
			}
				
		}


		datos.setNivel(nivelMin);
		return datos;
	}
}
