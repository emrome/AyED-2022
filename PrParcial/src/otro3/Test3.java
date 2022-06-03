package otro3;

import tp04.ejercicio1.ArbolGeneral;

public class Test3 {
		/*
											256	
								/	   	    |        
							   /	        |        
							  1	           -8		   	
							/  \            /        
						   /    \          /         
						  -5      4       -13  
						  |     / |   \    
						  |    /  |    \    
						  18   -7  11     3  

	
	
	
	*/
	
	public static void main(String []args) {
		ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(256);
		ArbolGeneral<Integer> hijo1 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> hijo2 = new ArbolGeneral<Integer>(-8);
		
		
		
		
		ArbolGeneral<Integer> nodo1 = new ArbolGeneral<Integer>(-5);
		ArbolGeneral<Integer> nodo2 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> nodo3 = new ArbolGeneral<Integer>(-13);
		
		ArbolGeneral<Integer> nodo4 = new ArbolGeneral<Integer>(18);
		ArbolGeneral<Integer> nodo5 = new ArbolGeneral<Integer>(-7);
		ArbolGeneral<Integer> nodo6 = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> nodo7 = new ArbolGeneral<Integer>(3);
		
		arbol.agregarHijo(hijo1);
		arbol.agregarHijo(hijo2);
		
		
		
		hijo1.agregarHijo(nodo1);
		hijo1.agregarHijo(nodo2);
		
		hijo2.agregarHijo(nodo3);
		
		nodo1.agregarHijo(nodo4);
		
		nodo2.agregarHijo(nodo5);
		nodo2.agregarHijo(nodo6);
		nodo2.agregarHijo(nodo7);
		
		int k1=1;
		int k2=11;
		
		ParcialOtro3 parcial = new ParcialOtro3();
		if(parcial.resolver(arbol, k1, k2))
			System.out.println("HAY CAMINO DESDE "+k1+" HASTA "+k2);
		else
			System.out.println("NO HAY CAMINO DESDE "+k1+" HASTA "+k2);
	}
}
