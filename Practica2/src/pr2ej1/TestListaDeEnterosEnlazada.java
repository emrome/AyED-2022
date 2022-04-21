package pr2ej1;
import tp02.ejercicio1.*;

public class TestListaDeEnterosEnlazada {
	public static void main(String []args) {
		ListaDeEnterosEnlazada lista=new ListaDeEnterosEnlazada();

		for(int i=0;i<args.length;i++) {
			lista.agregarFinal(Integer.parseInt(args[i]));
		}
		
		
		System.out.println("Elementos lista");
		for (int i=1;i<=lista.tamanio();i++) {
			System.out.println(lista.elemento(i));
		}
		//otra forma
		System.out.println("Elementos lista");
		lista.comenzar();
		while(!lista.fin()) {
			int x=lista.proximo();
			if(x % 2==0){
				System.out.println(x);
			}
		}
	}
}
