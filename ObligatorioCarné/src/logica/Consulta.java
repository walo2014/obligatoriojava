package logica;
//Pendiente de programar por Maria
public class Consulta extends Registro{
	//subclase de la clase Registro
	private String medico;
	private String diagnostico;
	private String recomendaciones;
	//constructor
	public Consulta(int fec, String com, String med, String diag,String recom){
		super (fec, com);//herencia??
		this.medico=med;
		this.diagnostico=diag;
		this.recomendaciones=recom;
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
}



	
