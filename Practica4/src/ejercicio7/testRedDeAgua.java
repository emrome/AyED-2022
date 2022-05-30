package ejercicio7;

import tp04.ejercicio1.ArbolGeneral;

public class testRedDeAgua {
	
	public static void main (String [] args) {
		
		ArbolGeneral<Character> arbolA = new ArbolGeneral<Character>('A');
		
		ArbolGeneral<Character> arbolB = new ArbolGeneral<Character>('B');
		ArbolGeneral<Character> arbolC = new ArbolGeneral<Character>('C');
		ArbolGeneral<Character> arbolD = new ArbolGeneral<Character>('D');
		ArbolGeneral<Character> arbolE = new ArbolGeneral<Character>('E');
		
		
		ArbolGeneral<Character> arbolF = new ArbolGeneral<Character>('F');
		ArbolGeneral<Character> arbolG = new ArbolGeneral<Character>('G');
		ArbolGeneral<Character> arbolH = new ArbolGeneral<Character>('H');
		ArbolGeneral<Character> arbolI = new ArbolGeneral<Character>('I');
		ArbolGeneral<Character> arbolJ = new ArbolGeneral<Character>('J');
		ArbolGeneral<Character> arbolK = new ArbolGeneral<Character>('K');
		
		ArbolGeneral<Character> arbolL = new ArbolGeneral<Character>('L');
		ArbolGeneral<Character> arbolM = new ArbolGeneral<Character>('M');
		ArbolGeneral<Character> arbolN = new ArbolGeneral<Character>('N');
		
		ArbolGeneral<Character> arbolO = new ArbolGeneral<Character>('O');
		ArbolGeneral<Character> arbolP = new ArbolGeneral<Character>('P');
		
		arbolA.agregarHijo(arbolB);
		arbolA.agregarHijo(arbolC);
		arbolA.agregarHijo(arbolD);
		arbolA.agregarHijo(arbolE);
		
		arbolC.agregarHijo(arbolF);
		arbolC.agregarHijo(arbolG);
		
		arbolD.agregarHijo(arbolH);
		arbolD.agregarHijo(arbolI);
		arbolD.agregarHijo(arbolJ);
		arbolD.agregarHijo(arbolK);
		
		arbolG.agregarHijo(arbolL);
		
		arbolJ.agregarHijo(arbolM);
		arbolJ.agregarHijo(arbolN);
		
		arbolN.agregarHijo(arbolO);
		arbolN.agregarHijo(arbolP);

		RedDeAguaPotable<Character> redAgua = new RedDeAguaPotable<Character>(arbolA);
		
		System.out.println("MINIMO CAUDAL: "+redAgua.minimoCaudal(1000));
		
		
	}
	
	
}
