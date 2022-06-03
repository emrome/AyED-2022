package enunciado9;

import tp04.ejercicio1.ArbolGeneral;

/*
				   		  0	
			/	   	  |        |      \     
		   /          |        |       \
		  50		  12	  10        40
		 /            |        |
		/             |        |
	   10            50        80
  	  /  \            |        |
     /    \  		  |        | 
    50    50		  5        20
		  /          / \
		 /          /   \
		30         10   35
		|               | 
		|               |
	    5               50
	    |               |
		|               |
	    50              22
		 
*/

public class Test9 {
	public static void main(String []args) {
		
		
		ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(0);
		
		ArbolGeneral<Integer> hijo1 = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> hijo2 = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> hijo3 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> hijo4 = new ArbolGeneral<Integer>(40);
		
		ArbolGeneral<Integer> nodo1 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> nodo2 = new ArbolGeneral<Integer>(50);	
		ArbolGeneral<Integer> nodo3 = new ArbolGeneral<Integer>(80);
		
		ArbolGeneral<Integer> nodo4 = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> nodo5 = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> nodo6 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> nodo7 = new ArbolGeneral<Integer>(20);
		
		
		ArbolGeneral<Integer> nodo8 = new ArbolGeneral<Integer>(30);
		ArbolGeneral<Integer> nodo9 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> nodo10 = new ArbolGeneral<Integer>(35);
		
		ArbolGeneral<Integer> nodo11 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> nodo12 = new ArbolGeneral<Integer>(50);
		
		ArbolGeneral<Integer> nodo13 = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> nodo14 = new ArbolGeneral<Integer>(22);
		
		arbol.agregarHijo(hijo1);
		arbol.agregarHijo(hijo2);
		arbol.agregarHijo(hijo3);
		arbol.agregarHijo(hijo4);
		
		hijo1.agregarHijo(nodo1);
		hijo2.agregarHijo(nodo2);
		hijo3.agregarHijo(nodo3);
		
		
		nodo1.agregarHijo(nodo4);
		nodo1.agregarHijo(nodo5);
		nodo2.agregarHijo(nodo6);
		nodo3.agregarHijo(nodo7);
		
		nodo5.agregarHijo(nodo8);
		
		nodo6.agregarHijo(nodo9);
		nodo6.agregarHijo(nodo10);
		
		nodo8.agregarHijo(nodo11);
		nodo10.agregarHijo(nodo12);
		
		nodo11.agregarHijo(nodo13);
		nodo12.agregarHijo(nodo14);
		
		//arbol.porNiveles();
		ProcesadorGematria procesador = new ProcesadorGematria();
		System.out.println("CANT NOMBRES SUMA 195: "+procesador.contar(arbol, 195));
		
		
		
		
	}
}
