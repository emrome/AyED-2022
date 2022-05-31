package enunciado2;

import tp03.ejercicio1.*;

public class Test {
	public static void main (String []args) {
		ArbolBinario<Integer> arbol7 = new ArbolBinario<Integer>(7);
		
		ArbolBinario<Integer> arbol56 = new ArbolBinario<Integer>(56);
		ArbolBinario<Integer> arbol25 = new ArbolBinario<Integer>(25);
		
		ArbolBinario<Integer> arbol38 = new ArbolBinario<Integer>(38);
		ArbolBinario<Integer> arbol31 = new ArbolBinario<Integer>(31);
		ArbolBinario<Integer> arbol5 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> arbol6 = new ArbolBinario<Integer>(6);
		
		ArbolBinario<Integer> arbol87 = new ArbolBinario<Integer>(87);
		ArbolBinario<Integer> arbol77 = new ArbolBinario<Integer>(77);
		ArbolBinario<Integer> arbol94 = new ArbolBinario<Integer>(94);
		
		ArbolBinario<Integer> arbol16 = new ArbolBinario<Integer>(16);
		ArbolBinario<Integer> arbol2 = new ArbolBinario<Integer>(2);
		
		ArbolBinario<Integer> arbol43 = new ArbolBinario<Integer>(43);
		ArbolBinario<Integer> arbol1 = new ArbolBinario<Integer>(1);
		
		ArbolBinario<Integer> arbol9 = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> arbol10 = new ArbolBinario<Integer>(10);
		
		arbol7.agregarHijoIzquierdo(arbol56);
		arbol7.agregarHijoDerecho(arbol25);
		
		arbol56.agregarHijoIzquierdo(arbol38);
		arbol56.agregarHijoDerecho(arbol31);
		
		arbol25.agregarHijoIzquierdo(arbol5);
		arbol25.agregarHijoDerecho(arbol6);
		
		arbol38.agregarHijoIzquierdo(arbol87);
		arbol38.agregarHijoDerecho(arbol77);
		
		arbol31.agregarHijoDerecho(arbol94);

		arbol94.agregarHijoDerecho(arbol2);
		
		arbol2.agregarHijoIzquierdo(arbol1);
		
		
		arbol77.agregarHijoIzquierdo(arbol16);
		
		
		arbol16.agregarHijoDerecho(arbol43);
		
		arbol43.agregarHijoIzquierdo(arbol9);
		arbol43.agregarHijoDerecho(arbol10);
		
		Parcial2 parcial = new Parcial2();
		
		System.out.println("SUMA NUMEROS IMPARES MAYORES A 30: "+parcial.sumaImparesPosOrderMayor(arbol7, 30));
	}
}
