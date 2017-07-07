package logica;

public class ColeccionNiños {
	
	
	private Niño[] arreglo;
	private int topeNiños;
	
	public ColeccionNiños(int maxNiños){
					
		arreglo = new Niño[maxNiños];
		topeNiños =0;		
	}
	
	public void agregar(Niño n){
		
		arreglo[topeNiños] = n;
		topeNiños++;
		
	}

	public Niño[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(Niño[] arreglo) {
		this.arreglo = arreglo;
	}

	public int getTopeNiños() {
		return topeNiños;
	}

	public void setTopeNiños(int topeNiños) {
		this.topeNiños = topeNiños;
	}
	
	

}
