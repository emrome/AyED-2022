package tp02.ejercicio3;
import tp02.ejercicio2.*;
public class PilaGenerica <T>{
	private ListaGenerica <T>datos= new ListaEnlazadaGenerica<T>();
	
	public PilaGenerica() {
		
	}
	public void apilar(T elem) {
		/*Agrega elemento a la pila
		 * 
		 */
		datos.agregarEn(elem,1);//datos.agregarInicio(elem,1);
	}

	public T desapilar() {
		/*Elimina y desapila elemento en el tope de la pila
		 * 
		 */
		T aux=datos.elemento(1);
		datos.eliminarEn(1);
		return aux;
	}
	public T tope() {
		/*Devuleve el elemento en el tope de la pila sin eliminarlo
		 * 
		 */
		return datos.elemento(1);
	}
	
	public boolean esVacia() {
		 /*Retorna true si la pila esta vacia, false en caso contrario
		  * 
		  */
		/*return (this.tope()==null);
		 * return datos.tamanio()==0;
		 */
		 return datos.esVacia();
	 }

}
