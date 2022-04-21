package pr2ej1;
import tp02.ejercicio1.*;

public class Ejercicio1_6 {

	public ListaDeEnterosEnlazada calcularSucesion (int n) {
		ListaDeEnterosEnlazada l;
		
		//agrego elemento
		if(n !=1) {
			if(n % 2==0) {//es par
				l=calcularSucesion(n/2);
			}
			else {//es impar
				l=calcularSucesion(3*n+1);
			}
			l.agregarInicio(n);
			return l;
		}
		else {//es final de la sucesion
			l=new ListaDeEnterosEnlazada();
			l.agregarInicio(n);
			return l;
			
		}
			
	}
	
	
	public static void main (String[] args) {
		Ejercicio1_6 f = new Ejercicio1_6();
		ListaDeEnterosEnlazada l = f. calcularSucesion(6);
		for (int i=1;i<=l.tamanio();i++) {
			System.out.println(l.elemento(i));
		}
		
		//otra opcion
		l.comenzar();
		for (int i=1;i<=l.tamanio();i++) {
			System.out.println(l.proximo());
		}
	}

}
