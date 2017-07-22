package logica;

import java.util.Calendar;

import javax.swing.JOptionPane;

import excepciones.ExisteNinioException;
import excepciones.NoHayLugarException;

public class ColeccionNiños {
	private Niño[] arreglo;
	private Vacuna[] vacunas;
	private int topeNiños;
	private int maxNiños;
	private int maxRegistro;
	private int topeRegistro;
	
	public ColeccionNiños() {

		arreglo = null;
		topeNiños = 0;
		topeRegistro = 0;
		maxNiños = 0;
		maxRegistro=0;
	}

	public void configurar(int maximoNiños, int maximoRegistros) {
		maxNiños = maximoNiños;
		topeNiños = 0;
		arreglo = new Niño[maximoNiños];
		maxRegistro=maximoRegistros;
		inicializarSistemaVacuna();

	}


	private void inicializarSistemaVacuna() {
		vacunas=new Vacuna[2];
		
		//BCG
		Vacuna BCG=new Vacuna("BCG",true);
		BCG.agregarMes(0);
		
		
		//PentaValente
		Vacuna pentavalente=new Vacuna("Pentavalente",true);
		pentavalente.agregarMes(2);
		pentavalente.agregarMes(4);
		pentavalente.agregarMes(6);
		pentavalente.agregarMes(8);
		
		//Guarda
		vacunas[0]=BCG;
		vacunas[1]=pentavalente;
		
		//resto
		
	}

	public boolean agregar(Niño n) throws NoHayLugarException{

boolean resu = false;
		if (topeNiños == arreglo.length) {
			
         throw new NoHayLugarException("No hay lugar para mas ninios");
		} else {
			
			arreglo[topeNiños] = n;
	
			topeNiños++;
			resu = true;
		}
		return resu;
	}
	
	public void agregarVacuna(int cedula, Vacuna vacuna, Calendar fecha, String comentario)throws ExisteNinioException
	{
		if(getDatosNiño(cedula) != null)
		{
			Niño n = getDatosNiño(cedula);
			RegistroVacuna v = new RegistroVacuna(fecha, comentario, vacuna);
			n.agregar(v);
		}
		else
			throw new ExisteNinioException("No existe el niño con esa cedula");

		
	}
	
	//LISTADO DE NOMBRES
	public String[] listarNombres()
	{
		String[]  lista = new String[topeNiños] ;
		for(int i = 0; i< topeNiños; i++)
		{
			lista[i] = arreglo[i].getNombre();
			//System.out.println(lista[i]);
		}
		return lista;
	}
	
	//LISTADO COMPLETO DE NIÑOS
	public Niño[] listarNiños()
	{
		Niño[] listado = new Niño[topeNiños];
		for (int i = 0;i < topeNiños; i++)
		{
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

	public Niño getDatosNiño(int cedula) {
		int i=0;
		Niño niño=null;
		while(i<topeNiños && niño==null){
			Niño aux=arreglo[i];
			if(aux.getDocumento()==cedula)
				niño=aux;
			else
				i++;
		}
		return niño;
	}

	public Vacuna[] listadoVacunas() {
		
		return vacunas;
	}

}
