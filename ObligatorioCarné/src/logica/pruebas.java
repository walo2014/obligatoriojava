package logica;

import java.util.Calendar;

import javax.swing.JOptionPane;

import excepciones.NoHayLugarException;
import grafica.VentanaPrincipal;

public class pruebas {

	public static void main(String[] args) {
		ColeccionNi�os coleccion = new ColeccionNi�os();
		
		//carga de configuracion inicial
		coleccion.configurar(1, 2);
			
		//hol
		//carga de un ni�o de prueba1
		Calendar fechaNacimiento = Calendar.getInstance();
		String nombre = "Nombre de prueba";
		int documento = 5675675;
		//Cargo variables con los datos de la fecha
		int dia = Integer.parseInt("1");
		int mes = Integer.parseInt("1");
		int a�o = Integer.parseInt("1990");				
		fechaNacimiento.set(Calendar.DAY_OF_MONTH, dia);
		fechaNacimiento.set(Calendar.MONTH, mes);
		fechaNacimiento.set(Calendar.YEAR, a�o);
		String servicioMedico = "servicioMedico";
		String medicoCabecera = "Medico";
		boolean fonasa = true;
				
		Ni�o ni = new Ni�o(nombre, documento, fechaNacimiento, servicioMedico, medicoCabecera, fonasa,coleccion.getMaxRegistro());

		try {
			boolean valido=coleccion.agregar(ni);
		} catch (NoHayLugarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Listo ni�o		
		coleccion.listarNombres();
		
	}

}
