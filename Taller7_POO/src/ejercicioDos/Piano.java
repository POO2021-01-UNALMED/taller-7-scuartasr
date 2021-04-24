package ejercicioDos;

public class Piano extends Instrumento {
	
	public Piano(String tipo) {
		super(tipo);
	}
	
	public void Tocar() {
		System.out.println("Tocando piano");
	}

	public void Afinar() {
		System.out.println("Afinando piano");
	}

}
