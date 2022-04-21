package tp03.ejercicio2;

import tp03.ejercicio1.ArbolBinario;


public class test {
	public static <T> void imprimirPreorden(ArbolBinario<T> a) {
		System.out.println(a.getDato());
		if(a.tieneHijoIzquierdo())
			imprimirPreorden(a.getHijoIzquierdo());
		if(a.tieneHijoDerecho())
			imprimirPreorden(a.getHijoDerecho());
	}
	
	public static void main(String []args) {
		ArbolBinario<Integer> a=new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> b=new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> c=new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> d=new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> g=new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> f=new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> h=new ArbolBinario<Integer>(7);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(g);
		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(h);
		
		System.out.println("La cantidad de hojas del arbol es: "+a.contarHojas());
		System.out.println("ARBOL");
		imprimirPreorden(a);
		System.out.println();
		System.out.println("ARBOL INVERSO");
		imprimirPreorden(a.espejo());
		
		System.out.println("POR NIVELES");
		a.entreNiveles(0, 1);
	}

}
