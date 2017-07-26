package logica;

import java.io.Serializable;
import java.util.Calendar;

//Pendiente de programar por Maria
public class Consulta extends Registro implements Serializable{
	// subclase de la clase Registro
	private String medico;
	private String diagnostico;
	private String recomendaciones;

	// constructor
	public Consulta(Calendar fecha, String comentario, String medico, String diagnostico, String recomendaciones) {
		super(fecha, comentario);
		this.medico = medico;
		this.diagnostico = diagnostico;
		this.recomendaciones = recomendaciones;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}

	@Override
	public String mostrarRegistro() {

		return super.mostrarRegistro()+" Medico : "+medico+" Diagnostico : "+diagnostico+" Recomendacion : "+recomendaciones ;
	}
	
	public String toString(){
		
		return "Tipo Registro : Consulta "+super.toString()+" "+mostrarRegistro();
	}

}
