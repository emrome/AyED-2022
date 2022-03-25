package ejer5;

public class Aplico {
	
	public static int promedio;
	public static int maximo;
	public static int minimo;
	//public static Datos dato=new Datos();
	
	public static int [] conReturn(int []arreglo){
		int aux[]=new int[3];
		int max=-1;
		int min=9999;
		int acum=0;
		for(int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>max) {
				max=arreglo[i];
			}
			if(arreglo[i]<min) {
				min=arreglo[i];
			}
			acum+=arreglo[i];
		}
		aux[0]=max;
		aux[1]=min;
		aux[2]=(acum/arreglo.length);
		return aux;
	}
	/*public static Datos conReturn2(int []arreglo){
		Datos aux=new Datos();
		int max=-1;
		int min=9999;
		int acum=0;
		for(int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>max) {
				max=arreglo[i];
			}
			if(arreglo[i]<min) {
				min=arreglo[i];
			}
			acum+=arreglo[i];
		}
		aux.max=max;
		aux.min=min;
		aux.prom=(acum/arreglo.length);
		return aux;
	}*/
	
	public static void conParametro(Datos aux,int []arreglo) {
		int max=-1;
		int min=9999;
		int acum=0;
		for(int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>max) {
				max=arreglo[i];
			}
			if(arreglo[i]<min) {
				min=arreglo[i];
			}
			acum+=arreglo[i];
		}
		aux.max=max;
		aux.min=min;
		aux.prom=(acum/arreglo.length);
		
	}
	
	public static void conVariablesClase(int [] arreglo) {
		int max=-1;
		int min=9999;
		int acum=0;
		for(int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>max) {
				max=arreglo[i];
			}
			if(arreglo[i]<min) {
				min=arreglo[i];
			}
			acum+=arreglo[i];
		}
		promedio=(acum/arreglo.length);
		maximo=max;
		minimo=min;
	}
	
	/*
	 public static void conVariableClase(int [] arreglo) {
		int max=-1;
		int min=9999;
		int acum=0;
		for(int i=0;i<arreglo.length;i++) {
			if(arreglo[i]>max) {
				max=arreglo[i];
			}
			if(arreglo[i]<min) {
				min=arreglo[i];
			}
			acum+=arreglo[i];
		}
		dato.prom=(acum/arreglo.length);
		dato.max=max;
		dato.min=min;
	}
	 */
	public static void main(String[]args) {
		int []arregloEnteros=new int[7];
		for (int i=0;i<7;i++){
			arregloEnteros[i]=(int)(Math.random()*15+1);
		}
		System.out.println("ARREGLO");
		for (int i=0;i<7;i++){
			System.out.print(arregloEnteros[i]+"-");
		}
		
		System.out.println();
		
		
		int []arrayMaxMinProm=Aplico.conReturn(arregloEnteros);
		System.out.println("CON RETURN");
		for (int i=0;i<3;i++){
		System.out.println(arrayMaxMinProm[i]);	
		}
		
		Datos obj=new Datos();
		Aplico.conParametro(obj, arregloEnteros);
		System.out.println("CON PARAMETRO");
		System.out.println(obj.max);
		System.out.println(obj.min);
		System.out.println(obj.prom);
		
		System.out.println("CON VARIABLES DE CLASE");
		Aplico.conVariablesClase(arregloEnteros);
		System.out.println(maximo);
		System.out.println(minimo);
		System.out.println(promedio);
	}
	
}
