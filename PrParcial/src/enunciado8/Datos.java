package enunciado8;

public class Datos {
	private int valorNumerico;
	private Character Id;
	
	public Datos(int valorNumerico,Character Id) {
		this.valorNumerico=valorNumerico;
		this.Id=Id;
	}

	public int getValorNumerico() {
		return valorNumerico;
	}

	public void setValorNumerico(int valorNumerico) {
		this.valorNumerico = valorNumerico;
	}

	public Character getId() {
		return Id;
	}

	public void setId(Character id) {
		Id = id;
	}
	
	
}
