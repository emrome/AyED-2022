package tp03.ejercicio3;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.*;

public class ContadorArbol {
	public static ArbolBinario<Integer> arbol;
	
	
	public static ListaEnlazadaGenerica<Integer> numerosParesInorden(){
		ListaEnlazadaGenerica<Integer>l=new ListaEnlazadaGenerica<Integer>();
		inorden(l,arbol);
		return l;
		
	}
	private static void inorden(ListaEnlazadaGenerica<Integer>l,ArbolBinario<Integer> a ) {
		if(a.tieneHijoIzquierdo())
			inorden(l,a.getHijoIzquierdo());
		
		if(a.getDato()%2==0)
			l.agregarFinal(a.getDato());
		
		if(a.tieneHijoDerecho())
			inorden(l,a.getHijoDerecho());
	}
	
	public static ListaEnlazadaGenerica<Integer> numerosParesPostorden(){
		ListaEnlazadaGenerica<Integer>l=new ListaEnlazadaGenerica<Integer>();
		postorden(l,arbol);
		return l;
	}
	private static void postorden(ListaEnlazadaGenerica<Integer>l,ArbolBinario<Integer> a ) {
		if(a.tieneHijoIzquierdo())
			postorden(l,a.getHijoIzquierdo());
		
		if(a.tieneHijoDerecho())
			postorden(l,a.getHijoDerecho());
		
		if(a.getDato()%2==0)
			l.agregarFinal(a.getDato());
	}
	
	
}
