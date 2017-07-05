package logica;

import java.util.Calendar;

public class Vacuna extends Registro{
	
	//Parametros
	private String nombre;
	private int dosis;
	private boolean esObligatoria;
	
	public Vacuna(Calendar fecha, String comentario, String nombre, int dosis, boolean esObligatoria) 
	{
		super(fecha,comentario);
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

	@Override
	public String mostrarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
