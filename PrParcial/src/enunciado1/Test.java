package enunciado1;
import tp02.ejercicio2.*;
import tp04.ejercicio1.*;

public class Test {
	public static void main (String []args) {
		ArbolGeneral<Character> arbol = new ArbolGeneral<Character>('A');
		ArbolGeneral<Character> hijoB = new ArbolGeneral<Character>('B');
		ArbolGeneral<Character> hijoC = new ArbolGeneral<Character>('C');
		ArbolGeneral<Character> hijoD = new ArbolGeneral<Character>('D');
		ArbolGeneral<Character> hijoE = new ArbolGeneral<Character>('E');
		ArbolGeneral<Character> hijoF = new ArbolGeneral<Character>('F');
		ArbolGeneral<Character> hijoG = new ArbolGeneral<Character>('G');
		ArbolGeneral<Character> hijoH = new ArbolGeneral<Character>('H');
		ArbolGeneral<Character> hijoI = new ArbolGeneral<Character>('I');
		
		arbol.agregarHijo(hijoB);
		arbol.agregarHijo(hijoC);
		arbol.agregarHijo(hijoD);
		hijoB.agregarHijo(hijoE);
		hijoC.agregarHijo(hijoF);
		hijoC.agregarHijo(hijoG);
		hijoF.agregarHijo(hijoH);
		hijoF.agregarHijo(hijoI);
		
		ListaGenerica<ListaGenerica<Character>> CaminosPares=Parcial1.caminosPares(arbol);
		CaminosPares.comenzar();
		int i=1;
		while(!CaminosPares.fin()) {
			System.out.println("CAMINO PAR "+i);
			ListaGenerica<Character>camino = CaminosPares.proximo();
			camino.comenzar();
			System.out.println(camino.toString());
			i++;
		}

		
	}
}
