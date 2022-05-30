package ejercicio3;
import tp04.ejercicio1.*;
import tp02.ejercicio2.*;


public class testRecorridos {
	
	
	
	public static void main (String []args) {
		/*
		 									  11	
		 							/	   	   |        \
								   /           |         \
 	   							  13		   6		  7	
 	   						     / | \       /   \        |
                                /  |  \     /     \       |
                                3  4  5    8       9	  10
	
		 
		 */
		
		ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> hijo1 = new ArbolGeneral<Integer>(13);
		ArbolGeneral<Integer> hijo2 = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> hijo3 = new ArbolGeneral<Integer>(7);

		
		ArbolGeneral<Integer> nodo1 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> nodo2 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> nodo3 = new ArbolGeneral<Integer>(5);
		
		ArbolGeneral<Integer> nodo4 = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> nodo5 = new ArbolGeneral<Integer>(9);
		
		ArbolGeneral<Integer> nodo6 = new ArbolGeneral<Integer>(10);
		
		arbol.agregarHijo(hijo1);
		arbol.agregarHijo(hijo2);
		arbol.agregarHijo(hijo3);

		
		hijo1.agregarHijo(nodo1);
		hijo1.agregarHijo(nodo2);
		hijo1.agregarHijo(nodo3);
		
		hijo2.agregarHijo(nodo4);
		hijo2.agregarHijo(nodo5);
		
		hijo3.agregarHijo(nodo6);
		
		System.out.println("13 ES ANCESTRO DE 4: " + arbol.esAncestro(13,4));
		
		ListaGenerica<Integer> listaPre = RecorridosAG.numerosImparesMayoresQuePreOrden(arbol,2);
		ListaGenerica<Integer> listaIn = RecorridosAG.numerosImparesMayoresQueInOrden(arbol,2);
		ListaGenerica<Integer> listaPost = RecorridosAG.numerosImparesMayoresQuePostOrden(arbol,2);
	
		System.out.println("LISTA PREORDEN");
		System.out.println(listaPre.toString());
		System.out.println("LISTA INORDEN");
		System.out.println(listaIn.toString());
		System.out.println("LISTA POSTORDEN");
		System.out.println(listaPost.toString());
		
		System.out.println("ALTURA: "+arbol.altura());
		
		Integer dato = 21;
		System.out.println("NIVEL DEL DATO "+dato+": "+arbol.nivel(dato));
		
		System.out.println("ANCHO: "+arbol.ancho());
		
	}
	
}
