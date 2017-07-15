package logica;

import javax.swing.JOptionPane;

public class ColeccionNi�os {
	private Ni�o[] arreglo;

	private int topeNi�os;
	private int maxNi�os;
	private int maxRegistro;
	public ColeccionNi�os() {

		arreglo = null;
		// arreglo = new Ni�o[2];
		topeNi�os = 0;
		maxNi�os = 0;
		maxRegistro=0;
	}

	public void configurar(int maximoNi�os, int maximoRegistros) {
		maxNi�os = maximoNi�os;
		topeNi�os = 0;
		arreglo = new Ni�o[maximoNi�os];
		maxRegistro=maximoRegistros;

	}

	//Profe: no deberia haber sido boolean
	public boolean agregar(Ni�o n) {

		// Se tiene que mostrar en la interfaz grafica la pantalla
		if (topeNi�os == arreglo.length) {
			return false;
			// JOptionPane.showMessageDialog(null, "Ya no puede ingresar mas
			// ni�os al sistema","ERROR" ,JOptionPane.ERROR_MESSAGE);
		} else {
			arreglo[topeNi�os] = n;
			//System.out.println("AGREGADO EL NI�O " + n.getNombre() + " en la posicion " + topeNi�os);
			//JOptionPane.showMessageDialog(null, "El ni�o ha sido ingresado al sistema correctamente");
			topeNi�os++;
			return true;
		}
	}
	
	public String[] listarNi�os(){
		
				{
					String[]  listaNi�os = new String[topeNi�os] ;
					for(int i = 0; i< topeNi�os; i++)
					{
						listaNi�os[i] = arreglo[i].getNombre();
						System.out.println(listaNi�os[i] + " posicion "+i);
					}
					return listaNi�os;
		}
		
	}

	public int getMaxNi�os() {
		return maxNi�os;
	}

	public void setMaxNi�os(int maxNi�os) {
		this.maxNi�os = maxNi�os;
		//System.out.println("La cantidad maxima de ni�os es ahora: " + maxNi�os);
	}

	public int getMaxRegistro() {
		
		return maxRegistro;
	}

}
