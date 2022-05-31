package enunciado6;

import tp03.ejercicio1.ArbolBinario;

public class Test6 {
	public static void main(String []args) {
		ArbolBinario<String> arbol1 = new ArbolBinario<String>();
		
		ArbolBinario<String> arbol2 = new ArbolBinario<String>();
		ArbolBinario<String> arbol3 = new ArbolBinario<String>();
		
		ArbolBinario<String> arbol4 = new ArbolBinario<String>();
		ArbolBinario<String> arbol5 = new ArbolBinario<String>();
		ArbolBinario<String> arbol6 = new ArbolBinario<String>();
		ArbolBinario<String> arbol7 = new ArbolBinario<String>();
		
		ArbolBinario<String> arbol8 = new ArbolBinario<String>();
		ArbolBinario<String> arbol9 = new ArbolBinario<String>();
		ArbolBinario<String> arbol10 = new ArbolBinario<String>();
		
		ArbolBinario<String> arbol11 = new ArbolBinario<String>();
		
		
		arbol1.agregarHijoIzquierdo(arbol2);
		arbol1.agregarHijoDerecho(arbol3);
		
		arbol2.agregarHijoIzquierdo(arbol5);
		arbol2.agregarHijoDerecho(arbol4);
		
		arbol3.agregarHijoIzquierdo(arbol6);
		arbol3.agregarHijoDerecho(arbol7);
		
		arbol5.agregarHijoIzquierdo(arbol8);
		
		arbol6.agregarHijoIzquierdo(arbol9);
		
		arbol7.agregarHijoIzquierdo(arbol10);
		arbol7.agregarHijoDerecho(arbol11);

		Parcial6.colorearArbol(arbol1, 3);
		Parcial6.imprimirArbol(arbol1);
		
	}
}
