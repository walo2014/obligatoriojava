package logica;

public class ColeccionNi�os {
	private Ni�o[] arreglo;
	private int topeNi�os;
	
	public ColeccionNi�os(){
					
		arreglo = new Ni�o[5];
		topeNi�os =0;		
	}
	
	public void agregar(Ni�o n){
		
		arreglo[topeNi�os] = n;
		System.out.println("AGREGADO EL NI�O "+ n.getNombre() +" en la posicion "+topeNi�os);
		
		topeNi�os++;
		
	}

	
	

}
