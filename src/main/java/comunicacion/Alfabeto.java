package comunicacion;

public class Alfabeto extends Pictograma {
	// ================================================================================
	// Attributes
	private String[] letras;
	private String interpretacion;
	
	// ================================================================================
	// Constructor
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	
	// ================================================================================
	// Methods
	public int cantidadLetras() {
		return this.getLetras().length;
	}

	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		return String.join(", ", this.getLetras());
	}
	
	// ================================================================================
	// Getters and setters
	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
