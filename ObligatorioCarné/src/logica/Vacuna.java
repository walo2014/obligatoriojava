package logica;

public class Vacuna {
	//Pendiente de programar por Mariana Presente
	//Parametros
	private String nombre;
	private int dosis;
	private boolean esObligatoria;
	
	//constructor //falta 2 parámetros correspondientes a la superclase

	public Vacuna(String nombre, int dosis, boolean esObligatoria) 
	{
		super();
		this.nombre = nombre;
		this.dosis = dosis;
		this.esObligatoria = esObligatoria;
		
	}
	
   //metodos selectores y modificadores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

	public boolean isEsObligatoria() {
		return esObligatoria;
	}

	public void setEsObligatoria(boolean esObligatoria) {
		this.esObligatoria = esObligatoria;
	}
	
}
