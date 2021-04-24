package comunicacion;

public class Tesis extends Escrito {
	// ================================================================================
	// Attributes
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	// ================================================================================
	// Constructor
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	

	// ================================================================================
	// Methods
	
	public int palabrasTotales(int n) {
		return n * 5 * this.getPaginas();
	}

	public String interpretacion() {
		return this.interpretacion;
	}

	public String toString() {
		return this.getOrigen() + "\n" +
				this.getTitulo() + "\n" +
				this.getAutor() + "\n" +
				this.getPaginas() + "\n" +
				this.getIdea() + "\n" +
				this.cantidadArgumentos() + "\n" +
				this.getConclusion() + "\n" +
				this.getReferencias();
	}
	
	// ================================================================================
	// Helper methods
	public int cantidadArgumentos() {
		return this.getArgumentos().length;
	}
	
	// ================================================================================
	// Getters and setters

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public String[] getArgumentos() {
		return argumentos;
	}


	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
}