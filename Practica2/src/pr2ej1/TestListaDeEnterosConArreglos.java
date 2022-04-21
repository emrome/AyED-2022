package pr2ej1;
import tp02.ejercicio1.*;

public class TestListaDeEnterosConArreglos {
	public static void main(String []args) {
		ListaDeEnterosConArreglos lista=new ListaDeEnterosConArreglos();
		for(int i=0;i<args.length;i++) {
			lista.agregarFinal(Integer.parseInt(args[i]));
		}
		lista.comenzar();
		System.out.println("Elementos lista");
		for (int i=1;i<=lista.tamanio();i++) {
			System.out.println(lista.elemento(i));
		}
	}
}
