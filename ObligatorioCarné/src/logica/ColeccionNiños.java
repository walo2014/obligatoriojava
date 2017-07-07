package logica;

public class ColeccionNi�os {
	
	
	private Ni�o[] arreglo;
	private int topeNi�os;
	
	public ColeccionNi�os(int maxNi�os){
					
		arreglo = new Ni�o[maxNi�os];
		topeNi�os =0;		
	}
	
	public void agregar(Ni�o n){
		
		arreglo[topeNi�os] = n;
		topeNi�os++;
		
	}

	public Ni�o[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(Ni�o[] arreglo) {
		this.arreglo = arreglo;
	}

	public int getTopeNi�os() {
		return topeNi�os;
	}

	public void setTopeNi�os(int topeNi�os) {
		this.topeNi�os = topeNi�os;
	}
	
	

}
