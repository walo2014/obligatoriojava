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

public class ColeccionNiños implements Serializable{
	//se agrego atributos
	private Niño[] arreglo;
	private Vacuna[] vacunas;
	private int topeNiños;
	private int maxNiños;
	private int maxRegistro;
	private int topeRegistro;
	
	//constructor
	public ColeccionNiños() {

		arreglo = null;
		topeNiños = 0;
		topeRegistro = 0;
		maxNiños = 0;
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
	public ColeccionNiños leerArchivo() throws IOException, ClassNotFoundException{
		
		FileInputStream archivo=new FileInputStream("sistema.mml");
		//comunicacion del disco al codigo
		ObjectInputStream escritor = new ObjectInputStream(archivo);
		ColeccionNiños col=(ColeccionNiños)escritor.readObject();
		escritor.close();
		
		return col;
	}
	
	//inicio sistema determinar maximos niños y registros
	public void configurar(int maximoNiños, int maximoRegistros) {
		maxNiños = maximoNiños;
		topeNiños = 0;
		arreglo = new Niño[maximoNiños];
		maxRegistro=maximoRegistros;
		

	}

    
    //guardar niño en el sistema
	public boolean agregar(Niño n) throws NoHayLugarException,Exception{

        boolean resu = false;
		if (topeNiños == arreglo.length) {
			
         throw new NoHayLugarException("No hay lugar para mas ninios");
		} else {
			//la cedula no sea igual
			if(getDatosNiño(n.getDocumento())==null){
				arreglo[topeNiños] = n;
		
				topeNiños++;
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
		if(getDatosNiño(cedula) != null)
		{
			Niño n = getDatosNiño(cedula);
			RegistroVacuna v = new RegistroVacuna(fecha, comentario, vacuna);
			n.agregar(v);
		}
		else
			throw new ExisteNinioException("No existe el niño con esa cedula");

		
	}
	//guardar control en el sistema
	public void agregarControl(int cedula, Calendar fecha, String comentario, Double peso, Double altura)throws ExisteNinioException
	{
		if(getDatosNiño(cedula) != null)
		{
			Niño n = getDatosNiño(cedula);
			Control c = new Control(fecha, comentario, peso, altura);
			n.agregar(c);
		}
		else
			throw new ExisteNinioException("No existe el niño con esa cedula");
		
	}
	//guardar consulta en el sistema
	public void agregarConsulta(int cedula, Calendar fecha, String comentario, String medico, String diagnostico, String recomendaciones)throws ExisteNinioException
	{
		if(getDatosNiño(cedula) != null)
		{
			Niño n = getDatosNiño(cedula);
			Consulta c = new Consulta(fecha, comentario, medico, diagnostico, recomendaciones);
			n.agregar(c);
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
		Niño[] copia = new Niño[topeNiños];
		for (int i = 0;i < topeNiños; i++)
		{
			copia[i] = arreglo[i];
		}
		return copia;
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
	
	public int cantidadConsultasAntesFecha(Calendar fecha){
		int cantidad=0;
		for(int i=0;i<topeNiños;i++){
			Niño niño=arreglo[i];
			cantidad=cantidad+niño.cantidadConsultasAntesFecha(fecha);
		}
		return cantidad;
	}

}
