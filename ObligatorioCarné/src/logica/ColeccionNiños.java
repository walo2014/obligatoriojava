package logica;

import javax.swing.JOptionPane;

public class ColeccionNiños {
	private Niño[] arreglo;
	private int topeNiños;
	private int maxNiños = 0;
	
	public ColeccionNiños(){
					
		arreglo = new Niño[2];
		topeNiños =0;		
	}
	
	public void agregar(Niño n){
		
		if (topeNiños == arreglo.length)
		{
		JOptionPane.showMessageDialog(null, "Ya no puede ingresar mas niños al sistema","ERROR" ,JOptionPane.ERROR_MESSAGE);
		}else{
		arreglo[topeNiños] = n;
		System.out.println("AGREGADO EL NIÑO "+ n.getNombre() +" en la posicion "+topeNiños);
		JOptionPane.showMessageDialog(null, "El niño ha sido ingresado al sistema correctamente");
		topeNiños++;
		}
	}

	public int getMaxNiños() {
		return maxNiños;
	}

	public void setMaxNiños(int maxNiños) {
		this.maxNiños = maxNiños;		
		System.out.println("La cantidad maxima de niños es ahora: " + maxNiños);
	}

	
	

}
