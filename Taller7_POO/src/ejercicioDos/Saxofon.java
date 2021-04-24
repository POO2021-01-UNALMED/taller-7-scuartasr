package ejercicioDos;

public class Saxofon extends Instrumento {
	public Saxofon(String tipo) {
		super(tipo);
	}
	
	public void Tocar() {
		System.out.println("Tocando saxofón");
	}
	
	public void Afinar() {
		System.out.println("Afinando Saxofon");
	}
}
