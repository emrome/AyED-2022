package pr2ej1;
import tp02.ejercicio1.*;

public class Ejercicio1_5 {
	public static void imprimirRecursivo(ListaDeEnteros l) {
		if (!l.fin()) {
			int i=l.proximo();
			imprimirRecursivo(l);
			System.out.println(i);

		}
	}
	
	
	 
	public static void main(String []args) {
		ListaDeEnterosConArreglos lista=new ListaDeEnterosConArreglos();
		lista.agregarFinal(1);
		lista.agregarFinal(8);
		lista.agregarFinal(7);
		lista.agregarFinal(48);
		lista.agregarFinal(4);
	
		System.out.println("IMPRESION INVERSA");
		Ejercicio1_5.imprimirRecursivo(lista);
		
		lista.comenzar();
		System.out.println("Elementos lista");
		for (int i=1;i<=lista.tamanio();i++) {
			System.out.println(lista.elemento(i));
		}
	}
}
