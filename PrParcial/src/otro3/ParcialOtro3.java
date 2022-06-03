package otro3;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class ParcialOtro3 {
	
	
	public Boolean resolver(ArbolGeneral<Integer> arbol, int k1,int k2) {
		
		if(!arbol.esVacio()) {
			return resolverPrivate(arbol,k1,k2);
		}
		
		return false;
	}
	
	private ArbolGeneral<Integer> estaA(ArbolGeneral<Integer> a,int k1) {
	
		if(a.getDato()==k1) 
			return a;
		
		else {
			ArbolGeneral<Integer> aux=null;
			if(a.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
				hijos.comenzar();
				while((!hijos.fin())&&(aux ==null)) {
					aux=(estaA(hijos.proximo(),k1));
				}
			}
			return aux;
		}
		
	}
	
	private Boolean estaB (ArbolGeneral<Integer>arbol,int k2){
		if(arbol.getDato()==k2) 
			return true;
		
		else {
			Boolean esta=false;
			if(arbol.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = arbol.getHijos();
				hijos.comenzar();
				while((!hijos.fin())&&(!esta)) {
					esta=(estaB(hijos.proximo(),k2));
				}
			}
			return esta;
		}
	}
	
	
	private Boolean resolverPrivate (ArbolGeneral<Integer>arbol,int k1, int k2) {
		Boolean ok=false;
		ArbolGeneral<Integer> aux = estaA(arbol,k1);
		if(aux != null) {
			ok=estaB(aux,k2);
		}
		return ok;	
	}
	
}
