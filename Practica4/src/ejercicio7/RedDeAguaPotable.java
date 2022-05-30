package ejercicio7;
import tp04.ejercicio1.*;
import tp02.ejercicio2.*;

public class RedDeAguaPotable<T> {
	ArbolGeneral<T> estructura;
	
	public RedDeAguaPotable(ArbolGeneral<T>estructura) {
		this.estructura=estructura;
	}
	
	public double minimoCaudal(double caudal) {
		double minCaudal=caudal;
		if((!estructura.esVacio())&&(!estructura.esHoja())) {
			minCaudal=caudalMinimo(estructura,caudal);
		}
		
		return minCaudal;
	}
	
	private double caudalMinimo(ArbolGeneral<T>arbol,double caudal) {
		double minCaudal=caudal;
		
		if(arbol.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = arbol.getHijos();
			double caudalHijos= (double)(caudal/hijos.tamanio());
			hijos.comenzar();
			while(!hijos.fin()) {
				minCaudal= Math.min(minCaudal,caudalMinimo(hijos.proximo(),caudalHijos));	
				
			}			
		}
		return minCaudal;
	}
	
	
}
