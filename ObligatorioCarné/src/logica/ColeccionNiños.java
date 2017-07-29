package logica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import excepciones.ExisteNinioException;
import excepciones.NoHayLugarException;

public class ColeccionNi�os implements Serializable{
	//se agrego atributos
	private Ni�o[] arreglo;
	private Vacuna[] vacunas;
	private int topeNi�os;
	private int maxNi�os;
	private int maxRegistro;
	private int topeRegistro;
	
	//constructor
	public ColeccionNi�os() {

		arreglo = null;
		topeNi�os = 0;
		topeRegistro = 0;
		maxNi�os = 0;
		maxRegistro=0;
	}
	//persistencia

	public void guardarArchivo() throws IOException{
		//Apertura de archivo persistencia
		FileOutputStream archivo=new FileOutputStream("sistema.mml");
		//comunicacion del codigo al disco
		ObjectOutputStream escritor = new ObjectOutputStream(archivo);
		escritor.writeObject(this);
		escritor.close();
		
	}
	
	     //recuperar archivo
	public ColeccionNi�os leerArchivo() throws IOException, ClassNotFoundException{
		
		FileInputStream archivo=new FileInputStream("sistema.mml");
		//comunicacion del disco al codigo
		ObjectInputStream escritor = new ObjectInputStream(archivo);
		ColeccionNi�os col=(ColeccionNi�os)escritor.readObject();
		escritor.close();
		
		return col;
	}
	
	//inicio sistema determinar maximos ni�os y registros
	public void configurar(int maximoNi�os, int maximoRegistros) {
		maxNi�os = maximoNi�os;
		topeNi�os = 0;
		arreglo = new Ni�o[maximoNi�os];
		maxRegistro=maximoRegistros;
		

	}

    
    //guardar ni�o en el sistema
	public boolean agregar(Ni�o n) throws NoHayLugarException,Exception{

        boolean resu = false;
		if (topeNi�os == arreglo.length) {
			
         throw new NoHayLugarException("No hay lugar para mas ninios");
		} else {
			//la cedula no sea igual
			if(getDatosNi�o(n.getDocumento())==null){
				arreglo[topeNi�os] = n;
		
				topeNi�os++;
				resu = true;
			}
			else{
				//mensaje
				throw new Exception("La cedula ya existe");
			}
		}
		return resu;
	}
	//guardar vacuna en el sistema
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
	//guardar control en el sistema
	public void agregarControl(int cedula, Calendar fecha, String comentario, Double peso, Double altura)throws ExisteNinioException
	{
		if(getDatosNi�o(cedula) != null)
		{
			Ni�o n = getDatosNi�o(cedula);
			Control c = new Control(fecha, comentario, peso, altura);
			n.agregar(c);
		}
		else
			throw new ExisteNinioException("No existe el ni�o con esa cedula");
		
	}
	//guardar consulta en el sistema
	public void agregarConsulta(int cedula, Calendar fecha, String comentario, String medico, String diagnostico, String recomendaciones)throws ExisteNinioException
	{
		if(getDatosNi�o(cedula) != null)
		{
			Ni�o n = getDatosNi�o(cedula);
			Consulta c = new Consulta(fecha, comentario, medico, diagnostico, recomendaciones);
			n.agregar(c);
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
		Ni�o[] copia = new Ni�o[topeNi�os];
		for (int i = 0;i < topeNi�os; i++)
		{
			copia[i] = arreglo[i];
		}
		return copia;
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
	
	public int cantidadConsultasAntesFecha(Calendar fecha){
		int cantidad=0;
		for(int i=0;i<topeNi�os;i++){
			Ni�o ni�o=arreglo[i];
			cantidad=cantidad+ni�o.cantidadConsultasAntesFecha(fecha);
		}
		return cantidad;
	}

}
