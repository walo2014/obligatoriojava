package logica;
import java.util.Calendar;

public class Niño {
	//parametros
	private String nombre;
	private String documento;
	private Calendar fechaNacimiento;
	private String servicioMedico;
	private String medicoCabecera;
	private boolean tieneFonasa;

	private Registro[] registros; 
	private int tope;

	//contructor
	public Niño(String nom,String doc,Calendar fecNac,String serMed,String medCab,boolean tieFon,int cantidadRegistro)
		{
			
			nombre = nom;
			documento = doc;
			fechaNacimiento = fecNac;
			servicioMedico = serMed;
			medicoCabecera = medCab;
			tieneFonasa = tieFon;
			registros=new Registro[cantidadRegistro];
			tope=0;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getServicioMedico() {
		return servicioMedico;
	}

	public void setServicioMedico(String servicioMedico) {
		this.servicioMedico = servicioMedico;
	}

	public String getMedicoCabecera() {
		return medicoCabecera;
	}

	public void setMedicoCabecera(String medicoCabecera) {
		this.medicoCabecera = medicoCabecera;
	}

	public boolean isTieneFonasa() {
		return tieneFonasa;
	}

	public void setTieneFonasa(boolean tieneFonasa) {
		this.tieneFonasa = tieneFonasa;
	}

	//Recuperar y mostrar en el futuro registro
	
	public boolean agregar(Registro registro){
		boolean guardo=false;
		
		if(tope<registros.length){
			registros[tope]=registro;
			guardo=true;
			tope++;
		}
		return guardo;
	}
	
}
