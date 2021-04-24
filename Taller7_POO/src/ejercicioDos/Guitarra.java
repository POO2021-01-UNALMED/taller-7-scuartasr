package ejercicioDos;

public class Guitarra extends Instrumento {
	public Guitarra(String tipo) {
		super(tipo);
	}
	
	public void Tocar() {
		System.out.println("Tocando Guitarra");
	}
	public void Afinar() {
		System.out.println("Afinando Guitarra");
	}
}