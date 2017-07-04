package logica;
import java.util.Calendar;
//Pendiente de programar
public class Registro {
	private Calendar fecha;//verificar si es int??
	private String comentario;// debe ir en mayuscula es mas apropiado??
	//constructor
	public Registro(Calendar fec, String com){//para mi son nombres muy cortos pierde el sentido de la palabra
		this.fecha = fec;
		this.comentario = com;

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
