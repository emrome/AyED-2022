package otro2;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Test2 {
	public static void main(String []args) {

		ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(-2);
		ArbolGeneral<Integer> hijo1 = new ArbolGeneral<Integer>(-1);
		ArbolGeneral<Integer> hijo2 = new ArbolGeneral<Integer>(-8);
		


		
		ArbolGeneral<Integer> nodo1 = new ArbolGeneral<Integer>(-5);
		ArbolGeneral<Integer> nodo2 = new ArbolGeneral<Integer>(-4);
		ArbolGeneral<Integer> nodo3 = new ArbolGeneral<Integer>(-13);
		
		ArbolGeneral<Integer> nodo4 = new ArbolGeneral<Integer>(18);
		ArbolGeneral<Integer> nodo5 = new ArbolGeneral<Integer>(-7);
		ArbolGeneral<Integer> nodo6 = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> nodo7 = new ArbolGeneral<Integer>(-3);
		
		ArbolGeneral<Integer> nodo8 = new ArbolGeneral<Integer>(-83);
		ArbolGeneral<Integer> nodo9 = new ArbolGeneral<Integer>(33);
		ArbolGeneral<Integer> nodo10 = new ArbolGeneral<Integer>(-6);
		ArbolGeneral<Integer> nodo11 = new ArbolGeneral<Integer>(17);
		ArbolGeneral<Integer> nodo12 = new ArbolGeneral<Integer>(9);
		
		
		arbol.agregarHijo(hijo1);
		arbol.agregarHijo(hijo2);


		
		hijo1.agregarHijo(nodo1);
		hijo1.agregarHijo(nodo2);
		
		hijo2.agregarHijo(nodo3);
		
		nodo1.agregarHijo(nodo4);
		
		nodo2.agregarHijo(nodo5);
		nodo2.agregarHijo(nodo6);
		nodo2.agregarHijo(nodo7);
		
		nodo4.agregarHijo(nodo8);
		
	
		nodo7.agregarHijo(nodo9);
		nodo7.agregarHijo(nodo10);
		nodo7.agregarHijo(nodo11);
		nodo7.agregarHijo(nodo12);
		
		ParcialOtro2 parcial = new ParcialOtro2();

		ListaGenerica<ListaEnlazadaGenerica<Integer>> lista = parcial.resolver(arbol);

		lista.comenzar();
		while(!lista.fin()) {
			System.out.println("LISTA: "+lista.proximo().toString());
		}
		
	}
}
