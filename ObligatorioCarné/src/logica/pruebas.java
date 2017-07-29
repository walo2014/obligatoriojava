package logica;

import java.util.Calendar;

import javax.swing.JOptionPane;

import excepciones.NoHayLugarException;
import grafica.VentanaPrincipal;

public class pruebas {

	public static void main(String[] args) {
		ColeccionNiños coleccion = new ColeccionNiños();
		
		//carga de configuracion inicial
		coleccion.configurar(1, 2);
			
		//hol
		//carga de un niño de prueba1
		Calendar fechaNacimiento = Calendar.getInstance();
		String nombre = "Nombre de prueba";
		int documento = 5675675;
		//Cargo variables con los datos de la fecha
		int dia = Integer.parseInt("1");
		int mes = Integer.parseInt("1");
		int año = Integer.parseInt("1990");				
		fechaNacimiento.set(Calendar.DAY_OF_MONTH, dia);
		fechaNacimiento.set(Calendar.MONTH, mes);
		fechaNacimiento.set(Calendar.YEAR, año);
		String servicioMedico = "servicioMedico";
		String medicoCabecera = "Medico";
		boolean fonasa = true;
				
		Niño ni = new Niño(nombre, documento, fechaNacimiento, servicioMedico, medicoCabecera, fonasa,coleccion.getMaxRegistro());

		try {
			boolean valido=coleccion.agregar(ni);
		} catch (NoHayLugarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Listo niño		
		coleccion.listarNombres();
		
	}

}
