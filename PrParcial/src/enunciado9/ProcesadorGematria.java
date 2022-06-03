package enunciado9;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class ProcesadorGematria {
	
	public int contar(ArbolGeneral<Integer>a,int valor) {
		int resta =valor - a.getDato();
		if(a.esHoja()&&(resta==0) ) 
				return 1;
		
		else {
			int cant=0;
			if(resta>0) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
				hijos.comenzar();
				while(!hijos.fin()) {
					cant=cant+contar(hijos.proximo(),resta);
				}
			}
			return cant;
		}
	}
}
