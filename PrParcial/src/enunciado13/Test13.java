package enunciado13;

import tp04.ejercicio1.ArbolGeneral;

public class Test13 {
	public static void main(String []args) {
		/*
							   2	
					/	   	   |        \
				   /           |         \
				  1		       12		 14	
				/  \         / | \        
			   /    \       /  |  \       
			  5     4      88   4   7	 
				  / | \    |       | 
			     /  |  \   |       | 
			    9  10   5  3      13 

		 */
		ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> hijo1 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> hijo2 = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> hijo3 = new ArbolGeneral<Integer>(14);

		
		ArbolGeneral<Integer> nodo1 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> nodo2 = new ArbolGeneral<Integer>(4);
		
		ArbolGeneral<Integer> nodo3 = new ArbolGeneral<Integer>(88);
		ArbolGeneral<Integer> nodo4 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> nodo5 = new ArbolGeneral<Integer>(7);
		
		ArbolGeneral<Integer> nodo6 = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> nodo7 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> nodo8 = new ArbolGeneral<Integer>(5);
		
		ArbolGeneral<Integer> nodo9 = new ArbolGeneral<Integer>(3);
		
		ArbolGeneral<Integer> nodo10 = new ArbolGeneral<Integer>(13);
		
		arbol.agregarHijo(hijo1);
		arbol.agregarHijo(hijo2);
		arbol.agregarHijo(hijo3);

		
		hijo1.agregarHijo(nodo1);
		hijo1.agregarHijo(nodo2);
		
		hijo2.agregarHijo(nodo3);
		hijo2.agregarHijo(nodo4);
		hijo2.agregarHijo(nodo5);
		
		nodo2.agregarHijo(nodo6);
		nodo2.agregarHijo(nodo7);
		nodo2.agregarHijo(nodo8);
		
		nodo3.agregarHijo(nodo9);
		
		nodo5.agregarHijo(nodo10);
		
		BuscadorArbol parcial = new BuscadorArbol(arbol);
		System.out.println(parcial.buscarMayorEnPostOrden());
		
	}
}
