package tp03.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class testContador {
	public static void main(String []args) {
		ListaEnlazadaGenerica<Integer>lista=new ListaEnlazadaGenerica<Integer>();
		ArbolBinario<Integer> a=new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> b=new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> c=new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> d=new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> g=new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> f=new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> h=new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> i=new ArbolBinario<Integer>(8);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(g);
		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(h);
		g.agregarHijoDerecho(i);
		
		ContadorArbol.arbol=a;
		
		System.out.println("Lista Inorden");
		lista=ContadorArbol.numerosParesInorden();
		lista.comenzar();
		while(!lista.fin())
			System.out.println(lista.proximo());
		
		
		System.out.println("Lista Postorden");
		
		lista=ContadorArbol.numerosParesPostorden();
		lista.comenzar();
		while(!lista.fin())
			System.out.println(lista.proximo());
		
	}
}
