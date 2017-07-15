package logica;

import javax.swing.JOptionPane;

public class ColeccionNiños {
	private Niño[] arreglo;

	private int topeNiños;
	private int maxNiños;
	private int maxRegistro;
	public ColeccionNiños() {

		arreglo = null;
		// arreglo = new Niño[2];
		topeNiños = 0;
		maxNiños = 0;
		maxRegistro=0;
	}

	public void configurar(int maximoNiños, int maximoRegistros) {
		maxNiños = maximoNiños;
		topeNiños = 0;
		arreglo = new Niño[maximoNiños];
		maxRegistro=maximoRegistros;

	}

	//Profe: no deberia haber sido boolean
	public boolean agregar(Niño n) {

		// Se tiene que mostrar en la interfaz grafica la pantalla
		if (topeNiños == arreglo.length) {
			return false;
			// JOptionPane.showMessageDialog(null, "Ya no puede ingresar mas
			// niños al sistema","ERROR" ,JOptionPane.ERROR_MESSAGE);
		} else {
			arreglo[topeNiños] = n;
			//System.out.println("AGREGADO EL NIÑO " + n.getNombre() + " en la posicion " + topeNiños);
			//JOptionPane.showMessageDialog(null, "El niño ha sido ingresado al sistema correctamente");
			topeNiños++;
			return true;
		}
	}
	
	public String[] listarNiños(){
		
				{
					String[]  listaNiños = new String[topeNiños] ;
					for(int i = 0; i< topeNiños; i++)
					{
						listaNiños[i] = arreglo[i].getNombre();
						System.out.println(listaNiños[i] + " posicion "+i);
					}
					return listaNiños;
		}
		
	}

	public int getMaxNiños() {
		return maxNiños;
	}

	public void setMaxNiños(int maxNiños) {
		this.maxNiños = maxNiños;
		//System.out.println("La cantidad maxima de niños es ahora: " + maxNiños);
	}

	public int getMaxRegistro() {
		
		return maxRegistro;
	}

}
