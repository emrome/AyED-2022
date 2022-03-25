package ejer3;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		Estudiante estudiantes[]=new Estudiante[2];	
		Profesor profesores[]=new Profesor[3];
		
		for(int i=0;i<1;i++) {
			System.out.println("AGREGAR ESTUDIANTES");
			estudiantes[i]=new Estudiante();
			System.out.println("NOMBRE ");
			estudiantes[i].setNombre(sc.nextLine());
			System.out.println("APELLIDO ");
			estudiantes[i].setApellido(sc.nextLine());
			System.out.println("EMAIL ");
			estudiantes[i].setEmail(sc.nextLine());
			System.out.println("COMISION ");
			estudiantes[i].setComision(sc.nextLine());
			System.out.println("DIRECCION ");
			estudiantes[i].setDireccion(sc.nextLine());
		}
		
		for(int i=0;i<1;i++) {
			System.out.println("AGREGAR PROFESOR");
			profesores[i]=new Profesor();
			System.out.println("NOMBRE ");
			profesores[i].setNombre(sc.nextLine());
			System.out.println("APELLIDO ");
			profesores[i].setApellido(sc.nextLine());
			System.out.println("EMAIL ");
			profesores[i].setEmail(sc.nextLine());
			System.out.println("CATEDRA ");
			profesores[i].setCatedra(sc.nextLine());
			System.out.println("FACULTAD ");
			profesores[i].setFacultad(sc.nextLine());
		}
		
		
		System.out.println("IMPRESION ESTUDIANTES");
		for(int i=0;i<1;i++) {
			System.out.println(estudiantes[i].tusDatos());
		}
		
		System.out.println("IMPRESION PROFESORES");
		for(int i=0;i<1;i++) {
			System.out.println(profesores[i].tusDatos());
		}
	}
	
}
