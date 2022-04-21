package tp03.ejercicio1;
import tp02.ejercicio3.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
		this.hijoIzquierdo=null;
		this.hijoDerecho=null;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}
	

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		if(this.esVacio())
			return -1;
		
		int hojas=0;	
		if(this.esHoja())
			return 1;
		else {
			if(this.tieneHijoIzquierdo())
				hojas=+this.getHijoIzquierdo().contarHojas();
			if(this.tieneHijoDerecho())
				hojas=+this.getHijoDerecho().contarHojas();
		}
		return hojas;
	}
	

    public ArbolBinario<T> espejo() {
		if(this.esVacio())
			return null;
		
		ArbolBinario<T> arbol=new ArbolBinario<T>(this.getDato());
		if(this.tieneHijoIzquierdo()) 
			arbol.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
			
		if(this.tieneHijoDerecho()) 
			arbol.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
				
		return arbol;
	}

    
	public void entreNiveles(int n, int m){
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>>cola=new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		int nivel=0;
		
		while (!cola.esVacia() && nivel<n) {
			arbol=cola.desencolar();
			if(arbol!=null) {
				if(arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if(arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			}
			else 
				if(!cola.esVacia()) {
					cola.encolar(null);				
					nivel++;
				}
				
		}
		System.out.println("Nivel "+nivel);
		while (!cola.esVacia() && (nivel>=n && nivel<=m)) {
			arbol=cola.desencolar();
			if(arbol!=null) {
				System.out.println(arbol.getDato());
				if(arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if(arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			}
			else
				if(!cola.esVacia()) {
					cola.encolar(null);				
					nivel++;
					if(nivel<=m)
						System.out.println("Nivel "+nivel);
				}
		}
		
	/*
	 * public void entreNiveles(int n, int m){
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>>cola=new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		int nivel=0;
		
		while (!cola.esVacia() && nivel<=m) {
			arbol=cola.desencolar();
			if(arbol!=null) {
				if(nivel>=n)
					System.out.println(arbol.getDato());
				if(arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if(arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			}
			else 
				if(!cola.esVacia()) {
					cola.encolar(null);				
					nivel++;
					if(nivel>=n)
						System.out.println("Nivel "+nivel);
				}
				
		}
	 * 
	 */
	}

	

}
