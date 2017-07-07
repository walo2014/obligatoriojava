package logica;

public class ColeccionNiños {
	private Niño[] arreglo;
	private int topeNiños;
	
	public ColeccionNiños(){
					
		arreglo = new Niño[5];
		topeNiños =0;		
	}
	
	public void agregar(Niño n){
		
		arreglo[topeNiños] = n;
		System.out.println("AGREGADO EL NIÑO "+ n.getNombre() +" en la posicion "+topeNiños);
		
		topeNiños++;
		
	}

	
	

}
