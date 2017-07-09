package logica;

import javax.swing.JOptionPane;

public class ColeccionNi�os {
	private Ni�o[] arreglo;
	private int topeNi�os;
	private int maxNi�os = 0;
	
	public ColeccionNi�os(){
					
		arreglo = new Ni�o[2];
		topeNi�os =0;		
	}
	
	public void agregar(Ni�o n){
		
		if (topeNi�os == arreglo.length)
		{
		JOptionPane.showMessageDialog(null, "Ya no puede ingresar mas ni�os al sistema","ERROR" ,JOptionPane.ERROR_MESSAGE);
		}else{
		arreglo[topeNi�os] = n;
		System.out.println("AGREGADO EL NI�O "+ n.getNombre() +" en la posicion "+topeNi�os);
		JOptionPane.showMessageDialog(null, "El ni�o ha sido ingresado al sistema correctamente");
		topeNi�os++;
		}
	}

	public int getMaxNi�os() {
		return maxNi�os;
	}

	public void setMaxNi�os(int maxNi�os) {
		this.maxNi�os = maxNi�os;		
		System.out.println("La cantidad maxima de ni�os es ahora: " + maxNi�os);
	}

	
	

}
