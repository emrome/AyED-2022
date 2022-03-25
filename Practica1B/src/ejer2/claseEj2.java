package ejer2;
import java.util.Scanner;

public class claseEj2 {
	public static int[] arregloN(int n) {
		int array[]= new int[n];
		for (int i=0;i<n;i++) {
			array[i]=(i+1)*n;
		}
	return array;
	}
	
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in) ;
		System.out.println("Ingrese numero (<-1> para finalizar): ");
		int num=s.nextInt();
		while (num != -1) {
			int prueba[]=claseEj2.arregloN(num);
			System.out.println("ARREGLO");
			for (int i=0;i<num;i++) {
				System.out.println(prueba[i]);
			}
			System.out.println("");
			System.out.println("Ingrese numero (<-1> para finalizar):");
			num=s.nextInt();
		}
	
		}
	}

