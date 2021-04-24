package ejercicioDos;

public abstract class Instrumento {
	private String tipo;
	
	public Instrumento(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public abstract void Tocar();
	public abstract void Afinar();
}
