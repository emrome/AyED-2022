package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ColaGenerica <T>{
	private ListaGenerica <T>datos= new ListaEnlazadaGenerica<T>();
	
	public void encolar(T elem) {
		datos.agregarFinal(elem);
	}
	
	public T desencolar() {
		T aux=datos.elemento(1);
		datos.eliminarEn(1);
		return aux;
	}
	
	public T tope() {
		/*Devuleve el elemento en el tope de la cola sin eliminarlo
		 * 
		 */
		return datos.elemento(1);
	}
	
	public boolean esVacia() {
		 /*Retorna true si la cola esta vacia, false en caso contrario
		  * 
		  */
		/*return (this.tope()==null);
		 * return datos.tamanio()==0;
		 */
		 return datos.esVacia();
	 }
	
	
}
