package enunciado2;

import tp03.ejercicio1.*;

/*
 	Implemente en la clase Parcial el método sumaImparesPosOrderMayor que recibe un árbol binario de enteros positivos y 
 	un número entero. Este método Suma todos los números impares del árbol que son mayores al parámetro recibido 
 	realizándolo en un recorrido posOrder 

		"public Integer sumaImparesPOsOrderMayorA(ArbolBinarioc Integer> ab, int limite)"
	
	Por ej. dado el siguiente árbol, y limite siendo 30, deberá retornar 238= 87 + 43 + 77 + 31 
					     _____7_____
						/	        \
					   /             \
					 56		       	 25	
					/  \            /  \ 
				   /    \          /    \
				  38     31       5      6
				 /  \      \ 
			    /    \      \
			  87     77     94
				  	/         \ 
			       /           \
			      16            2
				   	\		   /          
			         \        /           
			         43      1			   
				    /  \		            
			       /    \                    
			      9     10						   
				  				   
	Tenga en cuenta que; 
	- Debe respetar la clase y el método indicado. 
	- Puede definir todos métodos y variables que considere 
	- Todo aquel método que no esté definido en las prácticas debe ser implementado 
 */
public class Parcial2 {
	public Integer sumaImparesPosOrderMayor(ArbolBinario<Integer> ab, int limite) {
		int suma=0;
		if(!ab.esVacio()) {
			suma=postOrden(ab,limite);
		}
		return suma;
	}
	
	private Integer postOrden(ArbolBinario<Integer> ab, int limite) {
		int suma=0;
		if(ab.tieneHijoIzquierdo()) {
			suma = suma + postOrden(ab.getHijoIzquierdo(),limite);
		}
		if(ab.tieneHijoDerecho()) {
			suma = suma + postOrden(ab.getHijoDerecho(),limite);
		}
		if(((ab.getDato()%2) !=0)&&(ab.getDato()>limite)) {
			suma = suma + ab.getDato();
		}
		return suma;
	}
	
	
}
