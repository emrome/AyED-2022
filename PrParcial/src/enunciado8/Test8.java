package enunciado8;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/*
 * 						      (G,1)	
					/	   	    |         \
				   /            |          \
				 (E,3)	       (F,2)  	  (J,5)	 
			   /  |   \          |         /   \     
			  /   |    \         |        /     \
		 (A,7)  (B,9)  (C,6)   (D,10)   (H,6)  (I,10)
 * 
 */
public class Test8 {
	public static void main(String [] args) {
		
		Datos dato = new Datos(3,'G');
		ArbolGeneral<Datos> arbolG = new ArbolGeneral<Datos>(dato);
		
		dato = new Datos(3,'E');
		ArbolGeneral<Datos> arbolE = new ArbolGeneral<Datos>(dato);
		
		dato = new Datos(2,'F');
		ArbolGeneral<Datos> arbolF = new ArbolGeneral<Datos>(dato);
		
		dato = new Datos(5,'J');
		ArbolGeneral<Datos> arbolJ = new ArbolGeneral<Datos>(dato);
		
		dato = new Datos(7,'A');
		ArbolGeneral<Datos> arbolA = new ArbolGeneral<Datos>(dato);
		
		dato = new Datos(9,'B');
		ArbolGeneral<Datos> arbolB = new ArbolGeneral<Datos>(dato);
		
		dato = new Datos(6,'C');
		ArbolGeneral<Datos> arbolC = new ArbolGeneral<Datos>(dato);
		
		dato = new Datos(10,'D');
		ArbolGeneral<Datos> arbolD = new ArbolGeneral<Datos>(dato);
		
		dato = new Datos(6,'H');
		ArbolGeneral<Datos> arbolH = new ArbolGeneral<Datos>(dato);
		
		dato = new Datos(10,'I');
		ArbolGeneral<Datos> arbolI = new ArbolGeneral<Datos>(dato);
		
		
		
		arbolG.agregarHijo(arbolE);
		arbolG.agregarHijo(arbolF);
		arbolG.agregarHijo(arbolJ);
		
		arbolE.agregarHijo(arbolA);
		arbolE.agregarHijo(arbolB);
		arbolE.agregarHijo(arbolC);
		
		arbolF.agregarHijo(arbolD);
		
		arbolJ.agregarHijo(arbolH);
		arbolJ.agregarHijo(arbolI);
		
		
		ListaGenerica<Character> lista = Parcial8.camino(arbolG);
		
		System.out.println(lista.toString());
	}
}
