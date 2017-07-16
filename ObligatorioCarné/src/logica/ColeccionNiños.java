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
	
	//LISTADO DE NOMBRES
	public String[] listarNombres()
	{
		String[]  lista = new String[topeNi�os] ;
		for(int i = 0; i< topeNi�os; i++)
		{
			lista[i] = arreglo[i].getNombre();
			//System.out.println(lista[i]);
		}
		return lista;
	}
	
	//LISTADO COMPLETO DE NI�OS
	public Ni�o[] listarNi�os()
	{
		Ni�o[] listado = null;
		for (int i = 0;i < topeNi�os; i++)
		{
			listado[i] = arreglo[i];
		}
		
		return listado;
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
