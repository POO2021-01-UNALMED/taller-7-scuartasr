package comunicacion;

public class Fabula extends Escrito {
	// ================================================================================
	// Attributes
	private String ensenanza;
	private String interpretacion;
	
	// ================================================================================
	// Constructor
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}

	// ================================================================================
	// Methods
	
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas();
	}

	public String interpretacion() {
		return this.interpretacion;
	}

	public String toString() {
	return "\"" + this.getOrigen() + "\n" +
			this.getTitulo() + "\n" +
			this.getAutor() + "\n" +
			this.getPaginas() + "\n" +
			this.getEnsenanza() + "\"";			
	}
		
	// ================================================================================
	// Getters and setters
		
	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
		
	

}
