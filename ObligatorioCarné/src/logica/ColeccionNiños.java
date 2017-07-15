package logica;

import javax.swing.JOptionPane;

public class ColeccionNiños {
	private Niño[] arreglo;
	private int topeNiños;
	private int maxNiños;
	private int maxRegistro;
	public ColeccionNiños() {

		arreglo = null;
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


	public boolean agregar(Niño n) {


		if (topeNiños == arreglo.length) {
			return false;

		} else {
			arreglo[topeNiños] = n;

			topeNiños++;
			return true;
		}
	}
	
	public Niño[] listarNiños(){
		Niño listado[] = null;
		
		for (int i =0;i < topeNiños;i++){
			listado[i] = arreglo[i];
		}
		return listado;
		
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
