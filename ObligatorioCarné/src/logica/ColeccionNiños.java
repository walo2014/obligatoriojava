package logica;

import javax.swing.JOptionPane;

public class ColeccionNi�os {
	private Ni�o[] arreglo;
	private int topeNi�os;
	private int maxNi�os;
	private int maxRegistro;
	public ColeccionNi�os() {

		arreglo = null;
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


	public boolean agregar(Ni�o n) {


		if (topeNi�os == arreglo.length) {
			return false;

		} else {
			arreglo[topeNi�os] = n;

			topeNi�os++;
			return true;
		}
	}
	
	public String[] listar()
	{
		String[]  resu = new String[topeNi�os] ;
		for(int i = 0; i< topeNi�os; i++)
		{
			resu[i] = arreglo[i].getNombre();
			System.out.println(resu[i] + " posicion "+i);
		}
		return resu;
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
