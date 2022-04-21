package pr2ej2;
import ejer3.*;
import tp02.ejercicio2.*;

public class TestListaEnlazadaGenerica {
	public static void main(String[] args) {
		Estudiante est1=new Estudiante("Maria","Romero","1B","mail@mail","La Plata");
		Estudiante est2=new Estudiante("Emilia","Gutierrez","1C","mail@mail","La Plata");
		Estudiante est3=new Estudiante("Marta","Romero","1A","mail@mail","La Plata");
		Estudiante est4=new Estudiante("Lola","Lopez","1B","mail@mail","La Plata");
		
		ListaEnlazadaGenerica <Estudiante> listaEstudiantes = new ListaEnlazadaGenerica <Estudiante> ();
		listaEstudiantes.agregarInicio(est1);
		listaEstudiantes.agregarInicio(est2);
		listaEstudiantes.agregarInicio(est3);
		listaEstudiantes.agregarInicio(est4);
		
		
		for(int i=1;i<=listaEstudiantes.tamanio();i++) {
			System.out.println(listaEstudiantes.elemento(i).tusDatos());
		}
		System.out.println("OTRA OPCION");
		//otra opcion
		listaEstudiantes.comenzar();
		for(int i=1;i<=listaEstudiantes.tamanio();i++) {
			System.out.println(listaEstudiantes.proximo().tusDatos());
		}
	}
}
