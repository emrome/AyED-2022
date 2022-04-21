package tp02.ejercicio4;
import java.util.Scanner;
import tp02.ejercicio3.*;

public class TestBalanceo {
	
	private static boolean esApertura(char car) {
		return ((car=='(')||(car=='[')||(car=='{'));
	}
	
	private static boolean coincideCierre(char car,char tope){
		switch(car) {
						case ')':
							if (tope!='(') 
								return false;
								break;
						case ']':
							if (tope!='[') 
								return false;
							break;
						case '}':
							if (tope!='{') 
								return false;
							break;
							
					}
		return true;
	}
	/*
	private static boolean coincideCierre(char car,char tope) {
		if (car==')')
			return (tope=='(');
		else if (car==']')
			return(tope=='[');
		else 
			return (tope=='{');
	}
	*/
	
	public static boolean estaBalanceado(String aux) {
		if(aux.isEmpty()) return true;
		else {
			int pos=0;
			char caracter,tope;

			PilaGenerica<Character> pila = new PilaGenerica<Character>();
			
			while(pos<aux.length()){
				caracter=aux.charAt(pos);
				if (esApertura(caracter)) 
					pila.apilar(caracter);
	
				else {
					if(!pila.esVacia()){
						tope=pila.desapilar();
						if (!coincideCierre(caracter,tope))
							return false;
					}
					else return false;
				}
				pos++;
			}
			if (pila.esVacia())//termino con el string, si no me quedaron caracteres de apertura					
				return true;	//en la pila, esta balanceada
			
			else return false;
			 
		}
	}
	
	
	public static void main(String []args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese string de caracteres S \"(,),[,],{,}\" a verificar si esta balanceado");
		String cadena= teclado.next();
		if(estaBalanceado(cadena)) 
			System.out.print("La cadena está balanceada");
		else
			System.out.print("La cedena no está balanceada");
	}
}
