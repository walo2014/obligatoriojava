package logica;
import java.util.Calendar;
//Pendiente de programar
public class Registro {
	private int fecha;//verificar si es int??
	private String comentario;// debe ir en mayuscula es mas apropiado??
	//constructor
	public Registro(int fecha, String comentario){
		this.fecha = fecha;
		this.comentario = comentario;

	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}

		
		
	}
	
}
