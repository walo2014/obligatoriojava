package logica;
//metodo pra vacunar


import java.util.Calendar;

public class Vacuna{
	
	//Parametros
	private String nombre;
	
	private boolean meses[];
	private boolean esObligatoria;
	
	public Vacuna(String nombre, boolean esObligatoria) 
	{
		
		this.nombre = nombre;
		
		this.esObligatoria = esObligatoria;
		meses=new boolean[11];
	}
	
   //metodos selectores y modificadores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarMes(int mes){
		meses[mes]=true;
	}
	
	public boolean isEsObligatoria() {
		return esObligatoria;
	}

	public void setEsObligatoria(boolean esObligatoria) {
		this.esObligatoria = esObligatoria;
	}

	public String mostrarRegistro() {
		String obligatorio=" no es obligatorio";
		if(esObligatoria)
			obligatorio=" es obligatorio";
		return " Nombre : "+this.nombre+" Dosis : 4 La vacuna"+obligatorio;
	}

	
	private static int posMes(int mes){
		if(mes<=6)
			return mes;
		else
			if(mes==12)
				return 7;
			else
				if(mes==15)
					return 8;
				else
					if(mes==21)
						return 9;
					else
						if(mes==60)
							return 10;
						else
							return -1;
	}
	public boolean corresponde(int mes) {
		int pos=posMes(mes);
		if(pos==-1)
			return false;
		else
			return meses[pos];
	}

	public static boolean hayVacunacion(int mes) {
		if(posMes(mes)==-1)
			return false;
		else
			return true;
	}
	public String toString(){
		return nombre;
	}
}
