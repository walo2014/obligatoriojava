package logica;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Niño implements Serializable{
	// parametros
	private String nombre;
	private int documento;
	private Calendar fechaNacimiento;
	private String servicioMedico;
	private String medicoCabecera;
	private boolean tieneFonasa;

	private Registro[] registros;
	private int tope;

	// contructor
	public Niño(String nom, int doc, Calendar fecNac, String serMed, String medCab, boolean tieFon,
			int cantidadRegistro) {

		nombre = nom;
		documento = doc;
		fechaNacimiento = fecNac;
		servicioMedico = serMed;
		medicoCabecera = medCab;
		tieneFonasa = tieFon;
		registros = new Registro[cantidadRegistro];
		tope = 0;
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
	
	public String getFechaNacimientoString() {
		String fecha;
	
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH);
		int año = fechaNacimiento.get(Calendar.YEAR);
		
		fecha = dia + "/" + mes + "/" + año;
		return fecha;
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

	// Recuperar y mostrar en el futuro registro

	public boolean agregar(Registro registro) {
		boolean guardo = false;

		if (tope < registros.length) {
			registros[tope] = registro;
			guardo = true;
			tope++;
		}
		return guardo;
	}

	public int edadMeses() {
		int cuantosMeses = 0;
		Calendar hoy = Calendar.getInstance();
		Calendar copia = (Calendar) fechaNacimiento.clone();
		while (copia.before(hoy)) {
			cuantosMeses++;
			copia.add(Calendar.MONTH, 1);
		}
		return cuantosMeses;
	}

	private Vacuna[] listadoVacunasDadas() {
		Vacuna[] vacunas = new Vacuna[100];
		int hasta = 0;
		for (int i = 0; i < tope; i++) {
			Registro registro = registros[i];
			if (registro instanceof RegistroVacuna) {
				RegistroVacuna rv = (RegistroVacuna) registro;
				vacunas[hasta] = rv.getVacuna();
				hasta++;
			}
		}

		Vacuna[] copia = new Vacuna[hasta];
		for (int i = 0; i < tope; i++) {
			copia[i] = vacunas[i];
		}
		return copia;
	}

	public Vacuna[] listadoVacunas() {
		int j = 0;
		Vacuna[] vacunas = new Vacuna[100];

		for (int i = 0; i < registros.length; i++) {
			Registro registro = registros[i];
			if (registro instanceof RegistroVacuna) {
				RegistroVacuna rv = (RegistroVacuna) registro;
				vacunas[j]=rv.getVacuna();
				j++;
			}
			
		}
		Vacuna[] copia = new Vacuna[j];
		for (int i = 0; i < j; i++) {
			copia[i] = vacunas[i];
		}
		return copia;
	}

	

	public String toString() {
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH);
		int año = fechaNacimiento.get(Calendar.YEAR);

		return "Nombre: " + nombre + " Documento: " + documento + " Fecha de Nacimiento: " + dia + "/" + mes + "/"
				+ año;
	}
	public String toStringCompleto() {
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH);
		int año = fechaNacimiento.get(Calendar.YEAR);

		return "Nombre: " + nombre + " Documento: " + documento + " Fecha de Nacimiento: " + dia + "/" + mes + "/"
				+ año + " Servicio Medico: " + servicioMedico;
	}

	public Registro[] listadoRegistro() {
		
		Registro[] copia = new Registro[tope];
		for (int i = 0; i < tope; i++) {
			copia[i] = registros[i];
		}
		return copia;
	}
	
//La letra F
	public int cantidadConsultasAntesFecha(Calendar fecha) {
		int contador=0;
		for(int i=0;i<tope;i++)
		{
			Registro registro=registros[i];
			if(registro instanceof Consulta)
				if(registro.getFecha().before(fecha))
					contador++;
		}
		return contador;
	}
}
