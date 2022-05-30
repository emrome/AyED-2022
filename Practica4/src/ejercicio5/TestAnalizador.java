package ejercicio5;

import tp04.ejercicio1.ArbolGeneral;

public class TestAnalizador {
	
	public static void main (String []args) {
		AreaEmpresa dato = new AreaEmpresa(14,"M");
		ArbolGeneral<AreaEmpresa> arbolM = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato = new AreaEmpresa(13,"j");
		ArbolGeneral<AreaEmpresa> arbolJ = new ArbolGeneral<AreaEmpresa>(dato);		
		dato = new AreaEmpresa(25,"K");
		ArbolGeneral<AreaEmpresa> arbolK = new ArbolGeneral<AreaEmpresa>(dato);		
		dato = new AreaEmpresa(10,"L");
		ArbolGeneral<AreaEmpresa> arbolL = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato = new AreaEmpresa(4,"A");
		ArbolGeneral<AreaEmpresa> arbolA = new ArbolGeneral<AreaEmpresa>(dato);		
		dato = new AreaEmpresa(7,"B");
		ArbolGeneral<AreaEmpresa> arbolB = new ArbolGeneral<AreaEmpresa>(dato);		
		dato = new AreaEmpresa(5,"C");
		ArbolGeneral<AreaEmpresa> arbolC = new ArbolGeneral<AreaEmpresa>(dato);
		
		
		dato = new AreaEmpresa(6,"D");
		ArbolGeneral<AreaEmpresa> arbolD = new ArbolGeneral<AreaEmpresa>(dato);		
		dato = new AreaEmpresa(10,"E");
		ArbolGeneral<AreaEmpresa> arbolE = new ArbolGeneral<AreaEmpresa>(dato);		
		dato = new AreaEmpresa(18,"F");
		ArbolGeneral<AreaEmpresa> arbolF = new ArbolGeneral<AreaEmpresa>(dato);
		
		dato = new AreaEmpresa(9,"G");
		ArbolGeneral<AreaEmpresa> arbolG = new ArbolGeneral<AreaEmpresa>(dato);
		dato = new AreaEmpresa(12,"H");
		ArbolGeneral<AreaEmpresa> arbolH = new ArbolGeneral<AreaEmpresa>(dato);	
		dato = new AreaEmpresa(19,"I");
		ArbolGeneral<AreaEmpresa> arbolI = new ArbolGeneral<AreaEmpresa>(dato);
		
		
		dato = new AreaEmpresa(1,"Z");
		ArbolGeneral<AreaEmpresa> arbolZ = new ArbolGeneral<AreaEmpresa>(dato);	
		dato = new AreaEmpresa(15,"Y");
		ArbolGeneral<AreaEmpresa> arbolY = new ArbolGeneral<AreaEmpresa>(dato);
		
		arbolM.agregarHijo(arbolJ);
		arbolM.agregarHijo(arbolK);
		arbolM.agregarHijo(arbolL);
		arbolM.agregarHijo(arbolZ);
		
		arbolJ.agregarHijo(arbolA);
		arbolJ.agregarHijo(arbolB);
		arbolJ.agregarHijo(arbolC);
		
		arbolK.agregarHijo(arbolD);
		arbolK.agregarHijo(arbolE);
		arbolK.agregarHijo(arbolF);
		
		arbolL.agregarHijo(arbolG);
		arbolL.agregarHijo(arbolH);
		arbolL.agregarHijo(arbolI);
		
		arbolZ.agregarHijo(arbolY);
		
		AnalizadorArbol test = new AnalizadorArbol();
		arbolM.porNiveles();
		System.out.println(test.devolverMaximoPromedio(arbolM));
	}
}
