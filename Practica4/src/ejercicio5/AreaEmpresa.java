package ejercicio5;

public class AreaEmpresa {
	private int tardanza;
	private String identificacion;
	
	public AreaEmpresa() {
		
	}
	
	public AreaEmpresa(int tardanza, String identificacion) {
		this.tardanza=tardanza;
		this.identificacion=identificacion;
	}
	
	public void setTardanza(int tardanza) {
		this.tardanza=tardanza;
	}
	
	public int getTardanza() {
		return this.tardanza;
	}
	
	public void setIdentificacion(String identificacion) {
		this.identificacion=identificacion;
	}
	
	public String getIdentificacion() {
		return this.identificacion;
	}
	
	public String toString() {
		return "Identificacion: "+this.identificacion+" Tardanza: "+this.tardanza;
	}
	
}
