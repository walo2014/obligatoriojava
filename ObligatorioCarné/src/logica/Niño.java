package logica;
import java.util.Calendar;

public class Ni�o {
	//parametros
	private String nombre;
	private int documento;
	private Calendar fechaNacimiento;
	private String servicioMedico;
	private String medicoCabecera;
	private boolean tieneFonasa;
	private Registro registros;
	private int cantRegistrosIngresados;

	//contructor
	public Ni�o(String nom,int doc,Calendar fecNac,String serMed,String medCab,boolean tieFon,Registro reg,int canRegIng)
		{
			nombre = nom;
			documento = doc;
			fechaNacimiento = fecNac;
			servicioMedico = serMed;
			medicoCabecera = medCab;
			tieneFonasa = tieFon;
			registros = reg;
			cantRegistrosIngresados = canRegIng;
		
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
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

	public Registro getRegistros() {
		return registros;
	}

	public void setRegistros(Registro registros) {
		this.registros = registros;
	}

	public int getCantRegistrosIngresados() {
		return cantRegistrosIngresados;
	}

	public void setCantRegistrosIngresados(int cantRegistrosIngresados) {
		this.cantRegistrosIngresados = cantRegistrosIngresados;
	}
	
	

}
