package logica;

import java.util.Calendar;

import javax.swing.JOptionPane;

import excepciones.ExisteNinioException;
import excepciones.NoHayLugarException;

public class ColeccionNi�os {
	private Ni�o[] arreglo;
	private Vacuna[] vacunas;
	private int topeNi�os;
	private int maxNi�os;
	private int maxRegistro;
	private int topeRegistro;
	
	public ColeccionNi�os() {

		arreglo = null;
		topeNi�os = 0;
		topeRegistro = 0;
		maxNi�os = 0;
		maxRegistro=0;
	}

	public void configurar(int maximoNi�os, int maximoRegistros) {
		maxNi�os = maximoNi�os;
		topeNi�os = 0;
		arreglo = new Ni�o[maximoNi�os];
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

	public boolean agregar(Ni�o n) throws NoHayLugarException{

boolean resu = false;
		if (topeNi�os == arreglo.length) {
			
         throw new NoHayLugarException("No hay lugar para mas ninios");
		} else {
			
			arreglo[topeNi�os] = n;
	
			topeNi�os++;
			resu = true;
		}
		return resu;
	}
	
	public void agregarVacuna(int cedula, Vacuna vacuna, Calendar fecha, String comentario)throws ExisteNinioException
	{
		if(getDatosNi�o(cedula) != null)
		{
			Ni�o n = getDatosNi�o(cedula);
			RegistroVacuna v = new RegistroVacuna(fecha, comentario, vacuna);
			n.agregar(v);
		}
		else
			throw new ExisteNinioException("No existe el ni�o con esa cedula");

		
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
		Ni�o[] listado = new Ni�o[topeNi�os];
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

	public Ni�o getDatosNi�o(int cedula) {
		int i=0;
		Ni�o ni�o=null;
		while(i<topeNi�os && ni�o==null){
			Ni�o aux=arreglo[i];
			if(aux.getDocumento()==cedula)
				ni�o=aux;
			else
				i++;
		}
		return ni�o;
	}

	public Vacuna[] listadoVacunas() {
		
		return vacunas;
	}

}
