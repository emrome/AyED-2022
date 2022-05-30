package ejercicio5;
import tp04.ejercicio1.*;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.*;

public class AnalizadorArbol {
	
	public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa>arbol) {
		int promedio=0;
		if(!arbol.esVacio()) {
			promedio = buscarPromedioMax(arbol);
		}
		return promedio;
	}
	
	private int buscarPromedioMax(ArbolGeneral<AreaEmpresa> arbol) {
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		ArbolGeneral<AreaEmpresa> aux;
		int nodos=0;
		int promNivel;
		int promedioMax=0;
		int suma=0;
		int nivel=0;
		
		cola.encolar(arbol);
		cola.encolar(null);
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux !=null) {
				nodos++;
				suma = suma + aux.getDato().getTardanza();
				if(aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = aux.getHijos();
					hijos.comenzar();
					while(!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			}
			else {
				promNivel=(suma/nodos);	
				System.out.println("PROMEDIO NIVEL "+nivel+": "+promNivel);
				if(promNivel>promedioMax) promedioMax=promNivel;
				if(!cola.esVacia()) {
					cola.encolar(null); //!!!!!!!!!!!!!!!!!!!!!!!!!1
					suma=0;
					nodos=0;
					nivel++;
				}
				
			}
		
		}
		return promedioMax;
	}
	
}
