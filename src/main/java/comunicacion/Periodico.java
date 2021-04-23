package comunicacion;

public class Periodico extends Escrito {
	
	// ================================================================================
	// Attributes
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	// ================================================================================
	// Constructor
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
			String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	// ================================================================================
	// Methods
	
	public int palabrasTotales(int palabrasPagina) {	
		return 10 * this.getPaginas();
	}

	public String interpretacion() {
		return this.interpretacion;
	}

	public String toString() {
		return "\"" + this.getOrigen() + "\n" +
				this.getTitulo() + "\n" +
				this.getAutor() + "\n" +
				this.getPaginas() + "\n" +
				this.getFecha() + "\n" +
				this.getPrimicia() + "\"";
	}
	
	// ================================================================================
	// Getters and setters
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}