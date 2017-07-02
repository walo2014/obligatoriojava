package logica;
import java.util.Calendar;

public class Niño {
	//parametros
	private String nombre;
	private int documento;
	private Calendar fechaNacimiento;
	private String servicioMedico;
	private String medicoCabecera;
	private boolean tieneFonasa;
	private Registro registros;
	private int cantRegistrosIngresados;

	public Niño(String nom,int doc,Calendar fecNac,String serMed,String medCab,boolean tieFon,Registro reg,int canRegIng)
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
	
	

}
