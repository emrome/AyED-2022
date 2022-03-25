package ejer1;

public class Aplicacion {
	public static void conFor(int a,int b) {
		for (int i=a;i<=b;i++) {
			System.out.println(i);
		}
	}
	
	public static void conWhile(int a,int b) {
		while (a<=b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void sinNinguno(int a,int b) {
		if(a<=b) {
			System.out.println(a);
			a++;
			sinNinguno(a,b);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("IMPRESION CON FOR");
		Aplicacion.conFor(5,10);
		System.out.println("IMPRESION CON WHILE");
		Aplicacion.conWhile(7,13);
		System.out.println("IMPRESION RECURSIVA");
		Aplicacion.sinNinguno(1,4);
	}
}
